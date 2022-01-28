import java.util.Scanner;
public class Triangulos {
	/*Pedirle 3 ángulos a un usuario y decirle si es un triangulo válido*/

	public static void main (String[] args) {
				
		System.out.println("¿Quieres saber si tu figura es un triángulo por sus ángulos internos?: ");
				System.out.println("Introduce el primer ángulo entero: ");
				Scanner sc = new Scanner(System.in);//puedes usar un solo sc para diferentes int
				int angulo1 = sc.nextInt();
				
				System.out.println("Introduce el segundo ángulo entero: ");
				Scanner sb = new Scanner(System.in);
				int angulo2 = sb.nextInt();
				
				System.out.println("Introduce el tercer ángulo entero: ");
				Scanner sd = new Scanner(System.in);
				int angulo3 = sd.nextInt();
				
				
				
				if(angulo1 + angulo2 + angulo3 != 180) {
					System.out.println("Tu figura no es un triángulo");
				}
				else if(angulo1 + angulo2 + angulo3 == 180) {
					System.out.println("Tu figura es un triángulo");
				}
				
	}

}
