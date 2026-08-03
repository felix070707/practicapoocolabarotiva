package com.mycompany.sistema_clinica_medica;
/*  

VOID MAIN (DONDE VAMOS A EJECUTAR EL PROGRAMA)


*/
import java.util.Scanner;

public class Sistema_clinica_medica_main{

    public static void main(String[] args) {
    Sistema_clinica_medica_main sistema = new Sistema_clinica_medica_main();
    sistema.opcion();
}


  
    
public void opcion() {
    Scanner scanner= new Scanner(System.in);
     System.out.println("Eliga una opcion");
      System.out.println("1. Paciente");
       System.out.println("2. Medico");
       int opcion = scanner.nextInt();
        scanner.nextLine();
switch (opcion) {
    case 1:
         patient p=new patient();
        p.opcion();
         break;
    case 2:
        doctor d = new doctor();
        d.opcion();
        break;
        default:
        System.out.println("Opción inválida");

}
}
}