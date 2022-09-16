package com.aulas.aulas1609.teste;

public class Bola {
    private String tipo;
    private String material;
    private double preco;


    public void setTipo(String tipo) {
        if(tipo.length() > 0)
            this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMaterial(String material) {
        if(material.length() > 0)
            this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setPreco(double preco) {
        if(preco > 0)
            this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

}
