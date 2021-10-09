package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();

        cargarCiudades(ciudades);
        imprimirCiudades(ciudades);
    }
    public static void cargarCiudades(List<String> ciudades) {
        char x = 's';
        Scanner scan = new Scanner(System.in);
        String ciudad;

        System.out.println("Ingrese ciudades empezando con las mas importantes.");
        while (x == 's') {
            System.out.println("Ingrese la ciudad:");
            ciudad = scan.nextLine();
            ciudades.add(ciudad);

            System.out.println("Si desea seguir agregando ingrese 's', de lo contrario ingrese cualquier tecla.");
            x = scan.nextLine().charAt(0);;
        }
        
        scan.close();
    }


    public static void imprimirCiudades(List<String> ciudades) {
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i + 1) + " - " + ciudades.get(i));
        }
    }
}
