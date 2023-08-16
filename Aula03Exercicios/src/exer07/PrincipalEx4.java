/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer07;

import java.util.Scanner;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalEx4 {
    public static void main(String[] args) {
        Lista l = new Lista(10);      
        Scanner sc = new Scanner(System.in);
        String menu = "1 - Inserir\n"+
                "2 - Exibir Lista\n"+
                "3 - Remover\n"+
                "4 - Sair";
        
        int op = 0;
        int elem;
        do {
            System.out.println(menu);
            System.out.print("Opção: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("\nINSERÇÃO\n");
                    System.out.print("\nDigite Elemento: ");
                    elem = sc.nextInt();
                    l.add(elem);
                    break;
                case 2:
                    System.out.println("\nEXIBIR LISTA\n");
                    l.exibirLista();
                    break;
                case 3:
                    System.out.println("\nREMOÇÃO\n");
                    System.out.print("\nDigite Elemento para remoção: ");
                    elem = sc.nextInt();
                    l.remover(elem);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while (op != 4);
        
        
        
        
//        System.out.println("Esta Vazia: "+l.estaVazia());
//        System.out.println("Esta Cheia: "+l.estaCheia());
//        l.exibirLista();
//        l.add(5);
//        l.exibirLista();
//        l.add(3);
//        l.add(9);
//        l.add(8);
//        l.exibirLista();
//        System.out.println("posicao 5: "+l.buscar(5));
//        System.out.println("posicao 3: "+l.buscar(3));
//        l.remover(5);
//        l.exibirLista();
//        System.out.println("posicao 5: "+l.buscar(5));
//        System.out.println("posicao 3: "+l.buscar(3));
//        System.out.println("Esta Vazia: "+l.estaVazia());
//        System.out.println("Esta Cheia: "+l.estaCheia());
//        l.add(11);
//        l.add(21);
//        l.add(31);
//        l.add(41);
//        l.add(51);
//        l.add(61);
//        l.add(71);
//        l.add(81);
//        l.exibirLista();
//        
//        System.out.println("Esta Vazia: "+l.estaVazia());
//        System.out.println("Esta Cheia: "+l.estaCheia());
    }
}
