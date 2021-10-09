package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa realiza una potencia de dos números de forma nativa");
        System.out.println("Ingrese el primer número: ");
        int a=scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b=scan.nextInt();
        scan.close();
        
        System.out.println("La potencia de " + a +" ^ "+ b + " es = " + potencia(a, b));
    }
    public static int potencia(int a, int b) {
        int resultado=a;
        for(int i=0; i<b; i++){
            resultado*=a;
        }
        return resultado;
    }
}
