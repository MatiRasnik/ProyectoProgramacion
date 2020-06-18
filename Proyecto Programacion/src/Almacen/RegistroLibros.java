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
			System.out.println("Error");
		}else {
			 encontrado = libro.getTitulo() + '\n' + libro.getAutor() + '\n' + libro.getTema() + '\n' + libro.getFecha() + '\n' + libro.getEditorial() + '\n' + libro.getPaginas();
		}
		return encontrado;
	 
	}
	
	public void eliminarLibro(String titulo) {
	RegistroLibros.remove(titulo);
	} 
	
}
