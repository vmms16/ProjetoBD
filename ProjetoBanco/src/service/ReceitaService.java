package service;

import java.util.ArrayList;

import dao.ReceitaDao;
import dominio.Receita;

public class ReceitaService {
	
	private ReceitaDao receitaDao= new ReceitaDao();
	
	public void cadastrarReceita(Receita receita){
		
		receitaDao.inserirReceita(receita);
		
	}
	
	public void deletarReceita(Receita receita){
		receitaDao.deletarReceita(receita);
	}
	
	public ArrayList<Receita> getTodasReceitas(){
		return new ReceitaDao().getTodasReceitas();
		
	}
	
	public ArrayList<Receita> getTodasReceitas(String titulo){
		return new ReceitaDao().getTodasReceita(titulo);
		
	}
        
        public boolean existeReceita(Receita receita){
            return new ReceitaDao().existReceita(receita);
        }
	
	

}
