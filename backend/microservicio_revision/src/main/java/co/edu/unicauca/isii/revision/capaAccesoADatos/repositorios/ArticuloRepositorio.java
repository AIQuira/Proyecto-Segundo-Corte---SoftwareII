package co.edu.unicauca.isii.revision.capaAccesoADatos.repositorios;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.isii.revision.capaAccesoADatos.modelo.ArticuloEntity;

@Repository
public class ArticuloRepositorio {
    
    ArrayList<ArticuloEntity> listaArticulos;

    public ArticuloRepositorio() {
        this.listaArticulos = new ArrayList<>();
    }

    //Agregar funciones CRUD
}
