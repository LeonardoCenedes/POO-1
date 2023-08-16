/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer05;

import exer03.*;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class ContaEspecial {
    private String numero;
    private String titular;
    private double saldo;
    private double limite;
    
    public ContaEspecial(){
        saldo = 0;
        limite = 0;
    }
    
    public ContaEspecial(String numero, String titular, double saldo, double limite){
        //this.numero = numero;
        setNumero(numero);
        setTitular(titular);
        setSaldo(saldo);
        setLimite(limite);
    }
    
    public void exibir(){
        System.out.println("Titular: "+titular);
        System.out.println("Numero: "+numero);
        System.out.println("Saldo: "+saldo);
        System.out.println("Limite: "+limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    
    public void depositar(double valor){
        if (valor > 0)
            saldo = saldo + valor;
    }
    
    public void sacar(double valor){
        if (saldo + limite - valor >= 0)
            saldo = saldo - valor;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public double getSaldo(){
        return saldo;
    }    
}
