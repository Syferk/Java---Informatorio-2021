package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usuario;
        System.out.println("Este es un programa que le dirá hola.");
        System.out.println("Ingrese su nombre: ");
        usuario= scan.nextLine();
        scan.close();
        saludar(usuario);
    }
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
}
