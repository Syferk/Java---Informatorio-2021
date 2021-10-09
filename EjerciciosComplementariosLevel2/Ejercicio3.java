package EjerciciosComplementariosLevel2;
import java.util.*;

public class Ejercicio3 {
    public static void cargarBarajaFrancesa(List<String> cartas) {
        cartas.add("A");
        cartas.add("2");
        cartas.add("3");
        cartas.add("4");
        cartas.add("5");
        cartas.add("6");
        cartas.add("7");
        cartas.add("8");
        cartas.add("9");
        cartas.add("10");
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");
    }

    public static void imprimir(List<String> cartas) {
        for (String carta: cartas) {
            System.out.println(carta);
        }
    }

    public static void reverso(List<String> cartas) {
        Collections.reverse(cartas);
    }

    public static void mezclar(List<String> cartas) {
        Collections.shuffle(cartas);
    }

    public static void main(String[] args) {
        List<String> cartas = new ArrayList<>();

        cargarBarajaFrancesa(cartas);

        System.out.println("Cartas:");
        imprimir(cartas);

        System.out.println("Cartas al reves:");
        reverso(cartas);
        imprimir(cartas);

        System.out.println("Mezcla:");
        mezclar(cartas);
        imprimir(cartas);

    }
}
