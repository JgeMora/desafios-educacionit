/*
Desafi 6
Cree un programa que reciba 3 parámetros y calcule la suma, resta, multiplicación, división, resto de dos números con decimales
• Debe crear un método que no retorne, nada que reciba los 3 parámetros, 2 números con decimales y el carácter de operación.
• Debe crear los métodos de las operaciones que retornar un numero con decimales.
• Debe mostrar por consola un mensaje que indique el resultado y la operación realizada.
*/


import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero a: ");
        double a = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese un numero b: ");
        double b = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese la operación que desea realizar [+, -, /, %]: ");
        char operacion = scanner.nextLine().charAt(0);

        realizarOperacion(a, b, operacion);
    }

    public static void realizarOperacion(double a, double b, char operacion) {
        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = sumar(a, b);
                System.out.printf("%.2f + %.2f = %.4f%n", a, b, resultado);
                break;
            case '-':
                resultado = restar(a, b);
                System.out.printf("%.2f - %.2f = %.4f%n", a, b, resultado);
                break;
            case '*':
                resultado = multiplicar(a, b);
                System.out.printf("%.2f * %.2f = %.4f%n", a, b, resultado);
                break;
            case '/':
                resultado = dividir(a, b);
                System.out.printf("%.2f / %.2f = %.4f%n", a, b, resultado);
                break;
            case '%':
                resultado = resto(a, b);
                System.out.printf("%.2f %% %.2f = %.1f%n", a, b, resultado);
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
    }

    public static double resto(double a, double b) {
        return a % b;
    }
}
