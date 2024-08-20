import java.util.Scanner;

public class DiaSiguiente {

    // Función que recibe el nombre de un día y retorna el nombre del día siguiente
    public static String obtenerDiaSiguiente(String dia) {
        // Arreglo con los nombres de los días de la semana
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        
        // Buscar el índice del día dado
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equalsIgnoreCase(dia)) {
                // Retornar el siguiente día, considerando el ciclo semanal
                return dias[(i + 1) % dias.length];
            }
        }
        
        // Si el día no es válido, retornar un mensaje de error
        return "Día no válido";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el nombre del día
        System.out.print("Ingrese el nombre de un día de la semana: ");
        String dia = scanner.nextLine().trim().toLowerCase();

        // Obtener y mostrar el nombre del día siguiente
        String diaSiguiente = obtenerDiaSiguiente(dia);
        if (diaSiguiente.equals("Día no válido")) {
            System.out.println(diaSiguiente);
        } else {
            System.out.println("El día siguiente a " + dia + " es " + diaSiguiente + ".");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
