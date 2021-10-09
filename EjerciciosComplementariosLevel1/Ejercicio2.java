package EjerciciosComplementariosLevel1;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a, b;
        System.out.println("Este es un programa que realizará las operaciones básicas de aritmética.");
        System.out.println("Ingrese el primer número: ");
        a=scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        b=scan.nextInt();
        scan.close();
        int suma=a+b;
        int resta=a-b;
        int division=a/b;
        int multiplicacion=a*b;
        int modulo= a%b;

        System.out.println("La suma de: "+a + " + " +b + " es: " + suma);
        System.out.println("La resta de: "+a + " - " +b + " es: " + resta);
        System.out.println("La divisiónn entre: "+a + " / " +b + " es: " + division);
        System.out.println("La multiplicación entre: "+a + " * " +b + " es: " + multiplicacion);
        System.out.println("El módulo entre: "+a + " % " +b + " es: " + modulo);

    }
}
