package EjerciciosComplementariosLevel2;
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horas_trabajadas = new ArrayList<>();
        List<Integer> valor_hora = new ArrayList<>();
        List<Integer> totalesList = new ArrayList<>();
        int totales;
        int total = 0;

        horas_trabajadas.add(2);
        horas_trabajadas.add(4);
        horas_trabajadas.add(6);
        horas_trabajadas.add(7);
        horas_trabajadas.add(8);

        valor_hora.add(450);
        valor_hora.add(200);
        valor_hora.add(500);
        valor_hora.add(370);
        valor_hora.add(800);


        for (int i = 0; i < horas_trabajadas.size(); i++) {
            totales = horas_trabajadas.get(i) * valor_hora.get(i);
            totalesList.add(totales);
        }

        for (int i = 0; i < totalesList.size(); i++) {
            total += totalesList.get(i);
        }

        System.out.println(totalesList);
        System.out.println("El total es: $" + total);
    }
}
