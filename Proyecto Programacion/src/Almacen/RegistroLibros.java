package Almacen;
import java.util.Hashtable;

public class RegistroLibros {
	
	private Hashtable<String, Libros> RegistroLibros;
	String encontrado;
	
	public RegistroLibros() {
		RegistroLibros = new Hashtable<String, Libros>();
	}
	
	public void agregarLibro(Libros libro) {
		RegistroLibros.put(libro.getTitulo(), libro);
	}
	
	public String buscarTitulo(String titulo) {
		Libros libro = RegistroLibros.get(titulo);
		
		if(libro  == null) {
			System.out.println("Error: Libro no encontrado.");
		}else {
			 encontrado = libro.getTitulo() + '\n' + libro.getAutor() + '\n' + libro.getTema() + '\n' + libro.getFecha() + '\n' + libro.getEditorial() + '\n' + libro.getPaginas();
		}
		return encontrado;
	 
	}
	
	public String buscarAutor(String autor) {
		Libros libro = RegistroLibros.get(autor);
		
		if(libro  == null) {
			System.out.println("Error: Autor no encontrado.");
		}else {
			 encontrado = libro.getTitulo() + '\n' + libro.getAutor() + '\n' + libro.getTema() + '\n' + libro.getFecha() + '\n' + libro.getEditorial() + '\n' + libro.getPaginas();
		}
		return encontrado;
	 
	}
	
	public String buscarEditorial(String editorial) {
		Libros libro = RegistroLibros.get(editorial);
		
		if(libro  == null) {
			System.out.println("Error: Editorial no encontrada.");
		}else {
			 encontrado = libro.getTitulo() + '\n' + libro.getAutor() + '\n' + libro.getTema() + '\n' + libro.getFecha() + '\n' + libro.getEditorial() + '\n' + libro.getPaginas();
		}
		return encontrado;
	 
	}
	
	public String buscarFecha(String fecha) {
		Libros libro = RegistroLibros.get(fecha);
		
		if(libro  == null) {
			System.out.println("Error: Fecha no encontrada.");
		}else {
			 encontrado = libro.getTitulo() + '\n' + libro.getAutor() + '\n' + libro.getTema() + '\n' + libro.getFecha() + '\n' + libro.getEditorial() + '\n' + libro.getPaginas();
		}
		return encontrado;
	 
	}
	
	public String buscarTema(String tema) {
		Libros libro = RegistroLibros.get(tema);
		
		if(libro  == null) {
			System.out.println("Error: Tema no encontrado.");
		}else {
			 encontrado = libro.getTitulo() + '\n' + libro.getAutor() + '\n' + libro.getTema() + '\n' + libro.getFecha() + '\n' + libro.getEditorial() + '\n' + libro.getPaginas();
		}
		return encontrado;
	 
	}
	
	public void eliminarLibro(String titulo) {
	RegistroLibros.remove(titulo);
	} 
	
}
