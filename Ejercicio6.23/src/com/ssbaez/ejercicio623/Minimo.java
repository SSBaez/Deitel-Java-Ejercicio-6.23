package com.ssbaez.ejercicio623;

import java.util.Scanner;

public class Minimo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Aplicacion que lee tres numeros de punto flotante que determina el menor de estos");
		System.out.printf("Esciba los tres numeros separados por un espacio %n%s",
						  "----> ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		System.out.printf("El menor d elos tres numeros ingresados es: %.2f", minimo3(num1, num2, num3));
	}
	
	public static double minimo3(double a, double b, double c) {
		
		double menor = a;
		
		if(b < menor)
			menor = b;
		
		if(c < menor)
			menor = c;
				
		return menor;
	}

}
