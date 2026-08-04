/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_hotel;

public class Sistema_hotel {

    static Hotel hotel = new Hotel("Grand Hotel Continental");

    public static void main(String[] args) {
        cargarDatosSemilla();

        int opcion = -1;
        do {
            mostrarMenuPrincipal();
            opcion = ConsolaUtils.leerEntero("Selecciona una opcion: ");
            System.out.println();

            switch (opcion) {
                case 1 -> menuGestionHabitaciones();
                case 2 -> menuGestionHuespedes();
                case 3 -> System.out.println("[DEV 2] Gestion de Reservas en construccion...");
                case 4 -> System.out.println("[DEV 2] Check-in en construccion...");
                case 5 -> System.out.println("[DEV 2] Check-out en construccion...");
                case 6 -> System.out.println("[DEV 2] Facturacion en construccion...");
                case 7 -> mostrarReporteGeneral();
                case 0 -> System.out.println("Gracias por usar el Sistema de Gestion del Hotel!");
                default -> System.err.println("Opcion no valida. Intenta de nuevo.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    static void mostrarMenuPrincipal() {
        System.out.println("============= HOTEL " + hotel.getNombre().toUpperCase() + " =============");
        System.out.println("1. Gestion de Habitaciones");
        System.out.println("2. Gestion de Huespedes");
        System.out.println("3. Gestion de Reservas");
        System.out.println("4. Check-in");
        System.out.println("5. Check-out");
        System.out.println("6. Facturacion");
        System.out.println("7. Reportes Basicos");
        System.out.println("0. Salir");
        System.out.println("===================================================");
    }

    static void menuGestionHabitaciones() {
        int opcion = -1;
        do {
            System.out.println("--- GESTION DE HABITACIONES ---");
            System.out.println("1. Registrar habitacion");
            System.out.println("2. Consultar todas las habitaciones");
            System.out.println("3. Consultar habitaciones disponibles");
            System.out.println("4. Consultar habitaciones ocupadas");
            System.out.println("5. Cambiar estado de habitacion");
            System.out.println("0. Volver al menu principal");

            opcion = ConsolaUtils.leerEntero("Opcion: ");

            switch (opcion) {
                case 1 -> {
                    int num = ConsolaUtils.leerEntero("Numero de habitacion: ");
                    String tipo = ConsolaUtils.leerTexto("Tipo (Sencilla / Doble / Suite): ");
                    double precio = ConsolaUtils.leerDouble("Precio por noche: ");
                    try {
                        Habitacion nueva = new Habitacion(num, tipo, precio);
                        if (hotel.registrarHabitacion(nueva)) {
                            System.out.println("Habitacion registrada exitosamente.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                case 2 -> listarListaHabitaciones(hotel.getTodasLasHabitaciones(), "TODAS LAS HABITACIONES");
                case 3 -> listarListaHabitaciones(hotel.obtenerHabitacionesDisponibles(), "HABITACIONES DISPONIBLES");
                case 4 -> listarListaHabitaciones(hotel.obtenerHabitacionesOcupadas(), "HABITACIONES OCUPADAS");
                case 5 -> {
                    int num = ConsolaUtils.leerEntero("Ingrese el numero de habitacion a modificar: ");
                    Habitacion hab = hotel.buscarHabitacion(num);
                    if (hab != null) {
                        System.out.println("Estado actual: " + hab.getEstado());
                        String nuevoEstado = ConsolaUtils.leerTexto("Nuevo estado (DISPONIBLE / OCUPADA / MANTENIMIENTO): ");
                        try {
                            hab.cambiarEstado(nuevoEstado);
                            System.out.println("Estado actualizado con exito.");
                        } catch (IllegalArgumentException e) {
                            System.err.println("Error: " + e.getMessage());
                        }
                    } else {
                        System.err.println("Habitacion no encontrada.");
                    }
                }
                case 0 -> System.out.println("Volviendo...");
                default -> System.err.println("Opcion invalida.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    static void menuGestionHuespedes() {
        int opcion = -1;
        do {
            System.out.println("--- GESTION DE HUESPEDES ---");
            System.out.println("1. Registrar huesped");
            System.out.println("2. Consultar huesped por documento");
            System.out.println("3. Listar todos los huespedes");
            System.out.println("0. Volver al menu principal");

            opcion = ConsolaUtils.leerEntero("Opcion: ");

            switch (opcion) {
                case 1 -> {
                    String doc = ConsolaUtils.leerTexto("Documento de Identidad: ");
                    String nom = ConsolaUtils.leerTexto("Nombre completo: ");
                    String email = ConsolaUtils.leerTexto("Email: ");
                    String tel = ConsolaUtils.leerTexto("Telefono: ");
                    try {
                        Huesped nuevo = new Huesped(doc, nom, email, tel);
                        if (hotel.registrarHuesped(nuevo)) {
                            System.out.println("Huesped registrado exitosamente.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                case 2 -> {
                    String doc = ConsolaUtils.leerTexto("Ingrese el documento a buscar: ");
                    Huesped hue = hotel.buscarHuesped(doc);
                    if (hue != null) {
                        System.out.println("Huesped encontrado:\n  " + hue);
                    } else {
                        System.err.println("Huesped no encontrado.");
                    }
                }
                case 3 -> {
                    java.util.List<Huesped> lista = hotel.getTodosLosHuespedes();
                    if (lista.isEmpty()) {
                        System.out.println("No hay huespedes registrados.");
                    } else {
                        System.out.println("LISTA DE HUESPEDES:");
                        for (Huesped h : lista) {
                            System.out.println("  - " + h);
                        }
                    }
                }
                case 0 -> System.out.println("Volviendo...");
                default -> System.err.println("Opcion invalida.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    static void listarListaHabitaciones(java.util.List<Habitacion> lista, String titulo) {
        if (lista.isEmpty()) {
            System.out.println("No hay habitaciones para mostrar en '" + titulo + "'.");
        } else {
            System.out.println(titulo + ":");
            for (Habitacion h : lista) {
                System.out.println("  - " + h);
            }
        }
    }

    static void mostrarReporteGeneral() {
        System.out.println("--- REPORTE GENERAL DEL HOTEL ---");
        System.out.println("Total Habitaciones: " + hotel.getTodasLasHabitaciones().size());
        System.out.println("Habitaciones Disponibles: " + hotel.obtenerHabitacionesDisponibles().size());
        System.out.println("Habitaciones Ocupadas: " + hotel.obtenerHabitacionesOcupadas().size());
        System.out.println("Total Huespedes Registrados: " + hotel.getTodosLosHuespedes().size());
    }

    static void cargarDatosSemilla() {
        hotel.registrarHabitacion(new Habitacion(101, "Sencilla", 80000.0));
        hotel.registrarHabitacion(new Habitacion(102, "Doble", 130000.0));
        hotel.registrarHabitacion(new Habitacion(201, "Suite", 250000.0));
        hotel.registrarHuesped(new Huesped("1098765432", "Alejandro Ruiz", "alejo@email.com", "3001234567"));
    }
}