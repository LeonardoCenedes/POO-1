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
public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        hora = 12;
        minuto = 0;
        segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void exibir() {
        String h = Integer.toString(hora);
        String m = Integer.toString(minuto);
        String s = Integer.toString(segundo);
        if (hora<10){
            h = "0"+h;
        }
        if (minuto<10){
            m = "0" + m;
        }
        if (segundo<10){
            s = "0" + s;
        }
        System.out.println(h + ":" + m + ":" + s);
    }
    
    public int calcularSegundos(){
        int seg = 3600 * hora + 60 * minuto + segundo;
        return seg;
    }
    
    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
