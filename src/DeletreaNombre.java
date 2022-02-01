import java.util.Scanner;
public class DeletreaNombre {
	public static void main (String [] args){
		
		
		/*
		 * Escribe un programa que pida al usuario 
		 * ingresar su nombre y que entonces imprima 
		 * cada una de las letras de su nombre.
		 * Ejemplo: "Juan"
		 * "J"
		 * "u"
		 * "a"
		 * "n"
	
		
		Como pista pueden investigar cómo se usan 
		los siguientes métodos de String:
		length()
		charAt(i)
		*/
		
		
		
		////////////////Metodo lenght///////////
		/*  // declara la cadena como un objeto S1 S2       
        String S1 = "Hola método de cadena Java";       
        String S2 = "RockStar";       
 
        // El método length () de String devuelve la longitud de una cadena S1.       
        int length = S1.length();       
        System.out.println("Longitud de una cadena es:" + longitud);       
        // 8 Longitud de una cadena RockStar     
        System.out.println("Longitud de una cadena es:" + S2.length());   
		 */
		
		
		
		
		/////////////CharAt(i)////////
		/* Regresa el caracter que le indiques
		 * String cadena = new String("Cadena de Texto");
           System.out.println(cadena.charAt(2));  // Devuelve la letra 'd'
		 */

		 /*Ejercicios
		  * https://thedeveloperblog.com/string-java
		  */
		
		System.out.println("Escribe tu nombre: ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		for (int i=0; i<nombre.length();i++) {
			System.out.println(nombre.charAt(i));
		}
		
		
		
		
		
		
	}
}
