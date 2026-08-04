/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagym;

/**
 *
 * @author MANUEL FELIPE
 */


public class Socio {

    private int id;
    private String nombre;
    private String documento;
    private String telefono;
    private int edad;
    private String entrenador;
    private String rutina;

    public Socio(int id, String nombre, String documento, String telefono, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.edad = edad;
        this.entrenador = "Sin asignar";
        this.rutina = "Sin asignar";
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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public void setRutina(String rutina) {
        this.rutina = rutina;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Telefono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.println("Entrenador: " + entrenador);
        System.out.println("Rutina: " + rutina);
        System.out.println("------------------------------");
    }
}
