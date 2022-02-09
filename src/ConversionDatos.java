/*
//los nombres de las clases van en mayus al inicio y minusculas sin espacio
public class ConversionDatos {

		public static void main (String[] args) {
		byte numeroByte = 10;
		short numeroShort = numeroByte;
		int numeroLong = numeroShort; 
		
		int otroInt = (int) numeroLong;//convertimos long en int
		
		short otroShort = (short) OtroInt; //convirtiendo a short//lo convierte, lo pone en un contenedor mas grande
		
		
		//uso de operadores
		short numero1 = 123;
		
		short numero2 = 7343;
		
		byte numero3 = 12;
		
		byte numero4 = 33;
		
		//la suma hace que lo transforme a int por causas del lenguaje
		//short suma = numero1 + numero2;//da error dice que es un int a pesar de que el resultado quepa en un short
		short suma = (short) (numero1 + numero2);//le indicamos que sera un short y lo acepta porque el resultado entra en un short
		
		//byte suma2 = numero3 + numero4;//lo toma como int
		byte suma2 = (byte)(numero3 + numero4);//lo acepta como byte
		
		int suma3 = (numero3 + numero4);//procura usar los parentesis a pesar de que no especificas el dato
		
		short suma4 = (short)(numero1 + numero3);
		
		//cuando optimizar y cuando no? dependera de la cantidad de datos que manejes, por ejemplo en la suma, mientras esos datos no rebasen 
		 //al byte, short, int, etc, no se tiene problema pero al pasarse como numero de usuarios de pagina una web sera necesario usar otro tipo de dato o 
		 //desde el inicio usar un dato de mayor tamaño porque sabremos que crecera
		//JAVA todo lo que no especifiques lo trasnforma a INT
	
		
		
	}

}
*/