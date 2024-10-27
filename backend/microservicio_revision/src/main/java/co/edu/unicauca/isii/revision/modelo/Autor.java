package co.edu.unicauca.isii.revision.modelo;

import java.util.List;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

public class Autor extends Persona{
    
    private List<Articulo> listaArticulos;

    public Autor(int cedula, String nombre, String correo, String password, int telefono, int rol) {
        super(cedula, nombre, correo, password, telefono, rol);
    }

    public List<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(List<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }
    
}
