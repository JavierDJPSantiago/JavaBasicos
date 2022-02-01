
public class Arreglos {
	public static void main (String [] args) {
		
		//Arreglos
		//Solo un tipo de (string o int etc)
		//Especofocar el tamaño que va a contener
		
		///////1 manera
		int numeros[];//creamos la varibale//new crea una intacia o copia de un arreglo o de un objeto 
		numeros = new int[4];//creando el arreglo; pido que tenga 4 posiciones : no pueden cambiar
		
		
		
		//////2 manera: la forma 
		String[] nombres = new String[4];
		
		
		
		///////3 manera
		//array literal//no es necesario indicar el tamaño del arreglo
		String []nombreFrutas = new String[]{"Manzana", "Platano","Uva", "Pera"};
		
		//en la primer posicion [0] de nuestro arreglo numeros: añadimos el numero 10
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 200;
		
		//que pasa si agrego un numero mas en la posicion 5, sabiendo que el arreglos olo tiene 4 posiciones?
		
		//numeros[4] = 100;da error nos dice que supera el espacio permitido
		
		//no podemos modificar arreglos cuando ya fueron creados
		
		///ahora arreglo nombres
		nombres[0]="Juan";
		nombres[1]="Pedro";
		nombres[2]="Antonio";
		nombres[3]="Felipe";
		
		
		
		
		
		//mostrar el arreglo y una posicion de su contenido
		System.out.println(numeros[0]);//me muestra 10 que esta en la posicion 0
		System.out.println(numeros);//no nos manda todos los elementos; nos manda un numero que indica la direecion donde esta el arreglo en tu memoria
		
		
		//para ver todos los elementos del arreglo se usa un for
		//con arreglos al usar length no usamos parentesis lenght(); porque en arreglos lenght es una propiedad
		//y en arrays lenght es un metodo;un metodo se ejecuta con el parentesis porque es una funcion
		//i es el contador
		
		for(int i=0; i<numeros.length;i++) {
			System.out.println("Elemento de números "+ numeros[i]);
			System.out.println("Elemento de nombres "+ nombres[i]);
			System.out.println("Elemento de nombres "+ nombreFrutas[i]);
			System.out.println("----------------------");
		}
		
		
		//si el arreglo tiene una posicion vacia, no la muestra java, js si la 
        //al igual que con el arreglo de numeros, el arreglo de string 
		//si se superan las posiciones marca error
	}
}
