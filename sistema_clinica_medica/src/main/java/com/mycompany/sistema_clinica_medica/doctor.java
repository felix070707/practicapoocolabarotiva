package com.mycompany.sistema_clinica_medica;
import java.util.Scanner;

/**
 *Gestión de médicos
 esta clase debe hacer 
- Registrar médico
- Consultar médicos
- Actualizar médico
- Eliminar médico

 * doctor
 */
public class doctor {
private String name="";
private String lastname="";
 private int age=0;
private String gender="";
private String phone="";
private String email="";
private String id="";

public void showinfo(){
  System.out.println("ID: "+ id);
  System.out.println("Name: "+ name);
  System.out.println("LastName: "+ lastname);
  System.out.println("Age: "+ age);
  System.out.println("Gender: "+ gender);
  System.out.println("Phone: "+ phone);
  System.out.println("Email: "+ email);
}
public void opcion (){
   Scanner scanner=new Scanner(System.in);
    System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar un medico");
        System.out.println("2. Actualizar los datos de un medico");
        System.out.println("3. Eliminar un medico");
        System.out.println("4. Consultar los datos de un medico");
        int opcion = scanner.nextInt();
        scanner.nextLine();      
        System.out.println(".()");
        switch (opcion) {
            case 1:
            
            // Lógica para registrar un medico
            System.out.println("Ingrese el ID del medico:");
            this.id = scanner.nextLine();
            System.out.println("Ingrese el nombre del medico:");
            this.name = scanner.nextLine();
            System.out.println("Ingrese el apellido del medico:");
            this.lastname = scanner.nextLine();
            System.out.println("Ingrese la edad del medico:");
            this.age = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            System.out.println("Ingrese el sexo del medico:");
            this.gender = scanner.nextLine();
            System.out.println("Ingrese el teléfono del medico:");
            this.phone = scanner.nextLine();
            System.out.println("Ingrese el correo electrónico del medico:");
            this.email = scanner.nextLine();
            System.out.println("medico registrado correctamente.");
            showinfo();
                break;
            case 2:
                // Lógica para actualizar los datos de un medico
            System.out.println("Ingrese el ID del medico a actualizar:");
            this.id = scanner.nextLine();
            System.out.println("Ingrese el nuevo nombre del medico:");
            this.name = scanner.nextLine();
            System.out.println("Ingrese el nuevo apellido del medico:");
            this.lastname = scanner.nextLine();
            System.out.println("Ingrese la nueva edad del medico:");
            this.age = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            System.out.println("Ingrese el nuevo sexo del medico:");
            this.gender = scanner.nextLine();
            System.out.println("Ingrese el nuevo teléfono del medico:");
            this.phone = scanner.nextLine(); 
            System.out.println("Ingrese el nuevo correo electrónico del medico:");
            this.email = scanner.nextLine();
            
            System.out.println("Datos del medico actualizados correctamente.");
            showinfo();

                break;
            case 3:
                // Lógica para eliminar un medico
                System.out.println("Ingrese el ID del medico a eliminar:");
                String idToDelete = scanner.nextLine();
                // Aquí puedes agregar la lógica para eliminar el medico de tu sistema
                System.out.println("medico eliminado correctamente.");
                showinfo();
                break;
            case 4:
                // Lógica para consultar los datos de un medico
                System.out.println("Ingrese el ID del medico a consultar:");
                String idToConsult = scanner.nextLine();
                // Aquí puedes agregar la lógica para consultar los datos del medico en tu sistema
                System.out.println("Datos del medico:");
                showinfo();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
}

    }
