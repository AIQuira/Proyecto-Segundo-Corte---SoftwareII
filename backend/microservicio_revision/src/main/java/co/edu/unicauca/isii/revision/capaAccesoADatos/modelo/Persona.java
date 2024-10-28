package co.edu.unicauca.isii.revision.capaAccesoADatos.modelo;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

public class Persona {

    private int cedula;
    private String nombre;
    private String correo;
    private String password;
    private int telefono;
    private int rol;

    public Persona(int cedula, String nombre, String correo, String password, int telefono, int rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.rol = rol;
    }

    public Persona() {
        // Constructor sin argumentos
    }
}
