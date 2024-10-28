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
    private ArticuloService articuloService; // Servicio para interactuar con el microservicio de artículos
    private ModelMapper modelMapper;

    public RevisionServiceImpl(RevisionRepository revisionRepository, ArticuloService articuloService, ModelMapper modelMapper) {
        this.revisionRepository = revisionRepository;
        this.articuloService = articuloService;
        this.modelMapper = modelMapper;
    }

    @Override
    public RevisionDTO guardarRevision(RevisionDTO revision) {
        calificarArticulo(revision);
        RevisionEntity revisionEntity = this.modelMapper.map(revision, RevisionEntity.class);
        RevisionEntity objRevisionEntity = this.revisionRepository.guardarRevision(revisionEntity);
        return this.modelMapper.map(objRevisionEntity, RevisionDTO.class);
    }

    @Override
    public List<RevisionDTO> listarRevisiones() {
        List<RevisionEntity> listaRevisiones = this.revisionRepository.listarRevisiones();
        return this.modelMapper.map(listaRevisiones, new TypeToken<List<RevisionDTO>>() {}.getType());
    }

    @Override
    public List<ArticuloDTO> listarArticulosDeRevisor(Integer idRevisor) {
        return this.articuloService.listarArticulosDeRevisor(idRevisor);
    }

    @Override
    public boolean calificarArticulo(Integer id, int calificacion) {
        ArticuloDTO articulo = this.articuloService.consultarArticuloDTO(id);
        if (articulo != null) {
            articulo.setCalificacion(calificacion);
            this.articuloService.actualizarArticuloDTO(articulo, id);
            return true;
        }
        return false;
    }
}
