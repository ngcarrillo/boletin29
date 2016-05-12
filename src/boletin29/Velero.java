package boletin29;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nuria
 */
public class Velero extends Barco{
int numMastiles;
int numDias;

    public Velero(int numMastiles, int eslora, String matricula,int numDias ) {
        this.numMastiles = numMastiles;
        this.numDias = numDias;
        super.eslora = eslora;
        super.matricula = matricula;
    }

    @Override
    public void precio() {
        int precio = numDias * (eslora * 10) + numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numeroMastiles=" + numMastiles + ", numDias=" + numDias + "eslora = " + eslora + "matricula" + matricula +'}';
    }

   
    
    
    
}
