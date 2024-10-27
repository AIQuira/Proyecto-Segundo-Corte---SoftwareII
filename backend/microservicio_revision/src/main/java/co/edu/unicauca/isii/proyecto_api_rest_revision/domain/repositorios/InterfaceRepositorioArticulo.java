package co.edu.unicauca.isii.proyecto_api_rest_revision.domain.repositorios;

import co.edu.unicauca.isii.proyecto_api_rest_revision.domain.Articulo;
import java.util.List;

public interface InterfaceRepositorioArticulo {
    public boolean almacenarArticulo(Articulo objArticulo);
    public List<Articulo> listarArticulos();
    public boolean eliminarArticulo(int idArticulo);
    public Articulo consultarArticulo(int idArticulo);
    public boolean actualizarArticulo(Articulo objArticulo);
}
