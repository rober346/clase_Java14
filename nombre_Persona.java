package practicas_Java;

import java.util.Scanner;

public class nombre_Persona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cual es tu nombre? ");
        String nombre = scanner.nextLine();
        
        System.out.println("¿Cual es tu edad? ");
        int edad = scanner.nextInt();
            
        saludar(nombre, edad);
        
        scanner.close();
    }
    
    public static void saludar(String nombre, int edad) {
        System.out.println("Tu nombre es: " + nombre + " y tienes " + edad + " años," + " Bienvenido!!");
    }
}
