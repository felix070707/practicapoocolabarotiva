/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_hotel;

public class Huesped {

    String documentoIdentidad;
    String nombreCompleto;
    String email;
    String telefono;

    public Huesped(String documentoIdentidad, String nombreCompleto, String email, String telefono) {
        if (documentoIdentidad == null || documentoIdentidad.trim().isEmpty()) {
            throw new IllegalArgumentException("El documento de identidad no puede estar vacio.");
        }
        if (nombreCompleto == null || nombreCompleto.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre completo no puede estar vacio.");
        }
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("El correo electronico no tiene un formato valido.");
        }
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El telefono no puede estar vacio.");
        }

        this.documentoIdentidad = documentoIdentidad.trim();
        this.nombreCompleto = nombreCompleto.trim();
        this.email = email.trim();
        this.telefono = telefono.trim();
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre completo no puede estar vacio.");
        }
        this.nombreCompleto = nombreCompleto.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("El correo electronico no tiene un formato valido.");
        }
        this.email = email.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El telefono no puede estar vacio.");
        }
        this.telefono = telefono.trim();
    }

    @Override
    public String toString() {
        return "Huesped: " + nombreCompleto + " | Doc: " + documentoIdentidad + " | Email: " + email + " | Tel: " + telefono;
    }
}