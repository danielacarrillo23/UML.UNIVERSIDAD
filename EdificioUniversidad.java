import java.util.Scanner;

public class EdificioUniversidad {

    // Función que calcula el número de salones necesarios
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        if (capacidadSalon <= 0) {
            throw new IllegalArgumentException("La capacidad del salón debe ser mayor que 0");
        }
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Función que calcula el número de pisos necesarios
    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        if (salonesPorPiso <= 0) {
            throw new IllegalArgumentException("El número de salones por piso debe ser mayor que 0");
        }
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt();

        // Leer la capacidad de un salón
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        // Leer el número de salones por piso
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular el número de salones
        int numeroSalones = calcularNumeroSalones(numeroEstudiantes, capacidadSalon);

        // Calcular el número de pisos
        int numeroPisos = calcularNumeroPisos(numeroSalones, salonesPorPiso);

        // Mostrar los resultados
        System.out.println("Número de salones necesarios: " + numeroSalones);
        System.out.println("Número de pisos necesarios: " + numeroPisos);

        // Cerrar el scanner
        scanner.close();
    }
}
