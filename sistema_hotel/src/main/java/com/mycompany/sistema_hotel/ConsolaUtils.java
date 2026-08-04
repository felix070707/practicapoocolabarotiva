/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_hotel;

import java.util.Scanner;

public class ConsolaUtils {

    static final Scanner scanner = new Scanner(System.in);

    public static String leerTexto(String mensaje) {
        String entrada;
        while (true) {
            System.out.print(mensaje);
            entrada = scanner.nextLine().trim();
            if (!entrada.isEmpty()) {
                return entrada;
            }
            System.err.println("El campo no puede estar vacio. Intenta de nuevo.");
        }
    }

    public static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                String entrada = scanner.nextLine().trim();
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.err.println("Entrada invalida. Debes ingresar un numero entero valido.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                String entrada = scanner.nextLine().trim().replace(",", ".");
                double valor = Double.parseDouble(entrada);
                if (valor > 0) {
                    return valor;
                }
                System.err.println("El valor debe ser mayor a 0.");
            } catch (NumberFormatException e) {
                System.err.println("Entrada invalida. Debes ingresar un monto numerico valido.");
            }
        }
    }
}
