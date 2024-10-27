package co.edu.unicauca.isii.proyecto_api_rest_revision.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Articulo {
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
    public Articulo(String titulo, String descripcion, String resumen, String keyword) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.resumen = resumen;
        this.keyword = keyword;
    }
}
