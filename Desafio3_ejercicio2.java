package desafio_03;

import java.util.Scanner;

public class Desafio3_ejercicio2 {

	public static void main(String[] args) {
        // Obtener datos del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura actual: ");
        double temperatura = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el tipo de clima (Soleado, Lluvia, Nieve): ");
        String tipoClima = scanner.nextLine();

        // Determinar la sugerencia de actividad basada en la temperatura y el clima
        if (temperatura > 25 && tipoClima.equalsIgnoreCase("Soleado")) {
            System.out.println("Puede caminar y tomar sol");
        } else if (temperatura >= 15 && temperatura <= 25 && tipoClima.equalsIgnoreCase("Soleado")) {
            System.out.println("Puede caminar");
        } else if (temperatura < 15 && tipoClima.equalsIgnoreCase("Soleado")) {
            System.out.println("Puede caminar con campera");
        } else if (temperatura < 10 && tipoClima.equalsIgnoreCase("Lluvia")) {
            System.out.println("Quedarse en casa o salir con paraguas y campera");
        } else if (temperatura < 10 && tipoClima.equalsIgnoreCase("Nieve")) {
            System.out.println("Puede esquiar");
        } else {
            System.out.println("No se encontró una sugerencia para esta combinación de temperatura y clima.");
        }
    }
	
}
