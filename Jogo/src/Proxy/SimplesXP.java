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
public class SimplesXP implements ObtencaoXP {
    public void obterXP(){
        System.out.println("Versão Simples! Obterá XP normal!");
        new XP().obterXP();
    }
}
