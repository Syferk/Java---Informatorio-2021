package EjerciciosComplementariosLevel2;
import java.util.*;

public class Ejercicio4 {
    public static void cargarEstudiantes(List<String> estudiantes) {
        for (int i = 1; i < 13; i++) {
            estudiantes.add("Estudiante " + i);
        }
    }

    public static void imprimir(List<String> estudiantes) {
        for (String estudiante: estudiantes) {
            System.out.println(estudiante);
        }
    }

    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<>();

        cargarEstudiantes(estudiantes);
        System.out.println("Total:");
        imprimir(estudiantes);

        List<String> a = estudiantes.subList(0, 4);
        List<String> b = estudiantes.subList(4, 8);
        List<String> c = estudiantes.subList(8, 12);

        System.out.println("\n" + "Curso A:");
        imprimir(a);

        System.out.println("\n" + "Curso B:");
        imprimir(b);

        System.out.println("\n" + "Curso C:");
        imprimir(c);
    }
}
