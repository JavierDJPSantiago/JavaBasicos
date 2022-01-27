
public class VariablesTiposDeDatos {

	public static void main(String[] args) {
	
		//va a estar sub rayando porque el lenguaje esta en ingles
		//tambien sub raya porque creas variables sin usar, te advierte que usas memoria sin un fin
		//String permite almacenar cadenas de texto
		String nombre = "Javier";
		
		//int edad = 31;
		
		//Char nos permite almacenar un caracter, pero solo 1
		char inicial = 'J';
		
		//boolean almacena un valor boolean, puede ser true o false
		boolean tienesCrush = true;
		
		//Tipos de datos enteros: checa el word, 
		//usalos dependiendo del tamaño del numero, si se pasa marca error
		
		//byte: 1byte rango maximo +/- 127
		byte edad = 31; 
		byte suma1 = 24 + 103;
		
		//short: 2byte +/- 32,767
		short suma2 = 24+104;
		
		//int: 4byte +/- 2,147,483,647
		int numero = 1021321312;
		
		//long: 8byte
		long numeroLargo = 100_000_000;
		
		//imprimir una variable
		System.out.println(numeroLargo);
		
		
		//float: pon una f al final para que lo reconozca como float. el punto hace que lo tome como un double
		float promedio = 1232.23232f;
		
		//double
		double numeroPi = 3.1415934324234;
	}
	
}
