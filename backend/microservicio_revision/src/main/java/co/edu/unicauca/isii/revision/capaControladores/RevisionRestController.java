package co.edu.unicauca.isii.revision.capaControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.isii.revision.fachadaServicios.DTO.RevisionDTO;
import co.edu.unicauca.isii.revision.fachadaServicios.servicios.IRevisionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RevisionRestController {
    
    @Autowired
    private IRevisionService revisionService;

    @PostMapping("/revision")
    public RevisionDTO crearRevision(@RequestBody RevisionDTO revision) {
        RevisionDTO objRevision = null;
        objRevision = this.revisionService.guardarRevision(revision);
        return objRevision;
    }

    @GetMapping("/revision")
    public List<RevisionDTO> listarRevisiones() {
        return this.revisionService.listarRevisiones();
    }
    

}
