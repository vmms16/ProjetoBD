package service;

import dominio.Pessoa;

import dao.*;


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

}
