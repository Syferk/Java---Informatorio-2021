package EjerciciosComplementariosLevel2.Ejercicio6;
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Empleados emp2 = new Empleados("Fernando Paz", 40234556, 2, 150000);
        Empleados emp1 = new Empleados("Juan Delgado", 43348071, 20, 2);
        Empleados emp3 = new Empleados("Iara Acevedo", 42344556, 1, 0);
        Empleados emp4 = new Empleados("Fabricio Perelli", 35233445, 23, 1);

        Set<Empleados> empleados = new HashSet<>();

        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);

        Map<Integer, Integer> empleados_dicc = cargarDiccionario(empleados);

        imprimirDiccionario(empleados_dicc);
        
    }

    public static Map<Integer, Integer> cargarDiccionario(Set<Empleados> empleados) {
        Map<Integer, Integer> empleados_dicc = new HashMap<>();
        
        for (Empleados empleado: empleados) {
            System.out.println(empleado);
            empleados_dicc.put(empleado.getDni(), empleado.calcularSueldo());
        }

        return empleados_dicc;
    }

    public static void imprimirDiccionario(Map<Integer, Integer> empleados_dicc) {
        for (Map.Entry<Integer, Integer> empleado: empleados_dicc.entrySet()) {
            System.out.println("\n" + "DNI: " + empleado.getKey() + "\n" + "Sueldo: $" + empleado.getValue());
        }
    }
}
