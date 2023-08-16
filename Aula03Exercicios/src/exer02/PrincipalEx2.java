/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02;

import java.util.Scanner;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalEx2 {

    public static void main(String[] args) {
        AlunoAcademia a1 = new AlunoAcademia();
        a1.setNome("Danilo");
        a1.setIdade(39);
        a1.setPeso(95);
        a1.setAltura(1.77f);

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Peso: " + a1.getPeso());
        System.out.println("Altura: " + a1.getAltura());
        System.out.println("Altura: " + a1.getAltura());
        System.out.println("IMC: " + a1.IMC());
        if (a1.maior()) {
            System.out.println("MAIOR");
        } else {
            System.out.println("MENOR");
        }

        ///
        System.out.println("\nLEITURA DO USUARIO\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Peso: ");
        float peso = sc.nextFloat();
        System.out.print("Altura: ");
        float altura = sc.nextFloat();
        
        AlunoAcademia a2 = new AlunoAcademia();
        a2.setNome(nome);
        a2.setIdade(idade);
        a2.setPeso(peso);
        a2.setAltura(altura);
        
        
        
        System.out.println("\nDADOS DO OBJETO\n");
         System.out.println("Nome: " + a2.getNome());
         System.out.println("Idade: " + a2.getIdade());
         System.out.println("Peso: " + a2.getPeso());
         System.out.println("Altura: " + a2.getAltura());
         System.out.println("IMC: " + a2.IMC());
         System.out.println("Atributo Maior: " + a2.maior());
         if (a2.maior())
             System.out.println("MAIOR");
         else System.out.println("MENOR");
    }
}
