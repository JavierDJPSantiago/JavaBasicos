package metodos;
//enlazado a PruebaMetodos
public class Metodos {
	//https://docs.oracle.com/javase/8/docs/api/
	//Metodos son fuciones
	//en vez de public puedes poner private para que la funcion solo sirva en la clase que se creo
	//atributos de la clase
	int a, b;
	
	/////////////////////Metodos void (Vacio)
	//public void para ser utilizado en otra clase
	//con void por que no regresa resultados
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " mas " + b + " es " + resultado);
	}
	
	
	//////////////////////metodo con retorno de valores
	//sin void pero especifica el tipo de valor
	public int sumaConRetorno () {
		//int resultado = a + b;
		//return resultado;//regresame resultado de resultado
		return a + b;//regresame a + b
	}
	
	
	
	
	////////////////////////Argumentos
	//no lleva void , pero lleva el tipo de dato que manejara
	//suma(tipoDeValor argumentos); los argumetnos pueden ser int y otro double; especifica que tipo de dato son
	//double mas int da double, en operaciones esta bien mezclar pero no lo hagas en resultados,
	//en este caso la funcion recogera un double y debe ser especificado.
	//variables fuera vs argumentos: variables puede ser usada por cualquir funcion, argumentos son valores que creamos
	//dentro de la funcion, para hacer operaciones sin depender de variables externas
	public double multiplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		return c * d;
		//podria escribir solo return arg1 * arg2
	}
	
	
	
	
	
	//////////////////Método estático
	//no requiere la existencia de un objeto para existir
	//estatic, void(no regresa datos), usa argumentos
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre );
	}
	
	
	
	
	
	
	
	
	
}
