import java.util.Scanner;

public class Tabla {
	 public static void main(String[] args){
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier número positivo: ");
	        num = console.nextInt();
	         
	        
	        System.out.println("Tabla de multiplicar de  " + num);
	        
	       //Implementa un bucle while que imprima el resultado
	        /// //3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)
	        
	        int multiplicacion = 1; 
			while(multiplicacion < 11) {
				System.out.println(num + " X " + multiplicacion + " = " + (num * multiplicacion));
				multiplicacion++; 
				 
			
				console.close();
			}
	    
	    
	    
	    
	 
	

	}	

}
