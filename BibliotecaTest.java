package Paquete;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    
    public void testDarDeAltaLibro() {
        Libro libro = new Libro("Cien años de soledad", new ArrayList<>(Arrays.asList("Gabriel García Márquez")), 1,
                "Aventuras", 16);
        biblioteca.darDeAltaLibro(libro);

        Assertions.assertEquals(1, biblioteca.getLibros().size());
        Assertions.assertEquals(libro, biblioteca.getLibros().get(0));
    }

    
    public void testDarDeBajaLibro() {
        Libro libro = new Libro("Cien años de soledad", new ArrayList<>(Arrays.asList("Gabriel García Márquez")), 1,
                "Aventuras", 16);
        biblioteca.darDeAltaLibro(libro);

        biblioteca.darDeBajaLibro(1);

        Assertions.assertEquals(0, biblioteca.getLibros().size());
    }

    
    public void testDarDeAltaUsuario() {
        Usuario usuario = new Usuario("Juan", "Pérez", null, "12345678A");
        biblioteca.darDeAltaUsuario(usuario);

        Assertions.assertEquals(1, biblioteca.getUsuarios().size());
        Assertions.assertEquals(usuario, biblioteca.getUsuarios().get(0));
    }

    
    public void testDarDeBajaUsuario() {
        Usuario usuario = new Usuario("Juan", "Pérez", null, "12345678A");
        biblioteca.darDeAltaUsuario(usuario);

        biblioteca.darDeBajaUsuario("12345678A");

        Assertions.assertEquals(0, biblioteca.getUsuarios().size());
    }

    
    public void testAlmacenarEstadoBibliotecaEnFichero() {
        String rutaArchivo = "estado_biblioteca.dat";
        File archivo = new File(rutaArchivo);

        // Asegurarse de que el archivo no exista antes de ejecutar el test
        archivo.delete();

        Libro libro = new Libro("Cien años de soledad", new ArrayList<>(Arrays.asList("Gabriel García Márquez")), 1,
                "Aventuras", 16);
        biblioteca.darDeAltaLibro(libro);

        Usuario usuario = new Usuario("Juan", "Pérez", null, "12345678A");
        biblioteca.darDeAltaUsuario(usuario);

        biblioteca.almacenarEstadoBibliotecaEnFichero(rutaArchivo);

        Assertions.assertTrue(archivo.exists());
    }
}

