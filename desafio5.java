package desafio5;

/*
Desafío 5::
Crear un programa, usando el lenguaje de programación Java, que ingrese una oración que realice las siguientes operaciones: 
1. Contar las palabras. 
2. Indicar si hay palabras repetidas.
3. Ordenar las palabras de forma ascendente y mostrar el resultado. 
4. Ordenar las letras y mostrar el resultado. 
*/

import  java.util.*;

public class desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique la oración a evaluar:");
        String oracion = scanner.nextLine();

        if (oracion.isEmpty()) {
            System.out.println("La oración no puede estar vacía.");
            return;
        }

        // Eliminar los espacios al principio y final de la oración
        oracion = oracion.trim();

        // Contar las palabras
        String[] palabras = oracion.split("\\s+");
        int cantidadPalabras = palabras.length;
        System.out.println("La cantidad de palabras que contiene la oración es: " + cantidadPalabras);

        // Verificar palabras repetidas
        Set<String> palabrasSet = new HashSet<>(Arrays.asList(palabras));
        if (palabrasSet.size() == cantidadPalabras) {
            System.out.println("Ninguna palabra se repite.");
        } else {
            System.out.println("Se encontraron palabras repetidas.");
        }

        // Ordenar palabras de forma ascendente y mostrar el resultado
        Arrays.sort(palabras);
        System.out.println(Arrays.toString(palabras));

        // Ordenar letras y mostrar el resultado
        char[] letras = oracion.replaceAll("\\s+", "").toCharArray();
        Arrays.sort(letras);
        System.out.println("Letras ordenadas " + Arrays.toString(letras));
    }
}
