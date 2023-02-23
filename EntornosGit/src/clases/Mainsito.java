package clases;

import java.util.Scanner;

public class Mainsito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;

		do {

			System.out.println("Desea Saludar?");
			System.out.println("1. Si.");
			System.out.println("2. No.");
			System.out.println("3. Finaliza el programa");
			numero = teclado.nextInt();

			if (numero == 1) {
				System.out.println("Hola Mundo!");
			} else if (numero == 3) {
				System.out.println("Fin del programa.");
			} else if (numero == 2) {
				System.out.println("No se saluda");
			} else {
				System.out.println("Numero Erroneo.");
			}
		} while (numero != 3);
		teclado.close();

	}

}
