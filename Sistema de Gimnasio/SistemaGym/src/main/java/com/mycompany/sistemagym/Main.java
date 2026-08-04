/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package com.mycompany.sistemagym;
    
    

/**
 *
 * @author MANUEL FELIPE
 */


import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Gimnasio gimnasio = new Gimnasio();

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("\n=========== GIMNASIO ===========");
            System.out.println("1. Gestion de Socios");
            System.out.println("2. Gestion de Entrenadores");
            System.out.println("3. Gestion de Rutinas");
            System.out.println("4. Gestion de Pagos");
            System.out.println("5. Reportes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    menuSocios();
                    break;

                case 2:
                    menuEntrenadores();
                    break;

                case 3:
                    menuRutinas();
                    break;

                case 4:
                    menuPagos();
                    break;

                case 5:
                    gimnasio.reporteMorosos();
                    break;

                case 0:
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");

            }

        } while (opcion != 0);

    }

    //======================
    // MENU SOCIOS
    //======================

    public static void menuSocios() {

        int opcion;

        do {

            System.out.println("\n====== GESTION DE SOCIOS ======");
            System.out.println("1. Registrar socio");
            System.out.println("2. Actualizar datos");
            System.out.println("3. Eliminar socio");
            System.out.println("4. Consultar socios");
            System.out.println("0. Volver");
            System.out.print("Seleccione: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Documento: ");
                    String documento = scanner.nextLine();

                    System.out.print("Telefono: ");
                    String telefono = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();

                    gimnasio.registrarSocio(
                            new Socio(id, nombre, documento, telefono, edad));

                    break;

                case 2:

                    System.out.print("ID del socio: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();

                    Socio socio = gimnasio.buscarSocio(idActualizar);

                    if (socio != null) {

                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();

                        System.out.print("Nuevo telefono: ");
                        String nuevoTelefono = scanner.nextLine();

                        System.out.print("Nueva edad: ");
                        int nuevaEdad = scanner.nextInt();

                        socio.setNombre(nuevoNombre);
                        socio.setTelefono(nuevoTelefono);
                        socio.setEdad(nuevaEdad);

                        System.out.println("Datos actualizados.");

                    } else {

                        System.out.println("Socio no encontrado.");

                    }

                    break;

                case 3:

                    System.out.print("ID del socio: ");
                    int idEliminar = scanner.nextInt();

                    gimnasio.eliminarSocio(idEliminar);

                    break;

                case 4:

                    gimnasio.consultarSocios();

                    break;

                case 0:

                    break;

                default:

                    System.out.println("Opcion incorrecta.");

            }
        
            
            

        } while (opcion != 0);

    }
    
        //======================
    // MENU ENTRENADORES
    //======================

    public static void menuEntrenadores() {

        int opcion;

        do {

            System.out.println("\n====== GESTION DE ENTRENADORES ======");
            System.out.println("1. Registrar entrenador");
            System.out.println("2. Asignar entrenador");
            System.out.println("3. Consultar entrenadores");
            System.out.println("0. Volver");
            System.out.print("Seleccione: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Especialidad: ");
                    String especialidad = scanner.nextLine();

                    System.out.print("Telefono: ");
                    String telefono = scanner.nextLine();

                    gimnasio.registrarEntrenador(
                            new Entrenador(id, nombre, especialidad, telefono));

                    break;

                case 2:

                    System.out.print("ID del socio: ");
                    int idSocio = scanner.nextInt();

                    System.out.print("ID del entrenador: ");
                    int idEntrenador = scanner.nextInt();

                    gimnasio.asignarEntrenador(idSocio, idEntrenador);

                    break;

                case 3:

                    gimnasio.consultarEntrenadores();

                    break;

                case 0:

                    break;

                default:

                    System.out.println("Opcion incorrecta.");

            }

        } while (opcion != 0);

    }

    //======================
    // MENU RUTINAS
    //======================

    public static void menuRutinas() {

        int opcion;

        do {

            System.out.println("\n====== GESTION DE RUTINAS ======");
            System.out.println("1. Crear rutina");
            System.out.println("2. Modificar rutina");
            System.out.println("3. Asignar rutina");
            System.out.println("4. Consultar rutinas");
            System.out.println("0. Volver");
            System.out.print("Seleccione: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Descripcion: ");
                    String descripcion = scanner.nextLine();

                    System.out.print("Duracion (minutos): ");
                    int duracion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nivel: ");
                    String nivel = scanner.nextLine();

                    gimnasio.crearRutina(
                            new Rutina(id, nombre, descripcion, duracion, nivel));

                    break;

                case 2:

                    System.out.print("ID de la rutina: ");
                    int idRutina = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();

                    System.out.print("Nueva descripcion: ");
                    String nuevaDescripcion = scanner.nextLine();

                    System.out.print("Nueva duracion: ");
                    int nuevaDuracion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nuevo nivel: ");
                    String nuevoNivel = scanner.nextLine();

                    gimnasio.modificarRutina(idRutina, nuevoNombre,
                            nuevaDescripcion, nuevaDuracion, nuevoNivel);

                    break;

                case 3:

                    System.out.print("ID del socio: ");
                    int socio = scanner.nextInt();

                    System.out.print("ID de la rutina: ");
                    int rutina = scanner.nextInt();

                    gimnasio.asignarRutina(socio, rutina);

                    break;

                case 4:

                    gimnasio.consultarRutinas();

                    break;

                case 0:

                    break;

                default:

                    System.out.println("Opcion incorrecta.");

            }

        } while (opcion != 0);

    }

    //======================
    // MENU PAGOS
    //======================

    public static void menuPagos() {

        int opcion;

        do {

            System.out.println("\n====== GESTION DE PAGOS ======");
            System.out.println("1. Registrar pago");
            System.out.println("2. Consultar pagos");
            System.out.println("0. Volver");
            System.out.print("Seleccione: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

     switch (opcion) {

                case 1:

                    System.out.print("ID del pago: ");
                    int idPago = scanner.nextInt();

                    System.out.print("ID del socio: ");
                    int idSocio = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = scanner.nextLine();

                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Estado (Pagado/Pendiente): ");
                    String estado = scanner.nextLine();

                    gimnasio.registrarPago(
                            new Pago(idPago, idSocio, fecha, valor, estado));

                    break;

                case 2:

                    gimnasio.consultarPagos();

                    break;

                case 0:

                    break;

                default:

                    System.out.println("Opcion incorrecta.");

            }

        } while (opcion != 0);

    }

}



