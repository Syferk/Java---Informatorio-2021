package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra=scan.nextLine();
        System.out.println("Ingrese la letra sobre la cual quiere conocer la cantidad que hay en la palabra: ");
        String letra=scan.nextLine();
        scan.close();

        System.out.println(cantidadLetras(palabra, letra));
    }

    public static String cantidadLetras(String palabra, String letra) {
        int contador=0;
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i)== letra.charAt(0)){
                contador ++;
            }
        }
        if (contador != 0) {
            return ("El caracter "+letra.charAt(0)+ " se repite " + contador + " veces");
        }
        else{
            return ("El caracter no se encuentra en este texto");
        }
    }
}
