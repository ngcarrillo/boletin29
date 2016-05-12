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
public class Deportivos extends Barco {
int cv;
int numDias;

    public Deportivos(int cv, int eslora, String matricula, int numDias ) {
        this.cv = cv;
        this.numDias = numDias;
        super.matricula = matricula;
        super.eslora = eslora;
    }


    @Override
    public void precio() {
        int precio = numDias * (eslora * 10) + cv;
    }

    @Override
    public String toString() {
        return "Deportivos{" + "cv=" + cv + ", numDias=" + numDias + "matricula="+matricula + "eslora= " + eslora+'}';
    }
    
    
}
