package com.aulas.aulas0209.array;

import java.util.Random;

public class MinhasFuncoes {

    public static int[] criaVetor(int tamanho) {
        Random gerador = new Random();
        int[] v = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            v[i] = gerador.nextInt(100);
        }

        return v;
    }
}
