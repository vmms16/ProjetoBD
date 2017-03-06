package service;

import dominio.Pessoa;

import dao.*;
import java.util.ArrayList;


public class PessoaService {
	
	private PessoaDao pessoaDao= new PessoaDao();

	
	
	public void cadastrarPessoa(Pessoa pessoa){
		
		this.pessoaDao.inserirPessoa(pessoa);
		
	}
	
	public void atualizarPessoa(Pessoa pessoa){
		this.pessoaDao.atualizarPessoa(pessoa);
	}
	
	public void deletarPessoa(Pessoa pessoa){
		this.pessoaDao.deletarPessoa(pessoa);
	}
	
	public Pessoa getPessoa(Pessoa pessoa){
		String nome= pessoa.getNome();
		return new PessoaDao().getPessoa(nome);
	}
        
        public ArrayList<Pessoa> getTodasPessoas(){
            return new PessoaDao().getTodasPessoas();
        }
}
