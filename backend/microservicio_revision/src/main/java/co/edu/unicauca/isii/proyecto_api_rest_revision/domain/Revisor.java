package co.edu.unicauca.isii.proyecto_api_rest_revision.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Revisor extends Persona {

    private String tituloUniversitario;


    public Revisor(int cedula, String nombre, String correo, String password, int telefono, int rol, String tituloUniversitario) {
        super(cedula, nombre, correo, password, telefono, rol);
        this.tituloUniversitario = tituloUniversitario;
    }

    public void calificarArticulo(Articulo articulo, Integer calTitulo, Integer calDescripcion, Integer calResumen, Integer calKeyword) {
        articulo.setCalificacionTitulo(calTitulo);
        articulo.setCalificacionDescripcion(calDescripcion);
        articulo.setCalificacionResumen(calResumen);
        articulo.setCalificacionKeyword(calKeyword);
    }
}
