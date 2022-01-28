import java.util.Scanner;

public class EstructuraDeControlf {
	public static void main (String[] args) {
	//Estructuras de control de flujo
	//Nos sirve para la toma de desiciones
	
	//Estructuras de control de flujo nos sirve para 
	//cambiar el flujo de nuestro programa
	//evaluando una condicion y a partir de la evaluacion
	//se realiza una accion u otra
	
	//tenemos dos formas de hacerlo:
	//if: se evalua una condicion y dependiendo del resultado se ejecuta una linea de bloque
		
	/*
	 * if(condicion){
	 * codigo
	 * 
	 * }else {
	 * codigo
	 * }	
	 */
		
		//Usada para devolver mensajes para devolver informacion
		System.out.println("Introduce tu edad");//manda informacion hacia afuera/ info de salida
		
		//Scanner: in es de entrada, informacion que se añadida
		//necesita importar Scanner: import java.util.Scanner;
		Scanner sc = new Scanner(System.in);
	
		//next: para recoger valores primitivos
		//Int le especifico que recogera un valor int
		int edad = sc.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
			
		}
		else {
			System.out.println("Eres menor de edad");
		}
		
		
}
}
