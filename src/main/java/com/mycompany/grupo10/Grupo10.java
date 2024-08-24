/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.grupo10;

import java.util.Scanner;

public class Grupo10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los datos del vendedor
        System.out.print("Ingrese el nombre del vendedor: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el sueldo mensual del vendedor: ");
        double sueldoMensual = scanner.nextDouble();

        // Ingresar las ventas realizadas
        System.out.print("Ingrese el monto de la venta 1: ");
        double venta1 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la venta 2: ");
        double venta2 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la venta 3: ");
        double venta3 = scanner.nextDouble();

        // Calcular la comisión (10% de la suma de las tres ventas)
        double comision = (venta1 + venta2 + venta3) * 0.10;

        // Calcular el sueldo total
        double sueldoTotal = sueldoMensual + comision;

        // Mostrar los resultados
        System.out.println("\nResumen del Vendedor:");
        System.out.println("Nombre del Vendedor: " + nombre);
        System.out.println("Sueldo Mensual: S/ " + sueldoMensual);
        System.out.println("Comisión por ventas: S/ " + comision);
        System.out.println("Sueldo Total a recibir: S/ " + sueldoTotal);
    }
}
