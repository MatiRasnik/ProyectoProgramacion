package Almacen;

import java.util.Hashtable;

public class RegistroPeliculas {

	private Hashtable<String, Peliculas> RegistroPeliculas;
	String encontrado;

	public RegistroPeliculas() {
		RegistroPeliculas = new Hashtable<String, Peliculas>();
	}

	public void agregarPelicula(Peliculas peliculas) {
		RegistroPeliculas.put(peliculas.getTitulo(), peliculas);
	}

	public String buscarTitulo(String titulo) {
		Peliculas peliculas = RegistroPeliculas.get(titulo);

		if (peliculas == null) {
			System.out.println("Error");
		} else {
			encontrado = peliculas.getTitulo() + '\n' + peliculas.getDirector() + '\n' + peliculas.getProductora()
					+ '\n' + peliculas.getGenero() + '\n' + peliculas.getFecha() + '\n' + peliculas.getDuracion() + '\n' + peliculas.getStock();
		}
		return encontrado;

	}

	public void eliminarPeliculas(String titulo) {
		RegistroPeliculas.remove(titulo);
	}

}