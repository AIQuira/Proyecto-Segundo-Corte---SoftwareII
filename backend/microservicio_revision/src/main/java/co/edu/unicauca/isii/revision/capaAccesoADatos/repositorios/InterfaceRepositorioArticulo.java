package co.edu.unicauca.isii.revision.capaAccesoADatos.repositorios;

import java.util.List;

import co.edu.unicauca.isii.revision.capaAccesoADatos.modelo.ArticuloEntity;

public interface InterfaceRepositorioArticulo {
    public boolean almacenarArticulo(ArticuloEntity objArticulo);
    public List<ArticuloEntity> listarArticulos();
    public boolean eliminarArticulo(int idArticulo);
    public ArticuloEntity consultarArticulo(int idArticulo);
    public boolean actualizarArticulo(ArticuloEntity objArticulo);
}
