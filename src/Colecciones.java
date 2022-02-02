import java.util.ArrayList;
import java.util.HashMap;
//importaciones para set
import java.util.HashSet;//necesario hash
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;//necesario linke
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;//necesario para set
import java.util.TreeMap;
import java.util.TreeSet;//necesario tree

public class Colecciones {
	public static void main(String [] args){
		
		//Las colecciones nos sirven para almacenar un conjunto de objetos
		//La diferencia de las colecciones y objetos es que las colecciones son dinamicas:
		//pueden cambiar el numero de objetos agregados (arreglos no puede aumentar posiciones)
		//https://www.adictosaltrabajo.com/2015/09/25/introduccion-a-colecciones-en-java/
		
		//Set tiene 3 implementaciones:
		//HashSet, TreeSet, LinkedHashSet
		//Los tres: no pueden contener elementos repetidos
		//-no muestra los elementos repetidos
		//Orden de velocidad: 
		//1.HashSet
		//2.LinkedHashSet
		//3.TreeSet
		//sus metodos estan en la imagen(añadir, borrar, etc)

		
		
		/////////HashSet://///////////// 
		//-guarda los elementos en una tabla Hash
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
		
		
		//visualizar los elementos de una coleccion
		//foreach; puede recorrer una coleccion y en cada recorrido recuperar el valor y lo podemos almacenar en una variable
		
		//Sintaxis:
		//for(tipoDeDatoElmento varibale: elementoARecorrer
		//String es una variable en el for: furtas es la coleecion a recorrer
		for(String fruta : frutas) {
			System.out.println(fruta);//muestra los elementos de la coleccion pero en desorden
		}
		
		//la razon del desorden es por como lo almacena en memoria
		//
		
		*/
		
		
		
		
		/*
		////////TreeSet
		//Estai mplementacion ordena los elementos en funcion de sus valores
		//ejemplo: mayusculas primero-luego minusculas, orden alfabetico, menor a mayor numero
		//es la implementación mas lenta
		
		
        Set<String> frutas = new TreeSet <String>(); 
		
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);//muestra elementos en orden alfabetico
		
		}
		*/
		
		
		
		
		
		
		
		/*
		///////////////////LinkedHashSet//////////////////////
		//ordena los elementos por su orden de insercion
		//es mas costoso que HashSet
		//es el segundo mas rapido
		
        Set<String> frutas = new LinkedHashSet <String>(); 
		
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);//muestra elementos en orden alfabetico
		
		}
		*/
		
		
		
		
		
		
		
		//otro tipo de colección
		/////////////////////////Listas/////////////////////////////////////////////////////////
		//Se permiten elementos duplicados
		//acceder a elementos especificos
		//buscar elementos
		//consulta metodos en la imagen
		
		//Dos tipos:
		
		
		
		/*
		//ArrayList
		//respeta el orden de insercion
		
		List <String> pokemones = new ArrayList <String>();		
		pokemones.add("chicorita");
		pokemones.add("Eevee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		
		pokemones.add(2,"Pikachu");//pidiendo que este nuevo elemento ocupe la posicion dos
		//el elementno que esta en la 2 "Psyduck", fue desplazado a la posicion 3

		//remove remueve el elemento de la posicion especificada
		pokemones.remove(5);//debe estar charizard, recuerda que antes agregamos pikachu
		
		
		//set reemplaza el elemento en la posicion especificada
		pokemones.set(0, "Flareon");
		
		
		for (String pokemon : pokemones) {
			System.out.println(pokemon);//visualizar los componentes igual que Set
		}
		
		System.out.println("************");
		System.out.println(pokemones.get(4));//get devuelve el elemento que se encuentre en la posición que pongas dentro de los ()//nota:charAt: solo es para cadenas de texto
		//get no se puede usar en Set
		//en js usabamos []sin get, aqui get ().
		
		
		//indexOf, nos va a devolver la posición del elemento 
		//y si elemento no se encuentra nos devuelve un -1
		//lee desde el incio al final
		System.out.println(pokemones.indexOf("Gengar"));//me devuelve la posicion donde esta
		//nota: si el elemento esta repetido, solo me devolvera el primer elemento que coincida
		
		
		//similar a indexOf, pero me regresa el ultimo elemento que coincida
		//igual si hay un elemento similar en medio
		//lee desde el final al inicio
		System.out.println(pokemones.lastIndexOf("Gengar"));
		
		
		System.out.println(pokemones.indexOf("Togepy"));//devuelve un -1 pasa tambien con last
		*/
		
		
		
		
		
		/*
		//LinkedList
		//Es un listado doblemente enlazado
		//cada elemento sabe que elemento tiene atras y adelante de el
		//Es mas rapido para insertar y remover elementos
		//Linkedlist es mas rapido cuando son listas muy grandes, por su funcionamiento interno, puede incluir
		//elimnar y extraer informacion 
		//Arraylist sirve igual pero es menos eficiente que linkedlist
		
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("greymon");
		
		for (String pokemon : digimones) {
			System.out.println(pokemon);
		}
		*/
		
		
		
		
		
		
		
		
		
		
		//otro tipo de coleccion
		////////////////////////Map///////////////////////////////////////////////////////////////
		
		//Asocia claves a valores
		//No puede contener claves duplicadas
		//solo puede tener un valor asociado
		//estrcutura: clave: valor; ambos pueden ser o strings o numeros pero debes especificarle en las<>
		//tiene tres implementaciones : HashMap, TreeMap
		
		
		
		/*
		///////////HashMap
		//similar a HashSet
		//Tiene mejor rendimiento pero no garantiza un orden a la hora de hacer interacciones
		//no calves reptidas//puedes meter llaves y valores duplicados pero solo te mostrara el ultimo valor añadido

		
		Map<Integer, String> usuarios = new HashMap <Integer, String>();
		//map usa llaves: mis llaves son los numeros(1123) y van asociadas a un valor (Javier de Jesus)
		
		usuarios.put (1123, "Javier de Jesús");
		usuarios.put (3242, "Raul");
		//usuarios.put(3242, "Pedro");// map no acepta claves duplicadas
		usuarios.put (3243, "Ro");
		
		//puedes meter llaves y valores duplicados pero solo te mostrara el ultimo valor añadido
		System.out.println(usuarios.get(3242));//para observar tu valor asociado a esa clave
		
		
		//KeySet: Nos permite recuperar las llaves que tiene el mapa
		//la regresa desordenada
		//aqui podemos ver que si repetimos un valor, con la misma clave, el valor anterior sera remplazado por el nuevo
		System.out.println(usuarios.keySet());//[1123, 3242, 3243]
		
		
		//values
		//permite recuperar los valores de las claves, en este caso los nombres
		System.out.println(usuarios.values());//[Javier de Jesús, Raul, Ro]

		*/
		
	
		
		
		
		
		/*
		//////////////////////////TreeMap////////////////////////
		//El map mas lento
		//ordena en alfabeot o valor menor a mañor
		//los valores los ordena en el orden que pone a las claves
		Map<String, String> tamales = new TreeMap <String, String>();
		tamales.put("Oaxaqueños", "Mole Rojo");
		tamales.put("Torta", "Mole verde");
		tamales.put("Dulces", "Gansito");
		tamales.put("Salado", "Cochinita");
		
		System.out.println(tamales.keySet());//[Dulces, Oaxaqueños, Salado, Torta]

		System.out.println(tamales.values());//[Gansito, Mole Rojo, Cochinita, Mole verde]

		System.out.println(tamales);//muestra la clave y su valor juntos como un string
		//{Dulces=Gansito, Oaxaqueños=Mole Rojo, Salado=Cochinita, Torta=Mole verde}

		
		
		tamales.entrySet().forEach(elemento ->{//funcion lambda//
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
	
		});
		*/
		
		
		
		
		
		
		
		///////////////LinkedHashMap/////////////////
		//ordenma los ementos en funcion a como los fuiste añadiendo
		Map<Integer, String> carros = new LinkedHashMap <Integer, String>();
	
		carros.put(1, "Volvo");
		carros.put(567, "Pointer");
		carros.put(8, "Mustang");

		System.out.println(carros.keySet());

		System.out.println(carros.values());
		
		
		
		
		
		
		///Checa el diagrama de flujo////////
		
		
		
	}
}
