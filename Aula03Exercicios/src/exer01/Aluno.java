 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class Aluno {

    private String ra;
    private String nome;
    private float t1;
    private float t2;
    private float n1;
    private float n2;

    public Aluno() {
        ra = "não definido";
        nome = "não definido";
    }
    
    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }

    public Aluno(String ra, String nome, float t1, float t2, float n1, float n2) {
        this.ra = ra;
        this.nome = nome;
        this.t1 = t1;
        this.t2 = t2;
        this.n1 = n1;
        this.n2 = n2;
    }

    public float media() {
        float media = (t1 + t2 + n1 + n2) / 4.0f;
        return media;
    }

    public boolean aprovado() {
        if (media() >= 5) {
            return true;
        }
        return false;
    }

    public void setT1(float t1) {
        this.t1 = t1;
    }

    public void setT2(float t2) {
        this.t2 = t2;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getT1() {
        return t1;
    }

    public float getT2() {
        return t2;
    }

    public float getN1() {
        return n1;
    }

    public float getN2() {
        return n2;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
