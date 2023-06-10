package ddd;

import java.util.Scanner;

public class MostarSalidas {

	public static void main(String args[]) {
	    String nombre;
	    
	    Scanner entrada= new Scanner(System.in);
	    
	    System.out.println("Ingresa tu nombre: ");
	    nombre= entrada.nextLine();
	    
	    System.out.print("Hola ");
	    System.out.print(nombre);
	    System.out.print(", ¿Cómo estas?");
		}
	}
