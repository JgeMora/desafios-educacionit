package desafio_02;

import java.util.Scanner;

public class ejecicio_01 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de horas: ");
        int horas = scanner.nextInt();
        
        int semanas = horas / 168; // 1 semana = 168 horas
        int dias = (horas % 168) / 24; // 1 día = 24 horas
        int horasRestantes = horas % 24;
        
        System.out.println("Equivalente en semanas: " + semanas);
        System.out.println("Equivalente en días: " + dias);
        System.out.println("Horas restantes: " + horasRestantes);
        
        scanner.close();
	}
}
