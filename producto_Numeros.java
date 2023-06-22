package practicas_Java;

import java.util.Scanner;

public class producto_Numeros {
	
	//ATRIBUTOS:
	private int num1;
	private int num2;
	private int num3;
	private int producto;
	
	//METODOS:	
	public void pidenumeros() {
		Scanner datosn = new Scanner(System.in);
		
		System.out.println("¿Cual es el primer numero? ");
		num1 = datosn.nextInt();
		
		System.out.println("¿Cual es el segundo numero? ");
		num2 = datosn.nextInt();
		
		System.out.println("¿Cual es el tercer numero? ");
		num3 = datosn.nextInt();
		
		datosn.close();
	}
	
	public void multiplicador() {
		producto = num1 * num2 * num3;
		System.out.println("El producto es: " + producto);
	}
	
	public static void main(String [] args) {
		//OBJETO:
		producto_Numeros respuesta = new producto_Numeros();
		respuesta.pidenumeros();
		respuesta.multiplicador();	
		
	}

}
