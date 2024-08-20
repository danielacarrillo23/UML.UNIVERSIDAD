import java.util.Scanner;

public class NumeroARomano {

    // Función que obtiene la cifra de las decenas
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función que obtiene la cifra de las unidades
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función que convierte un dígito de unidades a romano
    public static String convertirUnidadesARomano(int unidades) {
        switch (unidades) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return ""; // Para 0 o números inválidos
        }
    }

    // Función que convierte un dígito de decenas a romano
    public static String convertirDecenasARomano(int decenas) {
        switch (decenas) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return ""; // Para 0 o números inválidos
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número entero
        System.out.print("Ingrese un número entero entre 1 y 99: ");
        int numero = scanner.nextInt();

        // Validar el rango del número
        if (numero < 1 || numero > 99) {
            System.out.println("Error: El número debe estar entre 1 y 99.");
            return;
        }

        // Obtener las cifras de decenas y unidades
        int decenas = obtenerDecenas(numero);
        int unidades = obtenerUnidades(numero);

        // Convertir las cifras a números romanos
        String romanosDecenas = convertirDecenasARomano(decenas);
        String romanosUnidades = convertirUnidadesARomano(unidades);

        // Mostrar el resultado
        String resultado = romanosDecenas + romanosUnidades;
        System.out.println("El número " + numero + " en números romanos es: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }
}
