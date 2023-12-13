package desafio_02;

public class ejercicio_02 {

	public static void main(String[] args) {
        // Definir los valores
        int n1 = 5;
        int n2 = 10;
        int n3 = 20;
        
        // Realizar las operaciones
        int suma = n1 + n2; // a) Suma de n1 y n2
        int resta = n3 - n1; // b) Resta de n3 y n1
        int multiplicacion = n1 * n3; // c) Multiplicación de n1 y n3
        int division = n3 / n2; // d) División de n3 entre n2
        
        // Mostrar los resultados
        System.out.println("a) n1 + n2 = " + suma);
        System.out.println("b) n3 - n1 = " + resta);
        System.out.println("c) n1 * n3 = " + multiplicacion);
        System.out.println("d) n3 / n2 = " + division);
    }
}
