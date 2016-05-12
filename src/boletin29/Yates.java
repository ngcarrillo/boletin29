/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author Nuria
 */
public class Yates extends Barco {
    int potencia;
    int numCamarotes;
    int numDias;
    int precio;

    public Yates(int potencia, int eslora, int numCamarotes, String matricula, int numDias) {
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
        this.numDias = numDias;
        super.matricula = matricula;
        super.eslora = eslora;
        
       
    }

    @Override
    public void precio() {
        int precio = numDias * (10*eslora)+numCamarotes+ potencia;
    }

    @Override
    public String toString() {
        return "Yates{" + "potencia=" + potencia + ", numCamarotes=" + numCamarotes + ", numDias=" + numDias + "matricula"+matricula + "eslora"+ eslora + "EL PRECIO FINAL ES "+precio +'}';
    }
    
    
}
