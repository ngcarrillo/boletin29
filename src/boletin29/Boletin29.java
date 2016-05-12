/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;

/**
 *
 * @author Nuria
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Barco> barcos = new ArrayList();
        Barco velero = new Velero(1 ,100 , "a5555", 2);
        Barco deportivo = new Deportivos(5, 30, "b5555", 2);
        Barco yate = new Yates(5, 30, 2 , "c5555", 2);
        
        barcos.add(velero);
        barcos.add(deportivo);
        barcos.add(yate);
        
        for (int i=0; i <barcos.size(); i++){
            System.out.println(barcos.toString());
        }
    }
    
}
