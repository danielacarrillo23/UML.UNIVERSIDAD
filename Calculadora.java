import java.util.Scanner;

public class Calculadora {

    // Función que aplica la operación aritmética indicada
    public static double aplicarOperacion(int num1, int num2, String operador) {
        double resultado = 0.0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN; // Retorna Not-a-Number para indicar error
                }
                break;
            case "%":
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN; // Retorna Not-a-Number para indicar error
                }
                break;
            case "**":
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Operador no válido.");
                return Double.NaN; // Retorna Not-a-Number para indicar error
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Leer el operador aritmético
        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Aplicar la operación y obtener el resultado
        double resultado = aplicarOperacion(num1, num2, operador);

        // Verificar si el resultado es válido antes de imprimir
        if (!Double.isNaN(resultado)) {
            System.out.println("El resultado de la operación es: " + resultado);
        }

        // Cerrar el scanner
        scanner.close();
    }
}

