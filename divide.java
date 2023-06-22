package practicas_Java;

public class divide {
	
	private int num1 = 17;
	private int num2 = 3;
	private int cociente;
	private int resto;
	private float respuesta_Real;
	
	
	public int calc_Cociente() {
		cociente = num1 / num2;
		return cociente;	
	}
	
	
	public int calc_Resto() {
		resto = num1 % num2;
		return resto;		
	}
	
	
	public float calc_Real() {
		respuesta_Real = (float) num1 / num2;
		return respuesta_Real;		
	}
	
	
	public static void main (String [] args) {
		
		divide resultados = new divide ();
		
		System.out.println ("El valor del cociente es: " + resultados.calc_Cociente());
		System.out.println ("El valor del resto es: " + resultados.calc_Resto());
		System.out.println ("El valor del calculo real es: " + resultados.calc_Real());
	}
}
