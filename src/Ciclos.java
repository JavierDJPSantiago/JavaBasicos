
//icono insecto: 

public class Ciclos {

	public static void main (String[] args) {
	
		
		//ciclos: bucles que se ejecutaran hasta que el valor sea falso
		//while y do while, se ejecutan siempre 
		//for: si es falso desde el inicio no ejecuta el codigo
		
		/*
		////////////////while////////////////////////
		
		int control = 0;
		
		while(control < 10) {
			System.out.println("control = " + control);
			control++;//de no ponerlo se ciclara al infinito porque 0 siempre entra en la condición
		}
		*/
		//usa f6 para que accione el codigo
		
		
		
		
		
		
		/*
		///////////////do while///////////////////
		//util para cuando necesitamos que se ejecute una vez antes de hacer la operacion
		
		int control = 3;
		
		do {
			//codigo a ejecutar
			System.out.println("control = " + control);
			//modificador de la variable control
			control++;
			
		}while(control <3);
		
		//aunque 3 no entre en la condicion, se ejecuta aunque sea una vez
		
		*/
		
		
		
		
		
		
		
		
		//////////////////////////for///////////////////////
		
		//for
		//for se ejecuta un numero de veces
		
		//la variable local i no existe; solo dentro del for
		
		/*
		for (int i=0; i < 3; i++) {
			System.out.println("control = " + i);
		}
		*/
		
		
		
		
		
		
		
		
		//////////////////break & continue///////////////////////
		//break; termina el ciclo, solo deja que se ejecute una vez lo que esta antes
		
		
		/*
		for (int i=0; i<10; i++) {
			if(i % 2 ==0) { //solo se ejecuta cuando el valor de i sea un numero par
			   System.out.println("control = " + i);
			   	break;
			}
			
			//System.out.println("Control" + i);//esto no se ejecuta a pesar de estar fuera del if por el break
			
		}
		*/
		
		
		
		
		for (int i=0; i<10; i++) {
			if(i % 2 ==0) {
			   
			   
			   	continue;//permite saltarnos una ejecucion del ciclo
			   	//salta uno y continua el ciclo por eso muestra: 1,3,5,7,9
			   	//en otras palabras no se ejecuta lo que esta despues de continue
			}
			
			System.out.println("Control = " + i);
			
		}
		
		for (int i=0; i < 3; i++) {
			System.out.println("control = " + i);
			continue;//aqui se muestra 0,1,2 porque continue esta despues de println 
		}
	}
	
}
