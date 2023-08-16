/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer05;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalEx5 {
    public static void main(String[] args) {
        ContaEspecial c1 = new ContaEspecial();
        c1.setTitular("tit1");
        c1.setNumero("1111");
        c1.exibir();
        
        ContaEspecial c2 = new ContaEspecial("222","Tit 2",300,200);
        c2.exibir();
        
        c2.sacar(400);
        System.out.println("Saldo: "+c2.getSaldo());
        c2.sacar(100);
        System.out.println("Saldo: "+c2.getSaldo());
        c2.depositar(100);
        System.out.println("Saldo: "+c2.getSaldo());
        
    }
}
