/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Ricardo
 */
public class DoubleXP implements ObtencaoXP{
    public void obterXP(){
        System.out.println("Versão Premium! Obterá XP dobrado!");
        new XP().obterXP();
    }
}
