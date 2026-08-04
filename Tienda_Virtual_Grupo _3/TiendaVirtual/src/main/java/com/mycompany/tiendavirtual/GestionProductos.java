/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendavirtual;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProductos {

    private ArrayList<Producto> inventario;
    private Scanner scanner;

    public GestionProductos() {
        inventario = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void registrarProducto() {
        System.out.println("\n--- REGISTRAR PRODUCTO ---");

        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        if (buscarProducto(codigo) != null) {
            System.out.println("Ya existe un producto con ese código.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());

        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        Producto producto = new Producto(codigo, nombre, precio, cantidad);
        inventario.add(producto);

        System.out.println("Producto registrado correctamente.");
    }

    public void actualizarProducto() {
        System.out.println("\n--- ACTUALIZAR PRODUCTO ---");
        System.out.print("Código del producto: ");

        Producto producto = buscarProducto(scanner.nextLine());

        if (producto == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.print("Nuevo nombre: ");
        producto.setNombre(scanner.nextLine());

        System.out.print("Nuevo precio: ");
        producto.setPrecio(Double.parseDouble(scanner.nextLine()));

        System.out.print("Nueva cantidad: ");
        producto.setCantidad(Integer.parseInt(scanner.nextLine()));

        System.out.println("Producto actualizado correctamente.");
    }

    public void eliminarProducto() {
        System.out.println("\n--- ELIMINAR PRODUCTO ---");
        System.out.print("Código del producto: ");

        Producto producto = buscarProducto(scanner.nextLine());

        if (producto == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        inventario.remove(producto);
        System.out.println("Producto eliminado correctamente.");
    }

    public void consultarInventario() {
        System.out.println("\n--- INVENTARIO ---");

        if (inventario.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }

    public void menuProductos() {
        int opcion;

        do {
            System.out.println("\n===== GESTIÓN DE PRODUCTOS =====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Consultar inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    actualizarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    consultarInventario();
                    break;
                case 5:
                    System.out.println("Saliendo del módulo de productos.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    private Producto buscarProducto(String codigo) {
        for (Producto producto : inventario) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return producto;
            }
        }

        return null;
    }
}