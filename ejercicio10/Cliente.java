
package ejercicio10;

public class Cliente extends Persona1 {
    long credito;

    public Cliente(long credito, String telefono, int edad, String nombre) {
        super(telefono, edad, nombre);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "credito = " + credito + ", telefono = " + telefono + ", edad = " + edad + ", nombre = " + nombre +'}';
    }
    
}
