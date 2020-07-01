package Almacen;
import java.util.Hashtable;

public class RegistroODTeatro {
	
	private Hashtable<String, ObrasDeTeatro> RegistroODTeatro;
	String encontrado;
	
	public RegistroODTeatro() {
		RegistroODTeatro = new Hashtable<String, ObrasDeTeatro>();
	}
	
	public void agregarODTeatro(ObrasDeTeatro odt) {
		RegistroODTeatro.put(odt.getTitulo(), odt);
	}
	
	public String buscarTitulo(String titulo) {
		ObrasDeTeatro odt = RegistroODTeatro.get(titulo);
		
		if(odt  == null) {
			System.out.println("Error: Titulo no encontrado.");
		}else {
			 encontrado = odt.getTitulo() + '\n' + odt.getAutor() + '\n' + odt.getGenero() + '\n' + odt.getFecha();
		}
		return encontrado;
	 
	}
	
	public String buscarAutor(String autor) {
		ObrasDeTeatro odt = RegistroODTeatro.get(autor);
		
		if(odt  == null) {
			System.out.println("Error: autor no encontrado.");
		}else {
			 encontrado = odt.getTitulo() + '\n' + odt.getAutor() + '\n' + odt.getGenero() + '\n' + odt.getFecha();
		}
		return encontrado;
	 
	}
	
	public String buscarFecha(String fecha) {
		ObrasDeTeatro odt = RegistroODTeatro.get(fecha);
		
		if(odt  == null) {
			System.out.println("Error: autor no encontrado.");
		}else {
			 encontrado = odt.getTitulo() + '\n' + odt.getAutor() + '\n' + odt.getGenero() + '\n' + odt.getFecha();
		}
		return encontrado;
	 
	}
	
	public String buscarGenero(String genero) {
		ObrasDeTeatro odt = RegistroODTeatro.get(genero);
		
		if(odt  == null) {
			System.out.println("Error: autor no encontrado.");
		}else {
			 encontrado = odt.getTitulo() + '\n' + odt.getAutor() + '\n' + odt.getGenero() + '\n' + odt.getFecha();
		}
		return encontrado;
	 
	}
	
	public void eliminarODTeatro(String titulo) {
		RegistroODTeatro.remove(titulo);
	} 
	
}