package Almacen;

public class Libros {

		private String autor;
		private String tema;
		private String titulo;
		private String fecha;
		private String editorial;
		private int cantPaginas;
		private int stock;
		
		public Libros(String autor, String tema, String titulo, String fecha, String editorial, int cantPaginas, int stock) {
			this.autor = autor;
			this.tema = tema;
			this.titulo = titulo;
			this.fecha = fecha;
			this.editorial = editorial;
			this.cantPaginas = cantPaginas;
			this.stock = stock;
		}
		
		public String getAutor() {
			return autor;
		}
		
		public String getTema() {
			return tema;
		}
			
		public String getTitulo() {
			return titulo;
		}
		
		public String getFecha() {
			return fecha;
		}
		
		public String getEditorial() {
			return editorial;
		}
		
		public int getPaginas() {
			return cantPaginas;
		}
		
		public int getStock() {
			return stock;
		}

}
