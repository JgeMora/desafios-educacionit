package desafio_03;

import java.util.Scanner;

public class Desafio3_ejercicio1 {
	public static void main(String[] args) {
        // Definir usuario y contraseña
        String usuario = "miUsuario";
        String contrasena = "miContrasena";

        // Obtener datos ingresados por el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        // Verificar si las credenciales son correctas
        if (usuario.equals(usuarioIngresado) && contrasena.equals(contrasenaIngresada)) {
            System.out.println("Bienvenido al Sistema");
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }
}
