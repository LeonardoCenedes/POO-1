/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer04;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalEx4 {
    public static void main(String[] args) {
        Horario h = new Horario();
        h.exibir();
        System.out.println("Segundos: "+h.calcularSegundos());
        Horario h1 = new Horario(9,9,9);
        h1.exibir();
        System.out.println("Segundos: "+h1.calcularSegundos());
    }
}
