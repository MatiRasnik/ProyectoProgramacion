package Almacen;
import java.util.Hashtable;

public class RegistroODTeatro {
	
	private Hashtable<String, ObrasDeTeatro> RegistroODTeatro;
	String encontrado;
	
	public RegistroODTeatro() {
		RegistroODTeatro = new Hashtable<String, ObrasDeTeatro>();
	}
	
	public void agregarLibro(ObrasDeTeatro odt) {
		RegistroODTeatro.put(odt.getTitulo(), odt);
	}
	
	public String buscarTitulo(String titulo) {
		Libros libro = RegistroODTeatro.get(titulo);
		
		if(libro  == null) {
			System.out.println("Error");
		}else {
			 encontrado = libro.getTitulo() + '\n' + libro.getAutor() + '\n' + libro.getTema() + '\n' + libro.getFecha() + '\n' + libro.getEditorial() + '\n' + libro.getPaginas();
		}
		return encontrado;
	 
	}
	
	public void eliminarLibro(String titulo) {
		RegistroODTeatro.remove(titulo);
	} 
	
}