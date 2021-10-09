package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int valor;
        System.out.println("Este programa permite hacer una secuencia de números");
        System.out.println("Ingrese un número: ");
        valor=scan.nextInt();
        scan.close();

        secuencia(valor);
        
    }
    public static void secuencia(int valor) {
        int resultado=0;
        String almacena="";
        for (int i = 0; i < valor; i++) {
            if(valor!=0){
                resultado++;
                almacena+=" "+ String.valueOf(resultado);
            }
            System.out.println(almacena);
        }
    }
}
