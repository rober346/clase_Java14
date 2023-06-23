package practicas_Java;

import java.util.Scanner;

public class area_Circulo {
	
	float n1;
	float area;
	
	public void entrada_Numeros() {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa el valor del diametro del circulo ");
		n1 = ent.nextFloat();
		ent.close();
	}
		
	public void area_Circ() {
		area = (float) 3.1416 * ((n1/2)*(n1/2));
		System.out.println("El area es: " + area);
	}
		
	
	public static void main(String [] args) {
		
		area_Circulo resp = new area_Circulo();
		resp.entrada_Numeros();
		resp.area_Circ();
		
	}

}

