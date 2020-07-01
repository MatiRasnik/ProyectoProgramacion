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
			System.out.println("Error");
		}else {
			 encontrado = odt.getTitulo() + '\n' + odt.getAutor() + '\n' + odt.getGenero() + '\n' + odt.getFecha();
		}
		return encontrado;
	 
	}
	
	public void eliminarODTeatro(String titulo) {
		RegistroODTeatro.remove(titulo);
	} 
	
}