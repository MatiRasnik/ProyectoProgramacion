package Menu;
import java.util.*;
import Almacen.*;

public class Menu {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
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
		
		switch(opcion) {
		case 1:
			NuevoLibro();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		}
//menu

	}
	public static void NuevoLibro(){
		String autor;
		String tema;
		String titulo;
		String fecha;
		String editorial;
		int cantPaginas;
		int stock;
		
		System.out.println("______________________");
		System.out.println();
		System.out.println("     Nuevo Libro:     ");
		System.out.println("______________________");
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
		
	}

}
