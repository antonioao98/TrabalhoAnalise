package jogo;

import Factory.FactoryMethod;
import Factory.SexoPersonagem;
import Template.Automatico;
import Template.SemiAutomatico;
import Template.MododeAtirar;

public class Jogo {
    public static void main(String[] args) {
        //strategy
        Arma a = new Arma();

        a.setArma(new Ak47());
        a.armaSelecionada();

        //template
        MododeAtirar b = new Automatico();
        b.modoAlterado();
        
        
        //Factory   
        FactoryMethod f = new FactoryMethod();
        SexoPersonagem s = f.tipoPersonagem("Masculino");
        s.criarPersonagem();
        
        
        
    }
    
}
