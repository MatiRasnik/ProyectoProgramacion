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
			System.out.println("Error: Titulo no encontrado.");
		} else {
			encontrado = peliculas.getTitulo() + '\n' + peliculas.getDirector() + '\n' + peliculas.getProductora()
					+ '\n' + peliculas.getGenero() + '\n' + peliculas.getFecha() + '\n' + peliculas.getDuracion() + '\n' + peliculas.getStock();
		}
		return encontrado;

	}
	
	public String buscarDirector(String director) {
		Peliculas peliculas = RegistroPeliculas.get(director);

		if (peliculas == null) {
			System.out.println("Error: Director no encontrado.");
		} else {
			encontrado = peliculas.getTitulo() + '\n' + peliculas.getDirector() + '\n' + peliculas.getProductora()
					+ '\n' + peliculas.getGenero() + '\n' + peliculas.getFecha() + '\n' + peliculas.getDuracion() + '\n' + peliculas.getStock();
		}
		return encontrado;

	}
	
	public String buscarFecha(String fecha) {
		Peliculas peliculas = RegistroPeliculas.get(fecha);

		if (peliculas == null) {
			System.out.println("Error: Fecha no encontrada.");
		} else {
			encontrado = peliculas.getTitulo() + '\n' + peliculas.getDirector() + '\n' + peliculas.getProductora()
					+ '\n' + peliculas.getGenero() + '\n' + peliculas.getFecha() + '\n' + peliculas.getDuracion() + '\n' + peliculas.getStock();
		}
		return encontrado;

	}
	
	public String buscarGenero(String genero) {
		Peliculas peliculas = RegistroPeliculas.get(genero);

		if (peliculas == null) {
			System.out.println("Error: Genero no encontrado.");
		} else {
			encontrado = peliculas.getTitulo() + '\n' + peliculas.getDirector() + '\n' + peliculas.getProductora()
					+ '\n' + peliculas.getGenero() + '\n' + peliculas.getFecha() + '\n' + peliculas.getDuracion() + '\n' + peliculas.getStock();
		}
		return encontrado;

	}
	
	public String buscarProductora(String productora) {
		Peliculas peliculas = RegistroPeliculas.get(productora);

		if (peliculas == null) {
			System.out.println("Error: Productora no encontrada.");
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