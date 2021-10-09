package EjerciciosComplementariosLevel2.Ejercicio6;

public class Empleados {

    private String nombre;
    private int dni;
    private int horas_trabajadas;
    private int valorphora;

    public Empleados(String nombre, int dni,  int horas_trabajadas, int valorphora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horas_trabajadas = horas_trabajadas;
        this.valorphora = valorphora;
    }

    @Override
    public String toString() {
        return String.valueOf(this.dni) + " - " + this.nombre + " - " + String.valueOf(this.horas_trabajadas + " - " + String.valueOf(this.valorphora));
    }

    public int getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getHoras_trabajadas() {
        return this.horas_trabajadas;
    }

    public int getValorphora() {
        return this.valorphora;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public void setValorphora(int valorphora) {
        this.valorphora = valorphora;
    }

    public int calcularSueldo() {
        return (this.horas_trabajadas * this.valorphora);
    }

}
