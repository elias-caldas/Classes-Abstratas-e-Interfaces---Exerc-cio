/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cap9;

/**
 *
 * @author Pc Elias
 */
public class ControleDeBonificacao {
    
    private double totalDeBonificacoes = 0;
    
    public void registra (Funcionario funcionario){
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }
    
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
}
