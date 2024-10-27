package co.edu.unicauca.isii.proyecto_api_rest_revision.domain.repositorios;

import co.edu.unicauca.isii.proyecto_api_rest_revision.domain.Revisor;
import java.util.List;

public interface InterfaceRepositorioRevisor {
    public boolean almacenarRevisores(Revisor objRevisor);
    public List<Revisor> listarRevisores();
}
