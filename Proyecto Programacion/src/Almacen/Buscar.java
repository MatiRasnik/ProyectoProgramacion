package Almacen;
import java.util.Scanner;

public class Buscar {
	Scanner sc = new Scanner(System.in);
	RegistroLibros rl = new RegistroLibros();
	RegistroODTeatro rodt = new RegistroODTeatro();
	RegistroPeliculas rpe = new RegistroPeliculas();
	RegistroPinturas rpi = new RegistroPinturas();
	
	public void Buscar() {
		int opcion = 0;
		System.out.println("______________________");
		System.out.println();
		System.out.println("       BUSCAR         ");
		System.out.println(" ¿Que quiere buscar?");
		System.out.println("______________________");
		System.out.println();
		System.out.println("1. Libros");
		System.out.println("2. Obras de Teatro");
		System.out.println("3. Peliculas");
		System.out.println("4. Pinturas");
		System.out.println("______________________");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			buscarLibro();
			break;
		case 2:
			buscarODT();
			break;
		case 3:
			buscarPeliculas();
			break;
		case 4:
			buscarPinturas();
			break;
		}
	}
	public void buscarLibro() {
		int opcion = 0;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Libro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.println("1. Por Titulo");
		System.out.println("2  Por Autor");
		System.out.println("3. Por Editorial");
		System.out.println("4. Por Fecha de publicación");
		System.out.println("5. Por Tema");
		System.out.println("______________________");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("");
			buscarTituloL();
			break;
		case 2:
			System.out.println("");
			buscarAutorL();
			break;
		case 3:
			System.out.println("");
			buscarEditorialL();
			break;
		case 4:
			System.out.println("");
			buscarFechaL();
			break;
		case 5:
			System.out.println("");
			buscarTemaL();
			break;
		}
		
	}
	public void buscarTituloL() {
		String titulo;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Libro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Titulo: ");
		sc = new Scanner(System.in);
		titulo = sc.nextLine();
		System.out.println("______________________");
		rl.buscarTitulo(titulo);
	}
	public void buscarAutorL() {
		String autor;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Libro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Autor: ");
		sc = new Scanner(System.in);
		autor = sc.nextLine();
		System.out.println("______________________");
		rl.buscarAutor(autor);
	}
	public void buscarEditorialL() {
		String editorial;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Libro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Editorial: ");
		sc = new Scanner(System.in);
		editorial = sc.nextLine();
		System.out.println("______________________");
		rl.buscarEditorial(editorial);
	}
	public void buscarFechaL() {
		String fecha;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Libro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Fecha: aaaa/mm/dd");
		sc = new Scanner(System.in);
		fecha = sc.nextLine();
		System.out.println("______________________");
		rl.buscarFecha(fecha);
	public void buscarTemaL() {
		String tema;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Libro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Tema: ");
		sc = new Scanner(System.in);
		tema = sc.nextLine();
		System.out.println("______________________");
		rl.buscarTema(tema);
	}
	public void buscarODT() {
		int opcion = 0;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Obra de Teatro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.println("1. Por Titulo");
		System.out.println("2  Por Autor");
		System.out.println("3. Por Fecha de publicación");
		System.out.println("4. Por Genero");
		System.out.println("______________________");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("");
			buscarTituloODT();
			break;
		case 2:
			System.out.println("");
			buscarAutorODT();
			break;
		case 3:
			System.out.println("");
			buscarFechaODT();
			break;
		case 4:
			System.out.println("");
			buscarGeneroODT();
			break;
		}
		
	}
	public void buscarTituloODT() {
		String titulo;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Obra de Teatro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Titulo: ");
		sc = new Scanner(System.in);
		titulo = sc.nextLine();
		System.out.println("______________________");
		rodt.buscarTitulo(titulo);
	}
	public void buscarAutorODT() {
		String autor;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Obra de Teatro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Autor: ");
		sc = new Scanner(System.in);
		autor = sc.nextLine();
		System.out.println("______________________");
		rodt.buscarAutor(autor);
	}
	public void buscarFechaODT() {
		String fecha;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Obra de Teatro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Fecha: aaaa/mm/dd");
		sc = new Scanner(System.in);
		fecha = sc.nextLine();
		System.out.println("______________________");
		rodt.buscarFecha(fecha);
		
	public void buscarGeneroODT() {
		String genero;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Obra de Teatro    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Genero: ");
		sc = new Scanner(System.in);
		genero = sc.nextLine();
		System.out.println("______________________");
		rodt.buscarGenero(genero);
	}
	public void buscarPeliculas() {
		int opcion = 0;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Peliculas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.println("1. Por Titulo");
		System.out.println("2  Por Director");
		System.out.println("3. Por Fecha de publicación");
		System.out.println("4. Por Genero");
		System.out.println("5. Por Productora");
		System.out.println("______________________");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("");
			buscarTituloPE();
			break;
		case 2:
			System.out.println("");
			buscarDirectorPE();
			break;
		case 3:
			System.out.println("");
			buscarFechaPE();
			break;
		case 4:
			System.out.println("");
			buscarGeneroPE();
			break;
		case 5:
			System.out.println("");
			buscarPropuctoraPE();
			break;
		}
		
	}
	public void buscarTituloPE() {
		String titulo;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Peliculas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Titulo: ");
		sc = new Scanner(System.in);
		titulo = sc.nextLine();
		System.out.println("______________________");
		rpe.buscarTitulo(titulo);
	}
	public void buscarDirectorPE() {
		String director;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Peliculas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Director: ");
		sc = new Scanner(System.in);
		director = sc.nextLine();
		System.out.println("______________________");
		rpe.buscarDirector(director);
	}
	public void buscarFechaPE() {
		String fecha;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Peliculas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Fecha: aaaa/mm/dd");
		sc = new Scanner(System.in);
		fecha = sc.nextLine();
		System.out.println("______________________");
		rpe.buscarFecha(fecha);
	public void buscarGeneroPE() {
		String genero;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Peliculas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Genero: ");
		sc = new Scanner(System.in);
		genero = sc.nextLine();
		System.out.println("______________________");
		rpe.buscarGenero(genero);
	}
	public void buscarProductoraPE() {
		String productora;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Peliculas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Productora: ");
		sc = new Scanner(System.in);
		productora = sc.nextLine();
		System.out.println("______________________");
		rpe.buscarProductora(genero);
	}
	public void buscarPinturas() {
		int opcion = 0;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Pinturas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.println("1. Por Titulo");
		System.out.println("2  Por Autor");
		System.out.println("3. Por Fecha de publicación");
		System.out.println("4. Por Museo");
		System.out.println("______________________");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("");
			buscarTituloPI();
			break;
		case 2:
			System.out.println("");
			buscarDirectorPI();
			break;
		case 3:
			System.out.println("");
			buscarFechaPI();
			break;
		case 4:
			System.out.println("");
			buscarGeneroPI();
			break;
		case 5:
			System.out.println("");
			buscarPropuctoraPI();
			break;
		}
		
	}
	public void buscarTituloPI() {
		String titulo;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Pinturas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Titulo: ");
		sc = new Scanner(System.in);
		titulo = sc.nextLine();
		System.out.println("______________________");
		rpi.buscarTitulo(titulo);
	}
	public void buscarAutorPI() {
		String autor;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Pinturas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Autor: ");
		sc = new Scanner(System.in);
		autor = sc.nextLine();
		System.out.println("______________________");
		rpi.buscarAutor(autor);
	}
	public void buscarFechaPI() {
		String fecha;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Pinturas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Fecha: aaaa/mm/dd");
		sc = new Scanner(System.in);
		fecha = sc.nextLine();
		System.out.println("______________________");
		rpi.buscarFecha(fecha);
	}
	public void buscarMuseoPI() {
		String museo;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Pinturas    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Museo: ");
		sc = new Scanner(System.in);
		museo = sc.nextLine();
		System.out.println("______________________");
		rpi.buscarMuseo(genero);
	}
}