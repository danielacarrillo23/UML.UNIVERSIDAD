package com.mycompany.act2ejerciciosdeprogra;

public class FuncionAlgebraica {
    // Método estático para calcular el valor de la función algebraica
    public static int calcularFuncion(int x, int y) {
        return x * x + 2 * x * y + y * y;
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // Definir valores de ejemplo para x e y
        int x = 5;
        int y = 3;

        // Calcular el valor de la función algebraica
        int resultado = calcularFuncion(x, y);

        // Mostrar el resultado
        System.out.println("El resultado de f(x, y) para x = " + x + " y y = " + y + " es: " + resultado);
    }
}