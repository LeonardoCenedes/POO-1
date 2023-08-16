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
public class Universidade {
    private String nome;
    private Departamento departamentos[]; //lembrar de instanciar o vetor
    private int cont;
    private int max;//controla o numero maximo de Departamentos
    
    public Universidade(int max){
        this.max = max;
        inicializar(max);
    }
    
    public Universidade(String nome, int max){
        this.nome = nome;
        inicializar(max);
    }
    
    private void inicializar(int max){
        this.max = max;
        cont = 0;
        departamentos = new Departamento[max];
    }
    
    public void addDepartamento(Departamento d){
        if (cont < max){
            departamentos[cont] = d;
            cont++;
        }
    }
    
    public Departamento buscarDepartamentoPorNome(String nome){
        for (int i = 0; i < cont; i++) {
            if (departamentos[i].getNome().equals(nome))
                return departamentos[i]; //o ideal é retornar uma cópia do objeto
        }
        return null; //se nao encontrou
    }
    
    public Funcionario buscarFuncionarioPorNome(String nome){
        //busca o funcionario nos departamentos -- reaproveita a busca que está na class Funcionario
        
        //para cada departamento, verifica-se se o funcionario está em sua lista
        for (int i = 0; i < cont; i++) {
            Funcionario f = departamentos[i].buscarFuncionarioPorNome(nome);
            if (f != null){
                return f;
            }
        }
        return null; //se nao encontrou
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
