package ejercicios;

import java.util.Scanner;

public class EJ2_Palabra10Veces {

	public static void main(String[] args) {
		
		Scanner sd = new Scanner (System.in);
		System.out.println("Escribeme una palabra y te la mostrare 10 veces");
		String palabra = sd.next();
		for(int i=0; i<10; i++) {
			System.out.println(palabra);
		}
	}
	
}
