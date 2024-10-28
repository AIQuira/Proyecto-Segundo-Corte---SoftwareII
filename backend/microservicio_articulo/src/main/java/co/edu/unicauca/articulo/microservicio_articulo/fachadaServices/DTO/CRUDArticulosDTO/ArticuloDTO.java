package co.edu.unicauca.articulo.microservicio_articulo.fachadaServices.DTO.CRUDArticulosDTO;

import java.util.List;

import co.edu.unicauca.articulo.microservicio_articulo.dominio.RevisorEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticuloDTO {
    private int idArticulo;
    private String estado;
    private String titulo;
    private String descripcion;
    private String resumen;
    private String keyword;
    private Integer calificacionTitulo;
    private Integer calificacionDescripcion;
    private Integer calificacionResumen;
    private Integer calificacionKeyword;
    private List<RevisorEntity> listaRevisores;

    // Constructor sin calificaciones (para cuando el autor envía el artículo inicialmente)
    public ArticuloDTO(int idArticulo, String titulo, String descripcion, String resumen, String keyword) {
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.resumen = resumen;
        this.keyword = keyword;
    }

    public ArticuloDTO() {
    } 
}
