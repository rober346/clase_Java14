package practicas_Java;

import java.util.Scanner;

public class comparador_Numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingresa el segundo numero:");
        int num2 = scanner.nextInt();
        
        System.out.println("Ingresa el tercer numero:");
        int num3 = scanner.nextInt();
        
        int mayor = numeroMayor(num1, num2, num3);
        int menor = numeroMenor(num1, num2, num3);
        
        System.out.println("El mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);
        
        scanner.close();
    }
    
    public static int numeroMayor(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static int numeroMenor(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}

