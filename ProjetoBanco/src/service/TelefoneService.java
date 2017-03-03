package service;

import java.util.ArrayList;

import dao.TelefoneDao;
import dominio.Telefone;

public class TelefoneService {
	
	private TelefoneDao telefoneDao= new TelefoneDao();
	
	public void cadastrarListaTelefone(ArrayList<Telefone> listaTelefone){
		this.telefoneDao.cadastrarListaTelefones(listaTelefone);
	}
	
	public void cadastrarTelefone(Telefone telefone){
		this.telefoneDao.inserirTelefone(telefone);
	}
	
	public void atualizarTelefone(Telefone telefone){
		this.telefoneDao.atualizarTelefone(telefone);
	}
	
	public void deletarTelefone(Telefone telefone){
		this.telefoneDao.deletarTelefone(telefone);
	}

}
