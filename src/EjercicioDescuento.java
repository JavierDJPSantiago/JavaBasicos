

/*// solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1001 - 4999 10%
		// si la cuenta es de 5001 a 9999 20%
		// si la copra es de 10000 o más 30%
// imprimir el total con los descuentos incluidos
*/

import java.util.Scanner;
public class EjercicioDescuento {
	
	public static void main (String[] args) {
	
	System.out.println("Introduce tu pago: $");
	Scanner sc = new Scanner(System.in);
	int pago = sc.nextInt();
	
	double descuento1 = pago - (pago * 0.10);
	double descuento2 = pago - (pago * 0.20);
	double descuento3 = pago - (pago * 0.30);
	
	if(pago<1000) {
		System.out.println("Tu pago es de: $" + pago + " No tienes descuento");
	}
	
	else if(pago>=1000 && pago<=4999) {
		System.out.println("Tu pago es de: $" + pago + " Con tu descuento es de: $" + descuento1);
	
	}
	else if(pago>=5000 && pago<=9999) {
		System.out.println("Tu pago es de: $" + pago + " Con tu descuento es de: $" + descuento2);
	}
	
	else if(pago>=10000) {
		System.out.println("Tu pago es de: $" + pago + " Con tu descuento es de: $" + descuento3);
	}
	
	}	
}
