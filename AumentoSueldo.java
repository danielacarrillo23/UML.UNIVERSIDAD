import java.util.Scanner;

public class AumentoSueldo {

    // Función que recibe el sueldo actual y retorna el valor del aumento
    public static double calcularAumento(double sueldo) {
        double aumento;

        if (sueldo <= 800000) {
            aumento = sueldo * 0.10; // 10% de aumento
        } else if (sueldo <= 1200000) {
            aumento = sueldo * 0.08; // 8% de aumento
        } else {
            aumento = sueldo * 0.05; // 5% de aumento
        }

        return aumento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el sueldo actual del empleado
        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        // Calcular el valor del aumento usando la función
        double aumento = calcularAumento(sueldoActual);

        // Calcular el nuevo salario
        double nuevoSalario = sueldoActual + aumento;

        // Imprimir el valor del aumento y el nuevo salario
        System.out.printf("El valor del aumento es: %.2f%n", aumento);
        System.out.printf("El nuevo salario es: %.2f%n", nuevoSalario);

        // Cerrar el scanner
        scanner.close();
    }
}
