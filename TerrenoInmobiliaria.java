import java.util.Scanner;

public class TerrenoInmobiliaria {

    // Función para hallar el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para hallar la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    // Función para hallar el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    // Función para hallar el perímetro del terreno
    public static double calcularPerimetro(double ladoA, double ladoB, double ladoC) {
        // Primero, encontrar la hipotenusa del triángulo rectángulo
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        // El perímetro es la suma de todos los lados
        return ladoA + ladoB + hipotenusa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las dimensiones del terreno
        System.out.print("Ingrese el lado A del triángulo rectángulo: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese el lado B del triángulo rectángulo: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese el lado C del rectángulo: ");
        double ladoC = scanner.nextDouble();

        // Hallar la hipotenusa del triángulo
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);

        // Calcular el área del rectángulo (ladoC es la base y la altura del rectángulo)
        double areaRectangulo = calcularAreaRectangulo(ladoC, ladoC);

        // Calcular el área del triángulo rectángulo
        double areaTriangulo = calcularAreaTriangulo(ladoA, ladoB);

        // Calcular el perímetro del terreno
        double perimetro = calcularPerimetro(ladoA, ladoB, ladoC);

        // Mostrar los resultados
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Área del triángulo rectángulo: " + areaTriangulo);
        System.out.println("Perímetro del terreno: " + perimetro);

        // Cerrar el scanner
        scanner.close();
    }
}

