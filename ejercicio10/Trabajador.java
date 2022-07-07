
package ejercicio10;

public class Trabajador extends Persona1 {
    long salario;

    public Trabajador(long salario, String telefono, int edad, String nombre) {
        super(telefono, edad, nombre);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "salario = " + salario + ", telefono = " + telefono + ", edad = " + edad + ", nombre = " + nombre +'}';
    }
    
}
