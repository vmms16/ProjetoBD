/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacoes;

import java.util.List;
import dominio.Telefone;

/**
 *
 * @author Vinicius
 */
public class ValidacaoTelefone {
        
        public static boolean existInList(List<Telefone> listaTelefone, Telefone telefone){
            
            for(int i=0; i<listaTelefone.size();i++){
                if( listaTelefone.get(i).getNumero().equals(telefone.getNumero())){
                    return true;
                }
            }
            return false;
}
    
}
