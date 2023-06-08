package Paquete;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void darDeAltaLibro(Libro libro) {
        libros.add(libro);
    }

    public void darDeBajaLibro(int identificador) {
        for (Libro libro : libros) {
            if (libro.getIdentificador() == identificador) {
                libros.remove(libro);
                break;
            }
        }
    }

    public void darDeAltaUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void darDeBajaUsuario(String dni) {
        for (Usuario usuario : usuarios) {
            if (usuario.getDni().equals(dni)) {
                usuarios.remove(usuario);
                break;
            }
        }
    }

    // Resto de métodos (prestarLibro, devolverLibro, listarLibros, etc.)

    public void almacenarEstadoBibliotecaEnFichero(String rutaArchivo) {
        try (FileOutputStream fos = new FileOutputStream(rutaArchivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(libros);
            oos.writeObject(usuarios);
            System.out.println("El estado de la biblioteca ha sido almacenado en el archivo: " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public ArrayList<String> getLibros() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<String> getUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}
}
