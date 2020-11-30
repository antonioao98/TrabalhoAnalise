package jogo;

import Factory.FactoryMethod;
import Factory.SexoPersonagem;
import Strategy.Ak47;
import Strategy.Arma;
import Template.Automatico;
import Template.MododeAtirar;
import Observer.Observador;
import Observer.Body;
import Observer.Headshot;
import Observer.LocalTiro;
import Proxy.DoubleXP;
import Proxy.ObtencaoXP;
import Proxy.SimplesXP;
import Singleton.Personagem;

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
        
        //Obserrver
        LocalTiro local = new LocalTiro();
        local.addObservador(new Body());
        local.addObservador(new Body());
        local.setLocalTiro("HeadShot");
        
        //Singleton/Facade
        Personagem p1 = Personagem.getInstance();
        
        //Proxy
        
        ObtencaoXP simXP = new SimplesXP();
        ObtencaoXP dbXP = new DoubleXP();
        simXP.obterXP();
        dbXP.obterXP();
        
        
        
        
    }
    
}
