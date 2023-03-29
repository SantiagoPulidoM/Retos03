package salud;

import java.util.Scanner;

public class persona {
    private String tipoDoc;
    private long documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private char sexo;

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos de la persona: ");
        System.out.print("Tipo de documento: ");
        this.tipoDoc = sc.nextLine();
        System.out.print("Documento: ");
        this.documento = sc.nextLong();
        sc.nextLine();
        System.out.print("Nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Apellido: ");
        this.apellido = sc.nextLine();
        System.out.print("Peso en kg: ");
        this.peso = sc.nextDouble();
        System.out.print("Estatura en m: ");
        this.estatura = sc.nextDouble();
        System.out.print("Edad: ");
        this.edad = sc.nextInt();
        System.out.print("Sexo (M o F): ");
        this.sexo = sc.next().charAt(0);
        sc.close();
    }

    public void mostrarPersona() {
        System.out.println("\nDatos de la persona:");
        System.out.println("Tipo de documento: " + this.tipoDoc);
        System.out.println("Documento: " + this.documento);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Estatura: " + this.estatura + " m");
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Sexo: " + this.sexo);
    }

    public void calcularImc() {
        double imc = this.peso / Math.pow(this.estatura, 2);
        System.out.print("IMC: " + imc);
        if (imc < 20) {
            System.out.println(" (por debajo de lo ideal)");
        } else if (imc <= 25) {
            System.out.println(" (ideal)");
        } else {
            System.out.println(" (sobrepeso)");
        }
    }

    public boolean mayorEdad() {
        return this.edad >= 18;
    }
}
