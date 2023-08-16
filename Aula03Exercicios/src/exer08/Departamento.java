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
public class Departamento {
    private String cod;
    private String nome;
    private String fone;
    private Funcionario funcionarios[]; //lembrar de instanciar o vetor
    private int cont;
    private int max; //controla o numero maximo de funcionarios na lista estatica

    public Departamento(int max) {
        this.max = max;
        inicializar(max);
    }

    public Departamento(String cod, String nome, String fone, int max) {
        this.cod = cod;
        this.nome = nome;
        this.fone = fone;
        this.max = max;
        inicializar(max);
    }
    
    private void inicializar(int max){
        this.max = max;
        cont = 0;
        funcionarios = new Funcionario[max];
    }
    
    public void addFuncionario(Funcionario f){
        if (cont < max){
            funcionarios[cont] = f;
            cont++;
        }
    }
    
    public Funcionario buscarFuncionarioPorNome(String nome){
        for(int i=0; i<cont; i++){
            if (funcionarios[i].getNome().equals(nome))
                return funcionarios[i]; //o ideal é retornar uma copia do objeto
        }
        return null; //se nao encontrou
    }
    

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
    
}
