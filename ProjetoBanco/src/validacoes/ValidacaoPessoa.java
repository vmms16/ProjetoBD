/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacoes;

import dao.PessoaDao;
import dominio.Pessoa;

/**
 *
 * @author Vinicius
 */
public class ValidacaoPessoa {
    
    public static boolean existePessoaCadastrada(String codpessoa){
        return new PessoaDao().existPessoa(codpessoa);
        
    }
    
}
