package co.edu.unicauca.isii.proyecto_api_rest_revision.fachadaservicios.DTO;

import lombok.Data;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Data
public class RevisorDTO {
    private int cedula;
    private String nombre;
    private String correo;
    private String tituloUniversitario;
}
