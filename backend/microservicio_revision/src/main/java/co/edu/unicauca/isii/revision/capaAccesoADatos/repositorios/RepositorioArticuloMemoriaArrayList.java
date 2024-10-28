package co.edu.unicauca.isii.revision.capaAccesoADatos.repositorios;

import java.util.ArrayList;
import java.util.List;

import co.edu.unicauca.isii.revision.capaAccesoADatos.modelo.ArticuloEntity;

public class RepositorioArticuloMemoriaArrayList implements InterfaceRepositorioArticulo{

    private ArrayList<ArticuloEntity> listaDeArticulos;
    
    public RepositorioArticuloMemoriaArrayList()
    {
        this.listaDeArticulos= new ArrayList();
    }
    @Override
    public boolean almacenarArticulo(ArticuloEntity objArticulo) {
        objArticulo.setIdArticulo(getCantidadArticulos());
       return this.listaDeArticulos.add(objArticulo);
    }

    @Override
    public List<ArticuloEntity> listarArticulos() {
        return this.listaDeArticulos;
    }
    
    private int getCantidadArticulos()
    {
        return this.listaDeArticulos.size()+1;
    }

    @Override
    public boolean eliminarArticulo(int idArticulo) {
        boolean bandera=false;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if(this.listaDeArticulos.get(i).getIdArticulo()==idArticulo)
            {
                this.listaDeArticulos.remove(i);
                bandera=true;
                break;
            }
        }
        return bandera;
    }

    @Override
    public ArticuloEntity consultarArticulo(int idArticulo) {
        ArticuloEntity objArticulo=null;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if(this.listaDeArticulos.get(i).getIdArticulo()==idArticulo)
            {
                objArticulo=this.listaDeArticulos.get(i);
                break;
            }
        }
        
        return objArticulo;
    }

    @Override
    public boolean actualizarArticulo(ArticuloEntity objArticulo) {
        boolean bandera=false;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if(this.listaDeArticulos.get(i).getIdArticulo()==objArticulo.getIdArticulo())
            {
                this.listaDeArticulos.set(i, objArticulo);
                bandera=true;
                break;
            }
        }
        
        return bandera;
    }
}
