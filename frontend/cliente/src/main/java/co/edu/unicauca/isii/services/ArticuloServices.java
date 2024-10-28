package co.edu.unicauca.isii.services;

import co.edu.unicauca.mvc.modelos.Articulo;
import 
import javax.ws.rs.client.WebTarget;
import org.glassfish.jersey.jackson.JacksonFeature;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author earea
 */
public class ArticuloServices {
    private String endPoint;
    private Articulo objArticuloPeticiones;
    
    public ArticuloServices){
        this.endPoint = "http://localhost:8085/api/revisores";
        this.objArticuloPeticiones = ArticuloBuilder.newRevisor().register(new JacksonFeature());
    }
    
    public Articulo consultarArticulo(Integer id){
        Articulo objArticulo = null;
        WebTarget target = this.objArticuloPeticiones.target(this.endPoint+"/"+id);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        objArticulo = objPeticion.get(Cliente.class):
        return objArticulo;
    }
}
