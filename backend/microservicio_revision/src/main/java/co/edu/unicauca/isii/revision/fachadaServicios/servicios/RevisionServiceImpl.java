package co.edu.unicauca.isii.revision.fachadaServicios.servicios;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import co.edu.unicauca.isii.revision.capaAccesoADatos.modelo.RevisionEntity;
import co.edu.unicauca.isii.revision.capaAccesoADatos.repositorios.RevisionRepository;
import co.edu.unicauca.isii.revision.fachadaServicios.DTO.RevisionDTO;

@Service
public class RevisionServiceImpl implements IRevisionService {
    
    private RevisionRepository revisionRepository;

    private ModelMapper modelMapper;

    public RevisionServiceImpl(RevisionRepository revisionRepository, ModelMapper modelMapper) {
        this.revisionRepository = revisionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public RevisionDTO guardarRevision(RevisionDTO revision) {
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
}
