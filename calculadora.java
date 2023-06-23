package practicas_Java;

import java.util.Scanner;

public class calculadora {
	
	float n1;
	float n2;
	float suma;
	float resta;
	float mult;
	float div;
	
	
	public void entrada_Numeros() {
			
		Scanner ent = new Scanner(System.in);
		
		System.out.println("¿Cual es el primer numero? ");
		n1 = ent.nextFloat();
			
		System.out.println("¿Cual es el segundo numero? ");
		n2 = ent.nextFloat();
			
		ent.close();
	}
		
	public void sumando() {
		suma = n1 + n2;
		System.out.println("La suma es: " + suma);
	}
	
	public void restando() {
		resta = n1 - n2;
		System.out.println("La resta es: " + resta);
	}
	
	public void multiplicando() {
		mult = n1 * n2;
		System.out.println("El producto es: " + mult);
	}
	
	
	public void dividiendo() {
		div = (float) n1 / n2;
		System.out.println("La division es: " + div);
	}
	
	public static void main(String [] args) {
		
		calculadora respuesta = new calculadora();
		respuesta.entrada_Numeros();
		respuesta.sumando();
		respuesta.multiplicando();
		respuesta.restando();
		respuesta.dividiendo();
		
	}


}
