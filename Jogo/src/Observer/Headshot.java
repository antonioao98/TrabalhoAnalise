/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author tonin
 */
public class Headshot implements Observador {

    @Override
    public void notificar() {
        System.out.println("Acertou o headshot. -100 de dano");
    }
    
}
