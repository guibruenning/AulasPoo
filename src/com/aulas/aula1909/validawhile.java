package com.aulas.aula1909;

import java.util.Scanner;

public class validawhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = -1;
		
		while(num < 0){
			System.out.println("Informe um número positivo: ");
			num = entrada.nextInt();
			
		};

		
		entrada.close();	

	}

}
