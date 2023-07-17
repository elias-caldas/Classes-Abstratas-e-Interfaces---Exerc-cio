/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cap9;

/**
 *
 * @author Pc Elias
 */
public class Diretor extends Funcionario implements Autenticavel{
    
    int senha = 122;
    
    public boolean autentica (int senha){
        if (this.senha == senha){
            System.out.println("Acesso Permitido");
            return true;
        } else{
            System.out.println("Acesso Negado!");
            return false;
        }
        
    }
    
    @Override
    public double getBonificacao (){
        return this.getSaldo() * 0.3;
    }
}
