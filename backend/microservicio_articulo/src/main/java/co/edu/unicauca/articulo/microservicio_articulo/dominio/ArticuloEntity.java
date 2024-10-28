package co.edu.unicauca.articulo.microservicio_articulo.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArticuloEntity {
    private int idArticulo;
    private String titulo;
    private String resumen;
    private String keyword;
    private String estado;

    public ArticuloEntity() {
    } 
}
