package Almacen;
import java.util.Hashtable;

public class RegistroPinturas {
	
	private Hashtable<String, Pinturas> RegistroPinturas;
	String encontrado;
	
	public RegistroPinturas() {
		RegistroPinturas = new Hashtable<String, Pinturas>();
	}
	
	public void agregarLibro(Pinturas pinturas) {
		RegistroPinturas.put(pinturas.getTitulo(), pinturas);
	}
	
	public String buscarTitulo(String titulo) {
		Pinturas pinturas = RegistroPinturas.get(titulo);
		
		if(pinturas  == null) {
			System.out.println("Error");
		}else {
			 encontrado = pinturas.getTitulo() + '\n' + pinturas.getAutor() + '\n' + pinturas.getFecha() + '\n' + pinturas.getMuseo();
		}
		return encontrado;
	 
	}
	
	public void eliminarLibro(String titulo) {
		RegistroPinturas.remove(titulo);
	} 
	
}