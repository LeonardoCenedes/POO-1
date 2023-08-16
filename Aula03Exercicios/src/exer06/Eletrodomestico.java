/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer06;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class Eletrodomestico {

    private String nome;
    private float potencia;
    private float tempo;

    public Eletrodomestico() {

    }

    public Eletrodomestico(String nome, float potencia, float tempo) {
        this.nome = nome;
        this.potencia = potencia;
        this.tempo = tempo;
    }

    public float wattsDia() {
        return potencia * tempo;
    }

    public float wattsMes() {
        return wattsDia() * 30;
    }

    public float wattsAno() {
        return wattsMes() * 12;
    }

    public float gastoMes(float precoKwatts) {
        return wattsMes() / 1000 * precoKwatts;
    }

    public void relatorio(float precoKwatts) {
        System.out.println("");
        System.out.println("Eletrodoméstico: "+nome);
        System.out.println("Potência do aparelho: P="+potencia+" watts;");
        System.out.println("Tempo de utilização do aparelho: "+tempo+" horas/dia");
        System.out.println("Watts/Dia = "+ wattsDia()+" W");
        System.out.println("Watts/Mês = "+ wattsMes()+" W");
        System.out.println("Watts/Ano = "+wattsAno() + " W");
        System.out.println("Preço do Kwatt R$ "+precoKwatts);
        System.out.println("Gasto mensal é: R$ "+gastoMes(precoKwatts));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }
}
