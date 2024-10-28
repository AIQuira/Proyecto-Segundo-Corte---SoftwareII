package co.edu.unicauca.isii.revision.fachadaServicios.servicios;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import co.edu.unicauca.isii.revision.capaAccesoADatos.modelo.RevisionEntity;
import co.edu.unicauca.isii.revision.capaAccesoADatos.repositorios.RevisionRepository;
import co.edu.unicauca.isii.revision.fachadaServicios.DTO.RevisionDTO;
import co.edu.unicauca.isii.revision.fachadaServicios.DTO.RevisorConArticulos.ArticuloDTO;

@Service
public class RevisionServiceImpl implements IRevisionService {
    
    private RevisionRepository revisionRepository;
    private ArticuloService servicioConsumirObtencionArticulo;

    private ModelMapper modelMapper;

    public RevisionServiceImpl(RevisionRepository revisionRepository, ArticuloService servicioConsumirObtencionArticulo, ModelMapper modelMapper) {
        this.revisionRepository = revisionRepository;
        this.servicioConsumirObtencionArticulo = servicioConsumirObtencionArticulo;
        this.modelMapper = modelMapper;
    }

    @Override
    public RevisionDTO guardarRevision(RevisionDTO revision) {
        calificarArticulo(revision);
        RevisionEntity revisionEntity = this.modelMapper.map(revision, RevisionEntity.class);
        RevisionEntity objRevisionEntity = this.revisionRepository.guardarRevision(revisionEntity);
        RevisionDTO revisionDTO = this.modelMapper.map(objRevisionEntity, RevisionDTO.class);
        return revisionDTO;
    }

    @Override
    public List<RevisionDTO> listarRevisiones() {
        List<RevisionEntity> listaRevisiones = this.revisionRepository.listarRevisiones();
        List<RevisionDTO> listaRevisionesDTO = this.modelMapper.map(listaRevisiones, new TypeToken<List<RevisionDTO>>(){
        }.getType());
        return listaRevisionesDTO;
    }

    @Override
    public List<ArticuloDTO> listarArticulosDeRevisor(Integer idRevisor) {
        List<ArticuloDTO> listaArticulos = this.servicioConsumirObtencionArticulo.listarArticulosDeRevisor(idRevisor);
        return listaArticulos;
    }

    public RevisionDTO calificarArticulo (RevisionDTO revision) {
        System.out.println("Invocando a calificar un artículo");

        ArticuloDTO articulo = this.servicioConsumirObtencionArticulo.consultarArticuloDTO(revision.getArticuloId());

        articulo.setCalificacionTitulo(revision.getCalificacionTitulo());
        articulo.setCalificacionDescripcion(revision.getCalificacionDescripcion());
        articulo.setCalificacionResumen(revision.getCalificacionResumen());
        articulo.setCalificacionKeyword(revision.getCalificacionKeyword());

        this.servicioConsumirObtencionArticulo.actualizarArticuloDTO(articulo, articulo.getIdArticulo());

        return revision;
    }
}
