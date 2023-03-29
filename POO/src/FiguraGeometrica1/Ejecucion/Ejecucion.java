package Ejecucion;

import java.util.Scanner;

import Circulo.Circulo;
import Rectangulo.Rectangulo;
import Triangulo.Triangulo;
public class Ejecucion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Calcular el área de un Triángulo");
            System.out.println("2. Calcular el área de un Rectángulo");
            System.out.println("3. Calcular el área de un Círculo");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base del Triángulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del Triángulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("El área del Triángulo es: " + triangulo.calcularArea());
                    break;
                case 2:
                    System.out.print("Ingrese la base del Rectángulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del Rectángulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("El área del Rectángulo es: " + rectangulo.calcularArea());
                    break;
                case 3:
                    System.out.print("Ingrese el radio del Círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    Circulo circulo = new Circulo(radioCirculo);
                    System.out.println("El área del Círculo es: " + circulo.calcularArea());
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        }while(opcion!=0);{
            
        }
        scanner.close();
    }
    }
