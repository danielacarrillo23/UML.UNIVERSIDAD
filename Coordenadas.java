import java.util.Scanner;

public class Coordenadas {

    // Función para calcular la distancia entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Función para calcular la pendiente de la recta que une dos puntos
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        if (x2 - x1 == 0) {
            throw new ArithmeticException("La pendiente es indefinida (x2 - x1 es 0)");
        }
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las coordenadas del primer punto
        System.out.print("Ingrese la coordenada x1 del primer punto: ");
        double x1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y1 del primer punto: ");
        double y1 = scanner.nextDouble();

        // Leer las coordenadas del segundo punto
        System.out.print("Ingrese la coordenada x2 del segundo punto: ");
        double x2 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y2 del segundo punto: ");
        double y2 = scanner.nextDouble();

        // Calcular la distancia y la pendiente
        double distancia = calcularDistancia(x1, y1, x2, y2);
        double pendiente = 0;

        try {
            pendiente = calcularPendiente(x1, y1, x2, y2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Mostrar los resultados
        System.out.println("Distancia entre los puntos: " + distancia);
        System.out.println("Pendiente de la recta que une los puntos: " + pendiente);

        // Cerrar el scanner
        scanner.close();
    }
}
