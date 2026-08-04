/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagym;

/**
 *
 * @author MANUEL FELIPE
 */

import java.util.ArrayList;

public class Gimnasio {

    private ArrayList<Socio> socios;
    private ArrayList<Entrenador> entrenadores;
    private ArrayList<Rutina> rutinas;
    private ArrayList<Pago> pagos;

    public Gimnasio() {

        socios = new ArrayList<>();
        entrenadores = new ArrayList<>();
        rutinas = new ArrayList<>();
        pagos = new ArrayList<>();

    }

    // ===========================
    // GESTION DE SOCIOS
    // ===========================

    public void registrarSocio(Socio socio) {

        socios.add(socio);
        System.out.println("Socio registrado correctamente.");

    }

    public void consultarSocios() {

        if (socios.isEmpty()) {

            System.out.println("No hay socios registrados.");
            return;

        }

        for (Socio socio : socios) {

            socio.mostrarDatos();

        }

    }

    public Socio buscarSocio(int id) {

        for (Socio socio : socios) {

            if (socio.getId() == id) {

                return socio;

            }

        }

        return null;

    }

    public void eliminarSocio(int id) {

        Socio socio = buscarSocio(id);

        if (socio != null) {

            socios.remove(socio);
            System.out.println("Socio eliminado correctamente.");

        } else {

            System.out.println("Socio no encontrado.");

        }

    }

    // ===========================
    // GESTION DE ENTRENADORES
    // ===========================

    public void registrarEntrenador(Entrenador entrenador) {

        entrenadores.add(entrenador);

        System.out.println("Entrenador registrado correctamente.");

    }

    public void consultarEntrenadores() {

        if (entrenadores.isEmpty()) {

            System.out.println("No hay entrenadores registrados.");
            return;

        }

        for (Entrenador entrenador : entrenadores) {

            entrenador.mostrarDatos();

        }

    }

    public Entrenador buscarEntrenador(int id) {

        for (Entrenador entrenador : entrenadores) {

            if (entrenador.getId() == id) {

                return entrenador;

            }

        }

        return null;

    }

    public void asignarEntrenador(int idSocio, int idEntrenador) {

        Socio socio = buscarSocio(idSocio);

        Entrenador entrenador = buscarEntrenador(idEntrenador);

        if (socio != null && entrenador != null) {

            socio.setEntrenador(entrenador.getNombre());

            System.out.println("Entrenador asignado correctamente.");

        } else {

            System.out.println("Socio o entrenador no encontrado.");

        }

    }

    // ===========================
    // GESTION DE RUTINAS
    // ===========================

    public void crearRutina(Rutina rutina) {

        rutinas.add(rutina);

        System.out.println("Rutina creada correctamente.");

    }

    public Rutina buscarRutina(int id) {

        for (Rutina rutina : rutinas) {

            if (rutina.getId() == id) {

                return rutina;

            }

        }

        return null;

    }

    public void consultarRutinas() {

        if (rutinas.isEmpty()) {

            System.out.println("No hay rutinas registradas.");

            return;

        }

        for (Rutina rutina : rutinas) {

            rutina.mostrarDatos();

        }

    }
    
        public void asignarRutina(int idSocio, int idRutina) {

        Socio socio = buscarSocio(idSocio);
        Rutina rutina = buscarRutina(idRutina);

        if (socio != null && rutina != null) {

            socio.setRutina(rutina.getNombre());

            System.out.println("Rutina asignada correctamente.");

        } else {

            System.out.println("Socio o rutina no encontrados.");

        }

    }

    public void modificarRutina(int id, String nombre,
            String descripcion, int duracion, String nivel) {

        Rutina rutina = buscarRutina(id);

        if (rutina != null) {

            rutina.setNombre(nombre);
            rutina.setDescripcion(descripcion);
            rutina.setDuracion(duracion);
            rutina.setNivel(nivel);

            System.out.println("Rutina modificada correctamente.");

        } else {

            System.out.println("Rutina no encontrada.");

        }

    }

    // ===========================
    // GESTION DE PAGOS
    // ===========================

    public void registrarPago(Pago pago) {

        pagos.add(pago);

        System.out.println("Pago registrado correctamente.");

    }

    public void consultarPagos() {

        if (pagos.isEmpty()) {

            System.out.println("No hay pagos registrados.");
            return;

        }

        for (Pago pago : pagos) {

            pago.mostrarDatos();

        }

    }

    // ===========================
    // REPORTES
    // ===========================

    public void reporteMorosos() {

        boolean encontrado = false;

        System.out.println("\n=========== REPORTE DE MOROSOS ===========");

        for (Pago pago : pagos) {

            if (pago.getEstado().equalsIgnoreCase("Pendiente")) {

                Socio socio = buscarSocio(pago.getIdSocio());

                if (socio != null) {

                    System.out.println("ID: " + socio.getId());
                    System.out.println("Nombre: " + socio.getNombre());
                    System.out.println("Estado del pago: Pendiente");
                    System.out.println("--------------------------------");

                    encontrado = true;

                }

            }

        }

        if (!encontrado) {

            System.out.println("No existen socios morosos.");

        }

    }

}

