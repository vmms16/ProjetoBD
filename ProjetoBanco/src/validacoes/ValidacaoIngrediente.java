/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacoes;

import dominio.Ingrediente;
import java.util.List;

/**
 *
 * @author Vinicius
 */
public class ValidacaoIngrediente {
    
    public static boolean verificarIngredienteLista(List<Ingrediente> listaIngrediente, Ingrediente ingrediente){
        
        for( int i=0; i<listaIngrediente.size();i++){
            
            if( listaIngrediente.get(i).getSeqIngrdiente()==ingrediente.getSeqIngrdiente()){
                return true;
            }
            
        }
        
        return false;
    }
    
}
