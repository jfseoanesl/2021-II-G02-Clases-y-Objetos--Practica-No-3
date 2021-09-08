/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jairo
 */
public class Ameba {
    
    private int peso;

    public Ameba() {
        this.peso=3;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void come(int peso){
        this.peso+=peso-1;
    }
    
    public void come(Ameba a){
        //this.peso+=a.getPeso()-1;
        this.come(a.getPeso());
        a.setPeso(0);
    }
    
    @Override
    public String toString(){
        return "Soy una ameba y peso "+this.peso+" microgramos";
    }
    
}
