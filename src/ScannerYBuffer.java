import java.util.Scanner;
public class ScannerYBuffer {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); //usa este mismo scanner para diferentes valores
		
		//sc esta subrayado por que scanner no esta cerrado: usa sc.close(); (cuando ya no lo uses)
		
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		//= sc.nextLine();si solo coloco el next leera el texto hasta que encuentre un espacio, despues no leera nada
		//next su razon de actuar es causa del buffer, ese intro /n causa que lo sespacios ya no los lea
		//nextLine; guardara todo el texto aunque tenga espacios
		
		
		
		System.out.println("Introduce un número");
		int numero1 = sc.nextInt();
		sc.nextLine();//con esto extrae (limpia) la informacion que quedo en el buffer y ya puedo poner el nombre
		//solo usar este metodo si despues de un numero pediras un string

		//podemos dar enter en concatenacion y si los contara como tal
		System.out.println("Tu nombre es: " + nombre + 
						". Tu numero es: " + numero1);
		
		//si pedimos primero el numero y despues el nombre, java ya no te deja escribir el nombre:
		//http://puntocomnoesunlenguaje.blogspot.com/2012/08/java-scanner.html
		//el intro (/n) permanece en el buffer y lo toma como el dato siguiente
		//este intro es un string, por eso lo toma así; no sucede con números por que esta buscando números
		//para evitar este erro debemos limpiar el buffer
		
		
		
		/*
		System.out.println("Introduce un número");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce otro número");
		int numero2 = sc.nextInt();
		
		System.out.println("Número 1: " + numero1 + " Número 2: " + numero2);
		*/
		
		sc.close();
		
		
		
	}
}
