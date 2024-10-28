package co.edu.unicauca.isii.revision.capaAccesoADatos.repositorios;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.isii.revision.capaAccesoADatos.modelo.Estado;
import co.edu.unicauca.isii.revision.capaAccesoADatos.modelo.RevisionEntity;

@Repository
public class RevisionRepository {
    
    ArrayList<RevisionEntity> listaRevisiones;

    public RevisionRepository() {
        this.listaRevisiones = new ArrayList<>();
        cargarRevisiones();
    }

    public RevisionEntity guardarRevision(RevisionEntity revision) {
        System.out.println("Invocando a guardar revisión de un articulo");
        RevisionEntity objRevision = null;
        if (this.listaRevisiones.add(revision)) {
            objRevision = revision;
        }
        
        return objRevision;
    }

    public ArrayList<RevisionEntity> listarRevisiones() {
        System.out.println("Invocando a listar revisiones");
        return this.listaRevisiones;
    }

    private void cargarRevisiones() {
        RevisionEntity revision1 = new RevisionEntity(1, 1, 1, Estado.RECIBIDO, 0, 0, 0, 0, "Revisión inicial");
        this.listaRevisiones.add(revision1);

        RevisionEntity revision2 = new RevisionEntity(2, 2, 2, Estado.RECIBIDO, 0, 0, 0, 0, "Revisión inicial");
        this.listaRevisiones.add(revision2);

        RevisionEntity revision3 = new RevisionEntity(3, 3, 1, Estado.RECIBIDO, 0, 0, 0, 0, "Revisión inicial");
        this.listaRevisiones.add(revision3);
    }
}
