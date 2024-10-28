package co.edu.unicauca.articulo.microservicio_articulo.fachadaServices.DTO.CRUDArticulosDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticuloDTO {
    private int idArticulo;
    private String titulo;
    private String resumen;
    private String keyword;
    private String estado;
    private List<ConferenceDTO> objConferencias;

    public ArticuloDTO()
    {

    }
}
