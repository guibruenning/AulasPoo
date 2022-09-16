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

    public static String mostrar(int[] v) {
        String saida = "";
        for (int i = 0; i < v.length; i++) {
            saida += v[i] + " | ";
        }
        return saida;
    }

    /**
     * System.out.println(MinhasFuncoes.mostrarTop(vet));
     * @param v
     * @return
     */
    public static String mostrarTop(int[] v) {
        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < v.length; i++) {
            saida.append(v[i]);
            saida.append(" | ");
        }

        return saida.toString();
    }
}
