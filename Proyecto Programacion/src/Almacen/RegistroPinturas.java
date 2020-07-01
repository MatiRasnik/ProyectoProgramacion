package Almacen;
import java.util.Hashtable;

public class RegistroPinturas {
	
	private Hashtable<String, Pinturas> RegistroPinturas;
	String encontrado;
	
	public RegistroPinturas() {
		RegistroPinturas = new Hashtable<String, Pinturas>();
	}
	
	public void agregarPinturas(Pinturas pinturas) {
		RegistroPinturas.put(pinturas.getTitulo(), pinturas);
	}
	
	public String buscarTitulo(String titulo) {
		Pinturas pinturas = RegistroPinturas.get(titulo);
		
		if(pinturas  == null) {
			System.out.println("Error: Titulo no encontrado.");
		}else {
			 encontrado = pinturas.getTitulo() + '\n' + pinturas.getAutor() + '\n' + pinturas.getFecha() + '\n' + pinturas.getMuseo();
		}
		return encontrado;
	 
	}
	
	public String buscarAutor(String autor) {
		Pinturas pinturas = RegistroPinturas.get(autor);
		
		if(pinturas  == null) {
			System.out.println("Error: Autor no encontrado.");
		}else {
			 encontrado = pinturas.getTitulo() + '\n' + pinturas.getAutor() + '\n' + pinturas.getFecha() + '\n' + pinturas.getMuseo();
		}
		return encontrado;
	 
	}
	
	public String buscarFecha(String fecha) {
		Pinturas pinturas = RegistroPinturas.get(fecha);
		
		if(pinturas  == null) {
			System.out.println("Error: Fecha no encontrada.");
		}else {
			 encontrado = pinturas.getTitulo() + '\n' + pinturas.getAutor() + '\n' + pinturas.getFecha() + '\n' + pinturas.getMuseo();
		}
		return encontrado;
	 
	}
	
	public String buscarMuseo(String museo) {
		Pinturas pinturas = RegistroPinturas.get(museo);
		
		if(pinturas  == null) {
			System.out.println("Error: Museo no encontrada.");
		}else {
			 encontrado = pinturas.getTitulo() + '\n' + pinturas.getAutor() + '\n' + pinturas.getFecha() + '\n' + pinturas.getMuseo();
		}
		return encontrado;
	 
	}
	
	public void eliminarPinturas(String titulo) {
		RegistroPinturas.remove(titulo);
	} 
	
}