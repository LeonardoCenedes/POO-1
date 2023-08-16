/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03;

import java.util.Scanner;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalEx3 {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNome("Danilo");
        c1.setNumero("111");

        System.out.println("Saldo Atual: " + c1.getSaldo());
        c1.depositar(100);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        c1.sacar(50);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        c1.sacar(150);
        System.out.println("Saldo Atual: " + c1.getSaldo());

        System.out.println("\nDADOS DO USUARIO\n\n");
        
        
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("Valor de Saque:");
        valor = sc.nextDouble();
        c1.sacar(valor);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        
        System.out.println("Valor de Deposito: ");
        valor = sc.nextDouble();
        c1.depositar(valor);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        
        System.out.println("Valor de Saque: ");
        valor = sc.nextDouble();
        c1.sacar(valor);
        System.out.println("Saldo Atual: " + c1.getSaldo());
        
    }
}
