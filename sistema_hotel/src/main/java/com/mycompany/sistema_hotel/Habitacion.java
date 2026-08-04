/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_hotel;

public class Habitacion {

    int numero;
    String tipo;
    double precioPorNoche;
    String estado;

    public Habitacion(int numero, String tipo, double precioPorNoche) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El numero de habitacion debe ser mayor a cero.");
        }
        if (precioPorNoche <= 0) {
            throw new IllegalArgumentException("El precio por noche debe ser mayor a cero.");
        }
        this.numero = numero;
        this.tipo = normalizarTipo(tipo);
        this.precioPorNoche = precioPorNoche;
        this.estado = "DISPONIBLE";
    }

    String normalizarTipo(String tipoInput) {
        if (tipoInput == null) {
            throw new IllegalArgumentException("El tipo de habitacion no puede ser nulo.");
        }
        String tipoLimpio = tipoInput.trim().toUpperCase();
        if (!tipoLimpio.equals("SENCILLA") && !tipoLimpio.equals("DOBLE") && !tipoLimpio.equals("SUITE")) {
            throw new IllegalArgumentException("Tipo de habitacion invalido. Debe ser SENCILLA, DOBLE o SUITE.");
        }
        return tipoLimpio;
    }

    public void cambiarEstado(String nuevoEstado) {
        if (nuevoEstado == null) {
            throw new IllegalArgumentException("El estado no puede ser nulo.");
        }
        String estadoLimpio = nuevoEstado.trim().toUpperCase();
        if (!estadoLimpio.equals("DISPONIBLE") && !estadoLimpio.equals("OCUPADA") && !estadoLimpio.equals("MANTENIMIENTO")) {
            throw new IllegalArgumentException("Estado invalido. Debe ser DISPONIBLE, OCUPADA o MANTENIMIENTO.");
        }
        this.estado = estadoLimpio;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        if (precioPorNoche <= 0) {
            throw new IllegalArgumentException("El precio por noche debe ser mayor a cero.");
        }
        this.precioPorNoche = precioPorNoche;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Habitacion N. " + numero + " | Tipo: " + tipo + " | Precio: $" + precioPorNoche + " | Estado: " + estado;
    }
}