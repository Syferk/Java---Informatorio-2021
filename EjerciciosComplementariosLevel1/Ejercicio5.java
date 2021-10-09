package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Este programa realiza una multiplicación de forma nativa");
        System.out.println("Ingrese el primer número: ");
        int a=scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b=scan.nextInt();
        scan.close();
        
        
        System.out.println("La multiplicación de " + a +" * "+ b + " es = " + multiplicacionNativa(a, b));
    }

    public static int multiplicacionNativa(int a, int b) {
        int resultado=0;
        for(int i=0; i<a; i++){
            resultado+=b;
        }
        return resultado;
    }
        
}
