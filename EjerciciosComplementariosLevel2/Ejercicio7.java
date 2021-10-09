package EjerciciosComplementariosLevel2;
import java.util.*;
public class Ejercicio7 {
    public static List<String> FizzBuzzFuncion(int a, int b) {
        List<String> numeros = new ArrayList<>();

        for (int i = a; i < b; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                numeros.add("FizzBuzz");
            } else if (i % 2 == 0) {
                numeros.add("Fizz");
            } else if (i % 3 == 0) {
                numeros.add("Buzz");
            } else {
                numeros.add("" + i);
            }
        }

        return numeros;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(FizzBuzzFuncion(a, b));
        scan.close();
    }
}
