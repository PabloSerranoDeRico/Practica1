package Practica1;

public class Book {
	private int id;
	
	private String nombre;
	private String a�oSalida;
	private String autor;	

	public Book (String nombre, String a�oSalida, String autor) {

		this.nombre = nombre;
		this.a�oSalida = a�oSalida;
		this.autor = autor;
	}
	public void Book1 (String nombre, String a�oSalida, String autor) {
		
		this.nombre = nombre;
		this.a�oSalida = a�oSalida;
		this.autor = autor;
	}

	public Book (int id, String nombre2, String a�o, int copiasIniciales, String autor2) {
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

	public String getA�oSalida() {
		return a�oSalida;
	}

	public void setA�oSalida(String a�oSalida) {
		this.a�oSalida = a�oSalida;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString() {
		return "book [nombre=" + nombre + ", a�oSalida=" + a�oSalida +
				 ", autor=" + autor + "]";
	}
}