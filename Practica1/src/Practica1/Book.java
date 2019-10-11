package Practica1;

public class Book {
	private int id;
	
	private String nombre;
	private String añoSalida;
	private String autor;	

	public Book (String nombre, String añoSalida, String autor) {

		this.nombre = nombre;
		this.añoSalida = añoSalida;
		this.autor = autor;
	}
	public void Book1 (String nombre, String añoSalida, String autor) {
		
		this.nombre = nombre;
		this.añoSalida = añoSalida;
		this.autor = autor;
	}

	public Book (int id, String nombre2, String año, int copiasIniciales, String autor2) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAñoSalida() {
		return añoSalida;
	}

	public void setAñoSalida(String añoSalida) {
		this.añoSalida = añoSalida;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString() {
		return "book [nombre=" + nombre + ", añoSalida=" + añoSalida +
				 ", autor=" + autor + "]";
	}
}