package com.mycompany.sistema_clinica_medica;

/**
 * patient
 * Esta clase nos tiene que permitir hacer lo siguiente:
 * Mostrar un menu con las siguientes opciones:
 * 1. Registrar un paciente con su nombre, apellido, edad, sexo, telefono y correo electronico.
 * 2. Actualizar los datos de un paciente.
 * 3. Eliminar un paciente.
 * 4. Consultar los datos de un paciente.
------------------------------- 
Private -> Se¿
*/

import java.util.Scanner;

public class patient {
    private String name="";
    private String lastName="";
    private int age=0;
    private String gender="";
    private String phone="";
    private String email="";
    private String id="";


    public void showinfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Edad: " + age);
        System.out.println("Sexo: " + gender);
        System.out.println("Teléfono: " + phone);
        System.out.println("Correo electrónico: " + email);
    }

    public void opcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar un paciente");
        System.out.println("2. Actualizar los datos de un paciente");
        System.out.println("3. Eliminar un paciente");
        System.out.println("4. Consultar los datos de un paciente");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        switch (opcion) {
            case 1:
            
            // Lógica para registrar un paciente
            System.out.println("Ingrese el ID del paciente:");
            this.id = scanner.nextLine();
            System.out.println("Ingrese el nombre del paciente:");
            this.name = scanner.nextLine();
            System.out.println("Ingrese el apellido del paciente:");
            this.lastName = scanner.nextLine();
            System.out.println("Ingrese la edad del paciente:");
            this.age = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            System.out.println("Ingrese el sexo del paciente:");
            this.gender = scanner.nextLine();
            System.out.println("Ingrese el teléfono del paciente:");
            this.phone = scanner.nextLine();
            System.out.println("Ingrese el correo electrónico del paciente:");
            this.email = scanner.nextLine();
            System.out.println("Paciente registrado correctamente.");
            showinfo();
                break;
            case 2:
                // Lógica para actualizar los datos de un paciente
            System.out.println("Ingrese el ID del paciente a actualizar:");
            this.id = scanner.nextLine();
            System.out.println("Ingrese el nuevo nombre del paciente:");
            this.name = scanner.nextLine();
            System.out.println("Ingrese el nuevo apellido del paciente:");
            this.lastName = scanner.nextLine();
            System.out.println("Ingrese la nueva edad del paciente:");
            this.age = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            System.out.println("Ingrese el nuevo sexo del paciente:");
            this.gender = scanner.nextLine();
            System.out.println("Ingrese el nuevo teléfono del paciente:");
            this.phone = scanner.nextLine(); 
            System.out.println("Ingrese el nuevo correo electrónico del paciente:");
            this.email = scanner.nextLine();
            
            System.out.println("Datos del paciente actualizados correctamente.");
            showinfo();

                break;
            case 3:
                // Lógica para eliminar un paciente
                System.out.println("Ingrese el ID del paciente a eliminar:");
                String idToDelete = scanner.nextLine();
                // Aquí puedes agregar la lógica para eliminar el paciente de tu sistema
                System.out.println("Paciente eliminado correctamente.");
                showinfo();
                break;
            case 4:
                // Lógica para consultar los datos de un paciente
                System.out.println("Ingrese el ID del paciente a consultar:");
                String idToConsult = scanner.nextLine();
                // Aquí puedes agregar la lógica para consultar los datos del paciente en tu sistema
                System.out.println("Datos del paciente:");
                showinfo();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }


}