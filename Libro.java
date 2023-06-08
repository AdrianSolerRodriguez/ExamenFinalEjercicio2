package Paquete;

import java.util.List;

public class Libro {
    private String titulo;
    private List<String> autores;
    private int identificador;
    private String categoria;
    private int edadRecomendada;

    public Libro(String titulo, List<String> autores, int identificador, String categoria, int edadRecomendada) {
        this.titulo = titulo;
        this.autores = autores;
        this.identificador = identificador;
        this.categoria = categoria;
        this.edadRecomendada = edadRecomendada;
    }

	public int getIdentificador() {
		// TODO Auto-generated method stub
		return 0;
	}

    // Getters y setters (omitiendo para mayor simplicidad)
}
