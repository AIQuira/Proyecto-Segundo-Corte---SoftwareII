package co.edu.unicauca.isii.revision.fachadaServicios.servicios;

import java.util.List;
import co.edu.unicauca.isii.revision.fachadaServicios.DTO.RevisionDTO;

public interface IRevisionService {

    public RevisionDTO guardarRevision(RevisionDTO revision);
    public List<RevisionDTO> listarRevisiones();
}
