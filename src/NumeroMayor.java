import java.util.Scanner;
/*
 * Pedir 3 números al usuario y mostrar un mensaje con el
 * número mayor
 * */

public class NumeroMayor {
		public static void main (String[] args) {
		
			System.out.println("Introduce el primer numero entero: ");
			Scanner sc = new Scanner(System.in);
			int numero1 = sc.nextInt();
			
			System.out.println("Introduce el segundo numero entero: ");
			Scanner sb = new Scanner(System.in);
			int numero2 = sb.nextInt();
			
			System.out.println("Introduce el tercer numero entero: ");
			Scanner sd = new Scanner(System.in);
			int numero3 = sd.nextInt();
			
			
			
			
			
			if(numero1 > numero2 && numero1 > numero3) {
				System.out.println("El numero mayor es: " + numero1);
				
			}
			else if (numero2 >numero3 && numero2>numero1) {
				System.out.println("El numero mayor es: " + numero2);
			}
			
			else if(numero3 >numero1 && numero3>numero2) {
				System.out.println("El numero mayor es: " + numero3);
			}
			
			else if(numero3 == numero1 && numero3 == numero2) {
				System.out.println("Los numeros son iguales");
			}
			
			else if(numero1 == numero2 && numero3>numero1 && numero3>numero2) {
				System.out.println("El numeros mayor es el:" + numero3 );
			}
			
			else if(numero2 == numero3 && numero1>numero2 && numero1>numero3) {
				System.out.println("El numero es el mayor es el: " + numero1);
			}
			
			else if(numero1 == numero3 && numero2>numero1 && numero2>numero3) {
				System.out.println("El numero mayor es el: " + numero2);
			}
			
			else if(numero1 == numero2 && numero2>numero3) {
				System.out.println("El numeros mayor es el:" + numero2 );
			}
			
			else if(numero2 == numero3 && numero2>numero1) {
				System.out.println("El numero es el mayor es el: " + numero2);
			}
			
			else if(numero1 == numero3 && numero1>numero2) {
				System.out.println("El numero mayor es el: " + numero1);
			}
			
	}
	
}
