//los operadores se nombran con todas en minusculas


package operadores;

public class Operadores {

	public static void main (String[] args) {
	//solo puede existir un main por proyecto por cuestion didactica se usan mas	
	//Operadores Aritmeticos
		//+, -, /, *, %
		
		int a = 10;
		int b = 20;
		double c = 10.0;//si usamos este dato ya no especificamos 
		
		/*
		int c = a + b;
		System.out.println(c);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + c);//concatenando valores de variables
		//presiona f11 es como el boton verde
		
		//Resta
		System.out.print("El resultado de la resta es: " + (b - a));
		//mandando a consola, concatenando y haciendo una operación
		*/
		
		
		int suma = a + b;
		System.out.println(suma);
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		System.out.print("El resultado de la resta es: " + (b - a));
		
		//división
		int division = a / b;
		System.out.print("El resultado de la division es: " + division);
		//dio 0 poque obtuvo decimales y el int no almacena decimales
		
		double division2 =(double) a/b;
	    //no usamos (a/b) porque: por lo menos uno de los datos debe ser de tipo double; de ponerse los dos da 0.0
		System.out.println("El resultado de la division es: " + division2);
		//0.5 lo dio porque especificamos que sera un double y tambien uno de los dos datos es double
		//si desde el inicio uno de nuestros datos es double ya no necesitamos especificar que una variable es double
		//si tenemos que especificar que la variable es double
		
		
		
		//multiplicación
		//debido a que uso c que es double especifiamos que la variable es double
		//si usas int te dara error
		double multiplicacion = c * a;
		System.out.println("El resultado de la division es: " + multiplicacion);
		
		//modulo
		double modulo = a % b;
		System.out.println("El modulo de la operación es: " + modulo);//da 10
		
		/*
		 * =
		 */
		//Inicializar varias variables del mismo tipo
		int d = 5, e; //inicializar las variables vacias
		e = 6;//e es una varibale vacia, le di un valor a e de 6 fuera del int, pero ya existia en un int
		System.out.println(d + "-" + e);//da 5 - 6
		//en js llamabamos varias variables con comas, aqui las concatenamos y las separamnos con string
		
		
		//Operadores de declaración compuesta 
		// +=, -=, /=, %=
		//una operación simplificada
		
		//varias variables en un solo int separadas por comas
		int f = 0, g = 5;
		f += 5;
		//f = f + 5
		
		System.out.println(f);//muestra 5
		
		//operadores relacionales
		/*<,>, <=, >=
		 * == igualdad (no ocupamos === en java siempre es estricto)
		 *!= diferencia
		 *Resultado: un valor de tipo boolen/ booleano (true, false)
		 */
		
		
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i); //false
		//System.out.println(h != j);//no se permite porque uno es numero y el otro es texto
		System.out.println(i != h);
		
		
		
		//Operador unario
		/* 
		 * ++
		 * preasignación
		 * postasignacion
		 */
		
		/*int k, l;
		System.out.println(++k);//da error porque no tienen un valor(inicializdas)
		 */
		
		int k =0, l=0;
		//System.out.println(++k);//da uno, sumo y luego muestra
		System.out.println(k++);//muestra y luego suma, pero ya vale 1
		System.out.println(--l);// da -1
	
		
		
		
		//Presedencia de operadores
		
		int operacion = (4 + 5) * 6 / 3;//14
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		
		System.out.println(operacion2);//x = 1, Y =0 debido a que x ya vale uno y y lo sumo
		//pero en el momento no valia -1 dio 1; daria 0 si fuera --y
		
		
		//Operador ternario
		//es un if.. else abreviado
		//solo nos permite tomar una desicion
		
		int edad = 18;
		int valor = (edad <=18) ? 2:1;
	    
		//int resultado = (edad <= 18) ? (valor = 2) : (valor = 3);//?=if  //:=else 
		//String resultado = (edad <= 18) ? "Uno" : "Dos";
		//parentesis son opcionales 
		//System.out.println("que salio: " + resultado);
		
		
		
		//Operadores logicos
		// and - &&
		// or - ||
		//Not !
		
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		
		
		
		
		
		
		
       
		
	}
	
}
