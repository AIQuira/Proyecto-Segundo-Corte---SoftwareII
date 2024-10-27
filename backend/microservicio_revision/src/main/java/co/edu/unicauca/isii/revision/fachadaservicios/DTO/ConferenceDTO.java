package co.edu.unicauca.isii.proyecto_api_rest_revision.fachadaservicios.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ConferenceDTO {
    private Integer id;
    private String nombre;
    private String lugar;
    private String fecha;
    private String tema;
    private String descripcion;
    private String contacto;

    public ConferenceDTO() {
    }
}
