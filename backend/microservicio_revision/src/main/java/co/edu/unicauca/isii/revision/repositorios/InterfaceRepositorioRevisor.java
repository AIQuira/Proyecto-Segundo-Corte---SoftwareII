package co.edu.unicauca.isii.revision.repositorios;

import co.edu.unicauca.isii.revision.modelo.Revisor;
import java.util.List;

public interface InterfaceRepositorioRevisor {
    public boolean almacenarRevisores(Revisor objRevisor);
    public List<Revisor> listarRevisores();
}
