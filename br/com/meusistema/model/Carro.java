package br.com.meusistema.model;

public class Carro {

    private String modelo;
    private String cor;
    private int velocidade;

    public void buzinar() {

        System.out.println("O " + modelo + " " + cor + " fez: BII BII");

    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelocidade(int velocidade) {

        if (velocidade < 0) {
            System.out.println("Erro: velocidade não pode ser negativa!");

        } else {
            this.velocidade = velocidade;
        }

    }
}
