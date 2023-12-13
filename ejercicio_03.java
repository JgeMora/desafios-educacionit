package desafio_02;

public class ejercicio_03 {
	
	 public static void main(String[] args) {
	        // Definir los valores
	        int n1 = 10;
	        int n2 = 20;
	        int n3 = 30;
	        
	        // Calcular el total, el promedio y el resto
	        int total = n1 + n2 + n3; // a) Calcular el total
	        double promedio = (double) total / 3; // b) Calcular el promedio
	        int resto = n2 % n1; // c) Calcular el resto entre n2 y n1
	        
	        // Mostrar los resultados
	        System.out.println("a) El total es: " + total);
	        System.out.println("b) El promedio es: " + promedio);
	        System.out.println("c) El resto entre n2 y n1 es: " + resto);
	    }
	
}
