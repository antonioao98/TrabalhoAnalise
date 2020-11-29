/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tonin
 */
public class Observavel {
    private List<Observador> observadores = new ArrayList<>();
        
    public void notificarAll(){
            for (Observador o: observadores){
            o.notificar();
            }
    }

    public void addObservador(Observador obs){
        this.observadores.add(obs);
    }

}
