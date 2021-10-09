package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(15);
        numeros.add(34);

        System.out.println("La lista contiene " + numeros.size() + " elementos.");

        numeros.add(0, 1);
        numeros.add(36);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros.get(i));
        }

        System.out.println("La lista contiene " + numeros.size() + " elementos.");
        }    
}

