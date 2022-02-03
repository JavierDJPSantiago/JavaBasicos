package metodos;

//nueva clase que tiene acceo al metodo que creamos en Metodos
public class PruebaMetodos {
	public static void main (String[] args) {
		
		
		//crea un objeto que va a contener los metodos(funciones) y atributos(variables)
		//clase donde viene + nombre(nostros se lo damos) = + new + contenido de donde viene
		Metodos metodoPrueba = new Metodos ();//creamos un objeto
		
		
		
		metodoPrueba.a = 10;//variable a de la clase Metodos
		metodoPrueba.b = 26;//variable b de la clase Metodos
		
		
		metodoPrueba.sumar();//invocar el metodo de la clase Metodos//metodo void
		//en consola muestra el println que esta contenido en esa funcion
		
		
		//este tipo de metodos se pueden almacenar dentro de una variable
		int resultadoSuma = metodoPrueba.sumaConRetorno();//invocar metodo con retorno con una variable int
		System.out.println(resultadoSuma - 10);//metodo con retorno
		
	
		//metodo con argumentos
		double multiplicacion = metodoPrueba.multiplicarConArgumentos(40, 20);//double por que recupera un double
		System.out.println("El resultado de multiplicacion es: " + multiplicacion);
		
		
		
		
		//nota: pon todo en argumentos para observar este metodo
		Metodos.imprimirNombre("Pancho");//puede ser invocado sin un objeto linea 10{ Metodos metodoPrueba = new Metodos ();}
		//la razon es que pertenece a la clase
		
		
		
		
		
		
		
		
		
	}
} 
