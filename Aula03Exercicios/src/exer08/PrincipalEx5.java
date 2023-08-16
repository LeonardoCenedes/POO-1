/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer08;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalEx5 {
    public static void main(String[] args) {
//        Funcionario f1 = new Funcionario();
//        f1.setNome("Func 1");
//        f1.setCod("111");
//        f1.setFuncao("ADM");
//        f1.setSalario(2500);
        Funcionario f1 = new Funcionario("111","Func 1","ADM",2500);
        
        Funcionario f2 = new Funcionario();
        f2.setNome("Func 2");
        f2.setCod("111");
        f2.setFuncao("ADM 2");
        f2.setSalario(4500);
        
//        Departamento d1 = new Departamento(100);        
//        d1.setNome("DMC");
//        d1.setCod("1");
//        d1.addFuncionario(f1);
//        d1.addFuncionario(f2);
        Departamento d1 = new Departamento("1","DMC","322923234",100);        
        
        
        
//        Universidade univ = new Universidade(100);
//        univ.setNome("UNESP");
        Universidade univ = new Universidade("Unesp", 100);
        
        //univ.inicializar(100);
        univ.addDepartamento(d1);
        
        Departamento d = univ.buscarDepartamentoPorNome("FISICA");
        System.out.println(d);
        d = univ.buscarDepartamentoPorNome("DMC");
        System.out.println(d);
        System.out.println(d.getNome());
        Funcionario f = univ.buscarFuncionarioPorNome("asdf");
        System.out.println(f);
//        f  = univ.buscarFuncionarioPorNome("Func 2");
//        System.out.println(f);
//        System.out.println(f.getNome());
    }
}
