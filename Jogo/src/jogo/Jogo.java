package jogo;

import Factory.FactoryMethod;
import Factory.SexoPersonagem;
import Template.Automatico;
import Template.SemiAutomatico;
import Template.MododeAtirar;

public class Jogo {
    public static void main(String[] args) {
        

        //template
        MododeAtirar b = new Automatico();
        b.modoAlterado();
        
        
        //Factory   
        FactoryMethod f = new FactoryMethod();
        SexoPersonagem s = f.tipoPersonagem("Masculino");
        s.criarPersonagem();
        
        
        
    }
    
}
