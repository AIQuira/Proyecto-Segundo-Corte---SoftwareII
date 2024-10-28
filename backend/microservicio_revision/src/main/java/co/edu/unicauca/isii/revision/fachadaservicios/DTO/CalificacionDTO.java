package co.edu.unicauca.isii.revision.fachadaServicios.DTO;

import lombok.Data;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Data
public class CalificacionDTO {
    private Integer calificacionTitulo;
    private Integer calificacionDescripcion;
    private Integer calificacionResumen;
    private Integer calificacionKeyword;
}
