import java.util.HashSet;//necesario
import java.util.Set;//necesario para set

public class Colecciones {
	public static void main(String [] args){
		
		//Las colecciones nos sirven para almacenar un conjunto de objetos
		//La diferencia de las colecciones y objetos es que las colecciones son dinamicas:
		//pueden cambiar el numero de objetos agregados (arreglos no puede aumentar posiciones)
		//https://www.adictosaltrabajo.com/2015/09/25/introduccion-a-colecciones-en-java/
		
		//Set tiene 3 implementaciones:
		//HashSet, TreeSet, LinkedHashSet
		//Los tres: no pueden contener elementos repetidos
		
		
		/////////HashSet://///////////// 
		//-guarda lo elementos en una tabla Hash
		//-los elementos no tienen un orden
		//-es la implementacion mas rapida
		
		/*
		 * 
		//especifica que elementos tendra en este caso String
		Set<String> frutas = new HashSet<String>(); 
		
		//add añade elementos a nuestra colección
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		*/
		
		//visualizar los elementos de una coleccion
		//foreach; puede recorrer una coleccion y en cada recorrido recuperar el valor y lo podemos almacenar en una variable
		//Sintaxis:
		//for(tipoDeDatoElmento varibale: elemtnoARecorrer
		//String es una variable en el for: furtas es la coleecion a recorrer
		for(String fruta : frutas) {
			System.out.println(fruta);//muestra los elementos de la coleccion pero en desorden
		}
		
		//la razon del desorden es por como lo almacena en memoria
		//
		
		
		
		
		////////TreeSet
        Set<String> frutas = new HashSet<String>(); 
		
		//add añade elementos a nuestra colección
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
	}
}
