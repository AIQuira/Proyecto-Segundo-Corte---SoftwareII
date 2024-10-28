package co.edu.unicauca.isii.services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 *
 * @author earea
 */

/**
 * Servicio para manejar las acciones específicas del revisor sobre los artículos.
 */
public class RevisorServices {
    private String endPoint;
    private Client client;

    public RevisorServices() {
        this.endPoint = "http://localhost:8085/api/revisores";
        this.client = ClientBuilder.newClient().register(new JacksonFeature());
    }

    // Método para calificar un artículo
    public boolean calificarArticulo(Integer id, int calificacion) {
        WebTarget target = client.target(this.endPoint).path("calificar").path(String.valueOf(id));
        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);
        Entity<Integer> calificacionEntity = Entity.entity(calificacion, MediaType.APPLICATION_JSON);
        try {
            objPeticion.put(calificacionEntity);
            return true;
        } catch (Exception e) {
            System.err.println("Error al calificar el artículo: " + e.getMessage());
            return false;
        }
    }
}
