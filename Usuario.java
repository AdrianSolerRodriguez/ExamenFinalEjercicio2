package Paquete;

import java.util.Date;

public class Usuario {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String dni;

    public Usuario(String nombre, String apellidos, Date fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

	public Object getDni() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters y setters (omitiendo para mayor simplicidad)
}
