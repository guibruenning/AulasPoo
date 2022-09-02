package com.aulas.aulas0209.crud;

import java.util.Scanner;

public class Crud {

    static String[] nomes = new String[10];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println(menu());
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    String[] nome = new String[10];

                    for (int i = 0; i < nome.length; i++) {
                        System.out.println("Digite o nome: ");
                        nome[i] = entrada.next();
                    }
                    cadastrar(nome);
                    break;
                case 2:
                    System.out.println("Digite o nome a ser alterado: ");
                    String nomeAntigo = entrada.next();

                    System.out.println("Digite o novo nome: ");
                    String nomeNovo = entrada.next();
                    alterar(nomeAntigo, nomeNovo);
                    break;
                case 3:
                    System.out.println("Digite o nome a ser excluído: ");
                    String nomeExcluir = entrada.next();

                    excluir(nomeExcluir);
                    break;
                case 4:
                    listar();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    public static String menu() {
        return "##Menu##\n1 - Inserir\n2 - Listar\n3 - Alterar\n4 - Excluir\n5 - Sair";
    }

    public static void cadastrar(String[] nome) {
        nomes = nome;
    }

    public static void alterar(String nomeAntigo, String nomeNovo) {
        while (nomeAntigo != nomeNovo) {
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i] == nomeAntigo) {
                    nomes[i] = nomeNovo;
                }
            }
        }
    }

    public static void excluir(String nomeExcluir) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == nomeExcluir) {
                nomes[i] = null;
            }
        }
    }

    public static String[] listar() {
        return nomes;
    }
}
