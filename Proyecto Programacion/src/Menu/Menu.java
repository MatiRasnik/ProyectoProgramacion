package Menu;
import java.util.*;
import Almacen.*;

public class Menu {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Buscar b = new Buscar();
		Ingresar i = new Ingresar();
		boolean repetir = true;
		do {
			int opcion = 0;
			System.out.println("______________________");
			System.out.println("        MENU          ");
			System.out.println("______________________");
			System.out.println();
			System.out.println("1. Buscar");
			System.out.println("2. Ingresar");
			System.out.println("3. Salir");
			System.out.println("______________________");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				b.Buscar();
				break;
			case 2:
				i.Ingresar();
				break;
			case 3:
				repetir = false;
			}
		}while(repetir); 
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
