package practicas_Java;

import java.util.Scanner;

public class promedio_Numeros {
	
	float n1;
	float n2;
	float n3;
	float n4;
	float prom;


	public void entrada_Numeros() {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("¿Cual es el primer numero? ");
		n1 = ent.nextFloat();
			
		System.out.println("¿Cual es el segundo numero? ");
		n2 = ent.nextFloat();
		
		System.out.println("¿Cual es el tercer numero? ");
		n3 = ent.nextFloat();
		
		System.out.println("¿Cual es el cuarto numero? ");
		n4 = ent.nextFloat();
		
		ent.close();
	}
		
		
	public void promedio() {
		prom = (n1 + n2 + n3 + n4)/4;
		System.out.println("El promedio es: " + prom);
	}
		
	public static void main(String [] args) {
		
		promedio_Numeros res = new promedio_Numeros();
		res.entrada_Numeros();
		res.promedio();
				
	}

}
