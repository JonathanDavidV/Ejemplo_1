import java.util.Scanner;

public class CarSiguiente {
	
	public static void main(String[] args) {
		//Pido un caracter al usuario
		Scanner entrada = new Scanner(System.in);
		char car1;
		char car2;
		System.out.printf("Introduce un caracter");
		car1 = entrada.next().charAt(0);
		System.out.printf("Introduce otro caracter");
		car2 = entrada.next().charAt(0);
		
		System.out.printf("La suma de %c y %c es: %c",car1,car2,(car1+car2));
		
	}
}
