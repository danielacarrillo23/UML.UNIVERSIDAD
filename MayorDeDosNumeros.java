import java.util.Scanner;

public class MayorDeDosNumeros {

    // Función que recibe dos números enteros y retorna el mayor
    public static int encontrarMayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los dos números enteros desde el teclado
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Encontrar el mayor de los dos números
        int mayor = encontrarMayor(numero1, numero2);

        // Imprimir el mayor número
        System.out.println("El mayor de los dos números es: " + mayor);

        // Cerrar el scanner
        scanner.close();
    }
}
