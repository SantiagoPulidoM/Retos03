package principal;
import salud.empleado;
import salud.persona;

public class Inicio {
    public static void main(String[] args) {
        persona persona1 = new persona();
        empleado empleado1 = new empleado();
        empleado1.pedirDatos();
        empleado1.mostrarEmpleado();
        persona1.pedirDatos();
        persona1.mostrarPersona();
        persona1.calcularImc();
        if (persona1.mayorEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
