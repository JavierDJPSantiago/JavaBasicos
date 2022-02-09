import java.util.Scanner;

public class EstructuraDeControlSwitch {
	public static void main (String[] args) {
		
	//Estructura de control para controlar el flujo de
	//comportamiento de un programa. Para la toma de decisiones
		
	/*
	 switch(condicion_a_evaluar/variable a evaluar){
	 case "valor":
	 	//codigo a ejecutar
	 	//break
	 case "n":
	 	//codigo a ejecutar
	 	//break
	 default:
	 	//codigo a ejecutar 
	 * 
	 */
		
		///En "case" va el valor que ocupara, no se pueden poner rangos; es un if else 
		//>=20 no puede ser en case
		///break detiene la ejecuion del bloque; si no se pone imprimira el siguiente bloque
		///default: es el equivalente al else; puede llevar codigo o no
		
		//Solicitar al usuario un dia a la semana y mostrar un mensaje
		
		System.out.println("Introduce un día de la semana y recibe un bonito mensaje");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		//nextLines: recuperar string
		//toLowerCase: convertir el string en minusculas
		
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un cafe");
			break;
		case "martes":
			System.out.println("Lunes chiquito. Esto esta cansado, pero ya casi");
			break;
		case "miercoles":
			System.out.println("Miercoles, pero a que costo");
			break;
		case"jueves":
			System.out.println("Juebebes de sed peligrosa");
			break;
		case"viernes":
			System.out.println("Ya mero es viernes, toma un cafe");
			break;	
		case"sabado":
		case"domingo":
			System.out.println("Basta de trabajación");//no usamos break y sabado y domingo mostrara el mismo mensaje
			break;
		default:
			System.out.println("Día desconocido, kha");
		}
	}	
}
