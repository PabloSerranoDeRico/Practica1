package Practica1;
import java.util.ArrayList; 
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Library {
	private static ArrayList <Book> books = new ArrayList<Book>();
	private static ArrayList <Client> client = new ArrayList<Client>();
	private static Scanner sn;


	public static String searchBookName (String nombre) {
		boolean is = false;
		for ( int i = 0 ; i < books.size() && !is ; i++) {
			if(books.get(i).getNombre().equals(nombre)) {
				is = true;
			}
		}
		if (is) {
			return "we have it";
		}
		else return "we dont have it";
	}

	public static String addBook(String nombre, String año, String autor) {
		if (books.size() >0) {
		Book e = new Book (nombre,año,autor);
		books.add(e);
		}
		else {
			Book e = new Book (1,nombre,año,0, autor);
			books.add(e);
		}
		return "book added";
		}
		
	public static String removeBook(String name) {
		boolean done = true;
		for ( Book p : books ) {
			if (p.getNombre().equals(name)) {
				books.remove(p);
				done = !done;
			}
		}
		if (done){
			return "removed";
		}
		else 
			return "not removed";
	}



	public static void main (String[] args) {
		
		
		sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;


		while (!salir) {

			System.out.println("1. Search a book"); 
			System.out.println("2. Add a new book"); 
			System.out.println("3. Remove a Book"); 
			System.out.println("4. Exit"); 

			try {

				System.out.println("Do? write the number");
				opcion = sn.nextInt();
				String op;

				switch (opcion) {
				case 1: 
					System.out.println("name?");
					sn.nextLine();
					op = sn.nextLine();
					System.out.println(searchBookName(op));
					break;
				case 2: 
					String op1;
					String op2;
					String op3;
					System.out.println("name?");
					sn.nextLine();
					op1 = sn.nextLine();
					System.out.println("year?");
					op2 = sn.nextLine();
					System.out.println("author?");
					op3= sn.nextLine();
					System.out.println(addBook(op1,op2,op3));
					break;
				case 3: 
					System.out.println("name?");
					sn.nextLine();
					op = sn.nextLine();
					System.out.println(removeBook(op));
					break;
				case 4:
					salir = true;
					System.out.println("Good Bye");
					break;
				default:
					System.out.println("you should choose numbers between 1 to 6");
				}
			} catch (InputMismatchException e) {
				System.out.println("You have to put a number");
				sn.next();
			}
		}

	}

}