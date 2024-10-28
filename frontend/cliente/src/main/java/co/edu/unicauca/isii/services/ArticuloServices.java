package co.edu.unicauca.isii.services;

import co.edu.unicauca.mvc.modelos.Articulo;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 *
 * @author earea
 */

/**
 * Servicio para interactuar con los artículos mediante REST.
 */
public class ArticuloServices {
    private String endPoint;
    private Client client;

    public ArticuloServices() {
        this.endPoint = "http://localhost:8085/api/articulos";
        this.client = ClientBuilder.newClient().register(new JacksonFeature());
    }

    // Método para consultar un artículo específico por ID
    public Articulo consultarArticulo(Integer id) {
        WebTarget target = client.target(this.endPoint).path(String.valueOf(id));
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);
        return objPeticion.get(Articulo.class);
    }

    // Método para listar todos los artículos
    public Articulo[] listarArticulos() {
        WebTarget target = client.target(this.endPoint);
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);
        return objPeticion.get(Articulo[].class);
    }
}
