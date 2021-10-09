package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra: ");
        palabra=scan.nextLine();
        scan.close();
        upperCase(palabra);

    }
    public static void upperCase(String a)
    {
        for (int i = 0; i< a.length(); i++)
        {
            char aChar = a.charAt(i);
            if (aChar>=91 && aChar<=122)
            {
                aChar = (char)((aChar -32)); 
            }
            System.out.print(aChar);
         }
     }
}
