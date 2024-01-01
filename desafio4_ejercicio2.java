package desafio4_ejercicio1;

import java.util.Scanner;

public class desafio4_ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique la oración a evaluar (No puede estar vacía):");
        String oracion = scanner.nextLine().trim(); // Lee la oración y elimina espacios al inicio y al final
        
        // Verifica si la oración no está vacía
        if (oracion.isEmpty()) {
            System.out.println("La oración ingresada está vacía. Inténtalo de nuevo.");
        } else {
            int[] frecuencia = new int[256]; // Arreglo para contar las ocurrencias de cada caracter ASCII
            
            // Recorre la oración y cuenta las ocurrencias de cada caracter
            for (int i = 0; i < oracion.length(); i++) {
                char caracter = oracion.charAt(i);
                if (caracter != ' ') { // Ignora los espacios en blanco
                    frecuencia[caracter]++;
                }
            }

            char caracterMasRepetido = ' ';
            int maxRepetido = 0;

            // Encuentra el caracter más repetido
            for (int i = 0; i < frecuencia.length; i++) {
                if (frecuencia[i] > maxRepetido) {
                    maxRepetido = frecuencia[i];
                    caracterMasRepetido = (char) i;
                }
            }

            System.out.println("El carácter [" + caracterMasRepetido + "] se repite " + maxRepetido + " veces.");
        }

        scanner.close();
    }
}
