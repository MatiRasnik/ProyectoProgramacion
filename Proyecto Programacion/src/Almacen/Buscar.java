package Almacen;
import java.util.Scanner;

public class Buscar {
	Scanner sc = new Scanner(System.in);
	RegistroLibros rl = new RegistroLibros();
	
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
			
			break;
		case 3:
			
			break;
		case 4:
			
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
		System.out.println("2. Por Autor");
		System.out.println("3. Por Editorial");
		System.out.println("______________________");
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			buscarTitulo();
			break;
		case 2:
			buscarAutor();
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		}
		
	}
	public void buscarTitulo() {
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
	public void buscarAutor() {
		String autor;
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Buscar: Autor    ");
		System.out.println("______________________");
		System.out.println();
		System.out.print("Autor: ");
		sc = new Scanner(System.in);
		autor = sc.nextLine();
		System.out.println("______________________");
		rl.buscarAutor(autor);
	}
}
