import java.util.Scanner;
public class Triangulos {
	/*Pedirle 3 �ngulos a un usuario y decirle si es un triangulo v�lido*/

	public static void main (String[] args) {
				
		System.out.println("�Quieres saber si tu figura es un tri�ngulo por sus �ngulos internos?: ");
				System.out.println("Introduce el primer �ngulo entero: ");
				Scanner sc = new Scanner(System.in);//puedes usar un solo sc para diferentes int
				int angulo1 = sc.nextInt();
				
				System.out.println("Introduce el segundo �ngulo entero: ");
				Scanner sb = new Scanner(System.in);
				int angulo2 = sb.nextInt();
				
				System.out.println("Introduce el tercer �ngulo entero: ");
				Scanner sd = new Scanner(System.in);
				int angulo3 = sd.nextInt();
				
				
				
				if(angulo1 + angulo2 + angulo3 != 180) {
					System.out.println("Tu figura no es un tri�ngulo");
				}
				else if(angulo1 + angulo2 + angulo3 == 180) {
					System.out.println("Tu figura es un tri�ngulo");
				}
				
	}

}
