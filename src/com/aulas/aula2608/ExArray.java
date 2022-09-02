package com.aulas.aula2608;

import java.util.Scanner;

public class ExArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAMX = 3;
        final int TAMY = 3;
        int soma = 0;
        float media = 0;
        int maior = 0;
        int menor = 0;

        int[][] vet = new int[TAMX][TAMY];

        for (int i = 0; i < TAMX; i++) {
            for (int j = 0; j < TAMY; j++) {
                System.out.print("Digite um o número da linha "+(i+1)+", da coluna "+(j+1)+" : ");
                vet[i][j] = entrada.nextInt();
                soma += vet[i][j];
                if(i == 0 && j == 0){
                    maior = vet[i][j];
                    menor = vet[i][j];
                } else {
                    if(vet[i][j] > maior) {
                        maior = vet[i][j];
                    }
                    if(vet[i][j] < menor) {
                        menor = vet[i][j];
                    }
                }
            }


        }

        media = soma / (float)(TAMX*TAMY);

        for (int i = 0; i < TAMX; i++) {
            for (int j = 0; j < TAMY; j++) {
                System.out.print(vet[i][j]+"|");
            }
            System.out.println("");
        }
        System.out.println("\nSoma: "+soma+"\nMedia: "+media);
        System.out.println("Maior: "+maior+"\nMenor: "+menor);

        entrada.close();
    }
}
