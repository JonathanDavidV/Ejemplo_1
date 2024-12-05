import java.util.Scanner;

public class EjemploScanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroEntero;
		String nombreUsuario;
		byte edad;
		String direccion;
		
		System.out.printf("Introduzca un numero entero, por favor\n");
		numeroEntero = sc.nextInt();
		sc.nextLine();
		System.out.printf("Introduce tu nombre, por favor\n");
		nombreUsuario = sc.nextLine();
		System.out.printf("Introduce tu edad\n");
		edad = sc.nextByte();
		System.out.printf("Introduce tu direccion\n");
		direccion = sc.nextLine();
		
		System.out.printf("El entero introducido es: %d", numeroEntero);
		System.out.printf("Tu nombre es: %s", nombreUsuario);
		System.out.printf("Tu edad es: %d\n",edad);
		System.out.printf("Tu dieccion es: %s\n",direccion );
	}
}
