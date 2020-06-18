package Almacen;

public class Peliculas {

	private String director;
	private String genero;
	private String titulo;
	private String fecha;
	private String productora;
	private int duracion;
	private int stock;
	
	public Peliculas(String director, String genero, String titulo, String fecha, String productora, int duracion, int stock) {
		this.director = director;
		this.genero = genero;
		this.titulo = titulo;
		this.fecha = fecha;
		this.productora = productora;
		this.duracion = duracion;
		this.stock = stock;
	}
	
	public String getDirector() {
		return director;
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
	
	public String getProductora() {
		return productora;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public int getStock() {
		return stock;
	}
}
