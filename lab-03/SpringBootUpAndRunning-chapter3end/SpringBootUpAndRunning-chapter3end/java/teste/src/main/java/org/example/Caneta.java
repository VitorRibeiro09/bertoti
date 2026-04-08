package org.example;


import javax.swing.*;

public class Caneta {
    public String  modelo;
    private Float ponta;
    private Boolean tampada;
    private String cor;

    public Caneta(String modelo, Float ponta, Boolean t, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = t;
        this.cor = cor;
    }

    public Boolean getTampada() {
        return tampada;
    }

    public void setTampada(Boolean t) {
        this.tampada = t;
    }

    public Float getPonta() {
        return ponta;
    }

    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
public void status(){
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Tampada: " + this.);
    System.out.println("Cor: " + this.cor);
}
public void tamparDestampar(){
    this.setTampada(true);
    System.out.println("Tampado");
}
}
