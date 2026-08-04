/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    String nombre;
    List<Habitacion> habitaciones;
    List<Huesped> huespedes;

    public Hotel(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del hotel no puede estar vacio.");
        }
        this.nombre = nombre.trim();
        this.habitaciones = new ArrayList<>();
        this.huespedes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean registrarHabitacion(Habitacion nuevaHabitacion) {
        if (nuevaHabitacion == null) {
            throw new IllegalArgumentException("La habitacion a registrar no puede ser nula.");
        }
        if (buscarHabitacion(nuevaHabitacion.getNumero()) != null) {
            throw new IllegalArgumentException("Ya existe una habitacion con el numero " + nuevaHabitacion.getNumero());
        }
        return this.habitaciones.add(nuevaHabitacion);
    }

    public Habitacion buscarHabitacion(int numero) {
        for (Habitacion hab : habitaciones) {
            if (hab.getNumero() == numero) {
                return hab;
            }
        }
        return null;
    }

    public List<Habitacion> obtenerHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion hab : habitaciones) {
            if (hab.getEstado().equalsIgnoreCase("DISPONIBLE")) {
                disponibles.add(hab);
            }
        }
        return disponibles;
    }

    public List<Habitacion> obtenerHabitacionesOcupadas() {
        List<Habitacion> ocupadas = new ArrayList<>();
        for (Habitacion hab : habitaciones) {
            if (hab.getEstado().equalsIgnoreCase("OCUPADA")) {
                ocupadas.add(hab);
            }
        }
        return ocupadas;
    }

    public List<Habitacion> getTodasLasHabitaciones() {
        return new ArrayList<>(habitaciones);
    }

    public boolean registrarHuesped(Huesped nuevoHuesped) {
        if (nuevoHuesped == null) {
            throw new IllegalArgumentException("El huesped no puede ser nulo.");
        }
        if (buscarHuesped(nuevoHuesped.getDocumentoIdentidad()) != null) {
            throw new IllegalArgumentException("Ya existe un huesped con el documento " + nuevoHuesped.getDocumentoIdentidad());
        }
        return this.huespedes.add(nuevoHuesped);
    }

    public Huesped buscarHuesped(String documentoIdentidad) {
        if (documentoIdentidad == null) return null;
        for (Huesped hue : huespedes) {
            if (hue.getDocumentoIdentidad().equalsIgnoreCase(documentoIdentidad.trim())) {
                return hue;
            }
        }
        return null;
    }

    public List<Huesped> getTodosLosHuespedes() {
        return new ArrayList<>(huespedes);
    }
}