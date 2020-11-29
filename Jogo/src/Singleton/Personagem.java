/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author tonin
 */
public class Personagem {
    private Personagem(){
        System.out.println("Buscando personagem");
    }
    
    private static Personagem instancia;
    
    public static Personagem getInstance(){
        if(instancia == null){
            
           instancia = new Personagem();
           System.out.println("Personagem selecionado");
           return instancia;
        }
        System.out.println("O personagem já está selecionado.");
        return instancia;
    }
}
