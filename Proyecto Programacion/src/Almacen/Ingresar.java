package Almacen;

import java.util.Scanner;

public class Ingresar {
	static Scanner sc = new Scanner(System.in);

	public void Ingresar() {

		int opcion = 0;
		System.out.println("______________________");
		System.out.println();
		System.out.println("¿Que quiere almacenar?");
		System.out.println("______________________");
		System.out.println();
		System.out.println("1. Libros");
		System.out.println("2. Obras de Teatro");
		System.out.println("3. Peliculas");
		System.out.println("4. Pinturas");
		System.out.println("______________________");
		opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			NuevoLibro();
			break;
		case 2:
			NuevoODTeatro();
			break;
		case 3:
			NuevoPelicula();
			break;
		case 4:
			NuevoPinturas();
			break;
		}

	}

	public static void NuevoLibro() {

		RegistroLibros libro = new RegistroLibros();
		String autor = null;
		String tema = null;
		String titulo = null;
		String fecha = null;
		String editorial = null;
		int cantPaginas = 0;
		int stock = 0;
		boolean error = false;

		System.out.println("______________________");
		System.out.println();
		System.out.println("     Nuevo Libro:     ");
		System.out.println("______________________");

		try {
			sc = new Scanner(System.in);
			System.out.print("Autor: ");
			autor = sc.nextLine();
			System.out.print("Tema: ");
			tema = sc.nextLine();
			System.out.print("Titulo: ");
			titulo = sc.nextLine();
			System.out.print("Fecha: ");
			fecha = sc.nextLine();
			System.out.print("Editorial: ");
			editorial = sc.nextLine();
			System.out.print("Cantidad de Paginas: ");
			cantPaginas = sc.nextInt();
			System.out.print("Stock: ");
			stock = sc.nextInt();
		} catch (Exception ex) {
			System.out.println("Debe ingresar todos los datos. ");
			error = true;
		}

		if (error == false) {
			libro.agregarLibro(new Libros(autor, tema, titulo, fecha, editorial, cantPaginas, stock));
		}
	}

	public static void NuevoODTeatro() {
		RegistroODTeatro odteatro = new RegistroODTeatro();

		String autor = null;
		String titulo = null;
		String genero = null;
		String fecha = null;
		int stock = 0;
		boolean error = false;
		try {
			System.out.println("_______________________________");
			System.out.println();
			System.out.println("     Nueva Obra De Teatro:     ");
			System.out.println("_______________________________");
			sc = new Scanner(System.in);
			System.out.print("Autor: ");
			autor = sc.nextLine();
			System.out.print("Titulo: ");
			titulo = sc.nextLine();
			System.out.print("Fecha: ");
			fecha = sc.nextLine();
			System.out.print("Genero: ");
			genero = sc.nextLine();
			System.out.print("Stock: ");
			stock = sc.nextInt();
		} catch (Exception ex) {
			System.out.println("Debe ingresar todos los datos. ");
			error = true;
		}

		if (error == false) {
			odteatro.agregarODTeatro(new ObrasDeTeatro(autor, genero, titulo, fecha, stock));
		}
	}

	

	public static void NuevoPelicula() {
		RegistroPeliculas peliculas = new RegistroPeliculas();
		String director = null;
		String genero = null;
		String titulo = null;
		String fecha = null;
		String productora = null;
		int duracion = 0;
		int stock = 0;
		boolean error = false;
		try {
		System.out.println("_________________________");
		System.out.println();
		System.out.println("     Nueva Pelicula:     ");
		System.out.println("_________________________");
		sc = new Scanner(System.in);
		System.out.print("Director: ");
		director = sc.nextLine();
		System.out.print("Genero: ");
		genero = sc.nextLine();
		System.out.print("Titulo: ");
		titulo = sc.nextLine();
		System.out.print("Fecha: ");
		fecha = sc.nextLine();
		System.out.print("Productora: ");
		productora = sc.nextLine();
		System.out.print("Duracion: ");
		duracion = sc.nextInt();
		System.out.print("Stock: ");
		stock = sc.nextInt();
		
	} catch (Exception ex) {
		System.out.println("Debe ingresar todos los datos. ");
		error = true;
	}

	if (error == false) {
		peliculas.agregarPelicula(new Peliculas(director, genero, titulo, fecha, productora, duracion, stock));
	}

	}

	public static void NuevoPinturas() {
		RegistroPinturas pintura = new RegistroPinturas();
		String autor = null;
		String titulo = null;
		String fecha = null;
		String museo = null;
		int stock = 0;
		boolean error = false;
		try {
		System.out.println("________________________");
		System.out.println();
		System.out.println("     Nueva Pintura:     ");
		System.out.println("________________________");
		sc = new Scanner(System.in);
		System.out.print("Autor: ");
		autor = sc.nextLine();
		System.out.print("Titulo: ");
		titulo = sc.nextLine();
		System.out.print("Fecha: ");
		fecha = sc.nextLine();
		System.out.print("Museo: ");
		museo = sc.nextLine();
		System.out.print("Cantidad de Paginas: ");
		stock = sc.nextInt();
	} catch (Exception ex) {
		System.out.println("Debe ingresar todos los datos. ");
		error = true;
	}

	if (error == false) {
		pintura.agregarPinturas(new Pinturas(autor, titulo, fecha, museo, stock));
	}

	}

}
