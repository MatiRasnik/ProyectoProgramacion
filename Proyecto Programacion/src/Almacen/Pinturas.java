package Almacen;

public class Pinturas {

	private String autor;
	private String titulo;
	private String fecha;
	private String museo;
	private int stock;
	
	public Pinturas(String autor, String titulo, String fecha, String museo, int stock) {
		this.autor = autor;
		this.titulo = titulo;
		this.titulo = titulo;
		this.fecha = fecha;
		this.museo = museo;
		this.stock = stock;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public String getMuseo() {
		return museo;
	}
	
	public int getStock() {
		return stock;
	}
}
