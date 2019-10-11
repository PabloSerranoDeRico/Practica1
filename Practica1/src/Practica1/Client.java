package Practica1;

public class Client {
	private String nombre;
	private String apellido;
	private int edad;
	private int client;
	
	
	public Client (int client,String nombre, String apellido, int edad) {
		this.client= client;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	
	public String toString() {
		return "client [nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + "]";
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}

	

