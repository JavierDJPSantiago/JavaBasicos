
public class ManipularArreglo {
	public static void main (String [] args) {
		
		/*
		 Crea una clase llamada ManipularArreglo
         crea un array con los siguientes números enteros:

         1, 6, 45, 53, 80, 102, 145, 326, 450, 892
         Crea un programa que use un ciclo que tome los números de arreglo 
         y devuelva la suma total, la suma de los números pares y la suma de los números impares.

		 */
		int []numeros = new int[]{1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int suma = 0;
		int pares = 0;
		int impares = 0;
		
		
		
		for(int i=0; i<numeros.length;i++) {
			suma += numeros[i];
			
		if(numeros[i] % 2 == 0) {
			pares += numeros[i];
	    }
		
		else{
	        impares +=numeros[i];
		}
			
		}
		
		System.out.println("Suma de los numeros: " + (suma));
		System.out.println("Suma de los pares: " + (pares));
		System.out.println("Suma de los impares: " + (impares));



		
			
	}
}
