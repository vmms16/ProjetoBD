/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dominio.Pessoa;
import dominio.Receita;

/**
 *
 * @author Vinicius
 */
 class Sessao {
     
     private static Sessao instancia= new Sessao();
     private Receita receita= new Receita();
     private Pessoa pessoa = new Pessoa();
     
     private Sessao(){
         
     }
     
     public static Sessao getInstancia(){
         return Sessao.instancia;
     }
     
     public void setReceita(Receita receita){
         this.receita=receita;
     }
     
     public Receita getReceita(){
         return this.receita;
     }
     
     public void setPessoa(Pessoa pessoa){
         this.pessoa = pessoa;
     }
     public Pessoa getPessoa(){
         return this.pessoa;
     }
}
