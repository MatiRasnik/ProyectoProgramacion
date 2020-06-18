package Almacen;

public class ObrasDeTeatro {
		
	private String autor;
	private String genero;
	private String titulo;
	private String fecha;
	private int stock;
	
	public ObrasDeTeatro(String autor, String genero, String titulo, String fecha, int stock) {
		this.autor = autor;
		this.genero = genero;
		this.titulo = titulo;
		this.fecha = fecha;
		this.stock = stock;
		
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getGenero() {
		return genero;
	}
		
	public String getTitulo() {
		return titulo;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public int getStock() {
		return stock;
	}
}
