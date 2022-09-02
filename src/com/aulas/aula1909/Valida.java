package com.aulas.aula1909;

import java.util.Scanner;

public class Valida {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.println("Informe um número positivo: ");
			num = entrada.nextInt();
			
		}while(num < 0);

		
		entrada.close();
	}

}
