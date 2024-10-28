package co.edu.unicauca.articulo.microservicio_articulo.fachadaServices.DTO.CRUDArticulosDTO;

//import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
public class ArticuloDTO {
    private int idArticulo;
    private String titulo;
    private String resumen;
    private String keyword;
    private String estado;
    //private List<ConferenceDTO> objConferencias;

    public ArticuloDTO()
    {

    }
}
