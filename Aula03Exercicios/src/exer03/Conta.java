/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class Conta {
    private String numero;
    private String nome;
    private double saldo;
    
    public void depositar(double valor){
        if (valor > 0)
            saldo = saldo + valor;
    }
    
    public void sacar(double valor){
        if (saldo - valor >= 0)
            saldo = saldo - valor;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSaldo(){
        return saldo;
    }    
}
