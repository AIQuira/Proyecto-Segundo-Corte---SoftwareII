package co.edu.unicauca.isii.revision.capaAccesoADatos.repositorios;

import java.util.List;

import co.edu.unicauca.isii.revision.capaAccesoADatos.modelo.RevisorEntity;

public interface InterfaceRepositorioRevisor {
    public boolean almacenarRevisores(RevisorEntity objRevisor);
    public List<RevisorEntity> listarRevisores();
}
