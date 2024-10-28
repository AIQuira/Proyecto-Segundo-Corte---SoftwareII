package co.edu.unicauca.articulo.microservicio_articulo.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticuloEntity {
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

    // Constructor sin calificaciones (para cuando el autor envía el artículo inicialmente)
    public ArticuloEntity(String titulo, String descripcion, String resumen, String keyword) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.resumen = resumen;
        this.keyword = keyword;
    }

    public ArticuloEntity() {
    } 
}
