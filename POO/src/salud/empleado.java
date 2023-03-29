package salud;
import java.util.Scanner;

public class empleado extends persona {
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private double reteica = 0.00966; // 0.966%

    public double calcularHonorarios() {
        double honorarios = this.valorHora * this.horasTrabajadas * (1 - this.reteica);
        return honorarios;
    }
    
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de documento: ");
        String tipoDoc = scanner.nextLine();
        this.setTipoDoc(tipoDoc);

        System.out.print("Ingrese el número de documento: ");
        String documento = scanner.nextLine();
        this.setDocumento(documento);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        this.setNombre(nombre);

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        this.setApellido(apellido);

        System.out.print("Ingrese el peso: ");
        double peso = scanner.nextDouble();
        this.setPeso(peso);

        System.out.print("Ingrese la estatura: ");
        double estatura = scanner.nextDouble();
        this.setEstatura(estatura);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        this.setEdad(edad);

        System.out.print("Ingrese el sexo: ");
        String sexo = scanner.next();
        this.setSexo(sexo);

        scanner.nextLine(); // limpiar buffer de entrada
        
        System.out.print("Ingrese el cargo: ");
        String cargo = scanner.nextLine();
        this.cargo = cargo;

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        this.horasTrabajadas = horasTrabajadas;

        System.out.print("Ingrese el valor por hora: ");
        double valorHora = scanner.nextDouble();
        this.valorHora = valorHora;
        scanner.close();
    }

    private void setSexo(String sexo) {
    }

    private void setEdad(int edad) {
    }

    private void setEstatura(double estatura) {
    }

    private void setPeso(double peso) {
    }

    private void setApellido(String apellido) {
    }

    private void setNombre(String nombre) {
    }

    private void setDocumento(String documento) {
    }

    private void setTipoDoc(String tipoDoc) {
    }

    public void mostrarEmpleado() {
        System.out.println("Tipo de Documento: " + this.getTipoDoc());
        System.out.println("Número de Documento: " + this.getDocumento());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Estatura: " + this.getEstatura());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Horas Trabajadas: " + this.horasTrabajadas);
        System.out.println("Valor por Hora: " + this.valorHora);
        System.out.println("Total a Pagar: " + this.calcularHonorarios());
    }

    private String getEdad() {
        return null;
    }

    private String getSexo() {
        return null;
    }

    private String getEstatura() {
        return null;
    }

    private String getPeso() {
        return null;
    }

    private String getApellido() {
        return null;
    }

    private String getNombre() {
        return null;
    }

    private String getDocumento() {
        return null;
    }

    private String getTipoDoc() {
        return null;
    }
}
