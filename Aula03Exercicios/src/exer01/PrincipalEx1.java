/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01;

import exer01.Aluno;
import java.util.Scanner;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIO");

//        Aluno a1 = new Aluno();        
        Aluno a1 = new Aluno("1111","aluno1",2,3,4,5);        
//        
//        a1.setNome("Danilo");
//        a1.setRa("123456");
//        a1.setT1(5);
//        a1.setT2(6);
//        a1.setN1(8);
//        a1.setN2(8);

        System.out.println("Nome: " + a1.getNome());
        System.out.println("RA: " + a1.getRa());
        System.out.println("Trabalhos 1 e 2: " + a1.getT1() + " " + a1.getT2());
        System.out.println("Notas 1 e 2: " + a1.getN1() + " " + a1.getN2());        
        System.out.println("Media: " + a1.media());
        System.out.println("Aprovado: " + a1.aprovado());
        if (a1.aprovado()) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        
///
        System.out.println("\nLEITURA DO USUARIO\n\n");
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("RA: ");
        String ra = entrada.nextLine();
        float t1, t2, n1, n2;
        System.out.print("Nota de Trabalho 1: ");
        t1 = entrada.nextFloat();
        System.out.print("Nota de Trabalho 2: ");
        t2 = entrada.nextFloat();
        System.out.print("Nota de Prova 1: ");
        n1 = entrada.nextFloat();
        System.out.print("Nota de Prova 2: ");
        n2 = entrada.nextFloat();        
        
        Aluno a2 = new Aluno(ra, nome, t1, t2, n1, n2);
//        Aluno a2 = new Aluno();
//        a2.setNome(nome);
//        a2.setRa(ra);
//        a2.setT1(t1);
//        a2.setT2(t2);
//        a2.setN1(n1);
//        a2.setN2(n2);
        
        System.out.println("\n\nDados do Objeto\n");
        System.out.println("Nome: " + a2.getNome());
        System.out.println("RA: " + a2.getRa());
        System.out.println("Trabalhos 1 e 2: " + a2.getT1() + " " + a2.getT2());
        System.out.println("Notas 1 e 2: " + a2.getN1() + " " + a2.getN2());        
        System.out.println("Media: " + a2.media());
        System.out.println("Aprovado: " + a2.aprovado());
        if (a2.aprovado()) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        
        Aluno a3 = new Aluno("Aluon 3", "123456");        
        a3.setT1(t1);
        a3.setT2(t2);
        a3.setN1(n1);
        a3.setN2(n2);
        
    }
}
