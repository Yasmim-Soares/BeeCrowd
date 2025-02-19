/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author yasmim
 */
public class Promocao {
    private double valor;
    private double parcela;

    public double getParcela() {
        return parcela;
    }

    public void setParcela(double parcela) {
        this.parcela = parcela;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
    public double calculoA(){
        return this.valor*0.5; 
    }
    
    public double calculaB(){
        return this.valor*0.10;
    }
}