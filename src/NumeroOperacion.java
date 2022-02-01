import java.util.Scanner;

public class NumeroOperacion {
	public static void main (String [] args) {
		
		System.out.println("Dame dos números y dime que deseas hacer: 1)Suma, 2)Resta, 3)Division 4) Multiplicación");
		System.out.println("Introduce el primer número: ");
		Scanner sc = new Scanner(System.in);
		float numero1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		Scanner sb = new Scanner(System.in);
		float numero2 = sb.nextInt();
		
		System.out.println("¿Qué deseas? 1-4 ");
		Scanner sd = new Scanner(System.in);
		int operacion = sd.nextInt();
		
		
		switch(operacion) {
		case 1:
			float suma = numero1 + numero2;
			System.out.println(suma);
			break;
		case 2:
			float resta = numero1-numero2;
			System.out.println(resta);
			break;
		case 3:
			float division = numero1/numero2;
			System.out.println(division);
			break;
		case 4:
			float multiplicacion = numero1*numero2;
			System.out.println(multiplicacion);
			break;
		default:
			System.out.println("Esos no son numeros");
		}
		
		
		
	}
}

