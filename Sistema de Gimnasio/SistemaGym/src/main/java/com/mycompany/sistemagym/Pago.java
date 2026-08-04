/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagym;

/**
 *
 * @author MANUEL FELIPE
 */

public class Pago {

    private int id;
    private int idSocio;
    private String fecha;
    private double valor;
    private String estado;

    public Pago(int id, int idSocio, String fecha, double valor, String estado) {
        this.id = id;
        this.idSocio = idSocio;
        this.fecha = fecha;
        this.valor = valor;
        this.estado = estado;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public String getEstado() {
        return estado;
    }

    public void mostrarDatos() {
        System.out.println("ID Pago: " + id);
        System.out.println("ID Socio: " + idSocio);
        System.out.println("Fecha: " + fecha);
        System.out.println("Valor: $" + valor);
        System.out.println("Estado: " + estado);
        System.out.println("------------------------------");
    }
}
