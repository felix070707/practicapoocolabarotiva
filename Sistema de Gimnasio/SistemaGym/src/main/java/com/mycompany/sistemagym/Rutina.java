/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagym;

/**
 *
 * @author MANUEL FELIPE
 */

public class Rutina {

    private int id;
    private String nombre;
    private String descripcion;
    private int duracion;
    private String nivel;

    public Rutina(int id, String nombre, String descripcion, int duracion, String nivel) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Duracion: " + duracion + " minutos");
        System.out.println("Nivel: " + nivel);
        System.out.println("------------------------------");
    }
}