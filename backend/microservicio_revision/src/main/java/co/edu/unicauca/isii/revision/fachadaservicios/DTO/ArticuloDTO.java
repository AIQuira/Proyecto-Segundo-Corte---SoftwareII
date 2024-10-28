package co.edu.unicauca.isii.revision.fachadaServicios.DTO;

import lombok.Data;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Data
public class ArticuloDTO {
    private String titulo;
    private String descripcion;
    private String resumen;
    private String keyword;
}
