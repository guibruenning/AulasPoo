package com.aulas.aulas1609.teste;

public class BolaMain {
    public static void main(String[] args) {
        Bola bola = new Bola();

        bola.setMaterial("Fibra") ;
        bola.setTipo("Basquete");
        bola.setPreco(23) ;

        System.out.println("Material: "+bola.getMaterial());
        System.out.println("Tipo: "+bola.getTipo());
        System.out.println("Preço: R$ "+bola.getPreco());
    }
}
