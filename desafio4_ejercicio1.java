package desafio4_ejercicio1;


import java.util.Scanner;

public class desafio4_ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;
        
        do {
            System.out.print("Para culminar escriba 0, de lo contrario escriba cualquier número: ");
            numero = scanner.nextInt();
            
            if (numero != 0) {
                suma += numero;
                
                if (numero > numeroMayor) {
                    numeroMayor = numero;
                }
                
                if (numero < numeroMenor) {
                    numeroMenor = numero;
                }
            }
        } while (numero != 0);
        
        System.out.println("La suma total es: " + suma);
        System.out.println("El número mayor es: " + (numeroMayor == Integer.MIN_VALUE ? 0 : numeroMayor));
        System.out.println("El número menor es: " + (numeroMenor == Integer.MAX_VALUE ? 0 : numeroMenor));
        
        scanner.close();
    }
}