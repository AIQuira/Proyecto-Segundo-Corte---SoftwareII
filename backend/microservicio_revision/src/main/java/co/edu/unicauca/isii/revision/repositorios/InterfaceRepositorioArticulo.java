package co.edu.unicauca.isii.revision.repositorios;

import co.edu.unicauca.isii.revision.modelo.Articulo;
import java.util.List;

public interface InterfaceRepositorioArticulo {
    public boolean almacenarArticulo(Articulo objArticulo);
    public List<Articulo> listarArticulos();
    public boolean eliminarArticulo(int idArticulo);
    public Articulo consultarArticulo(int idArticulo);
    public boolean actualizarArticulo(Articulo objArticulo);
}
