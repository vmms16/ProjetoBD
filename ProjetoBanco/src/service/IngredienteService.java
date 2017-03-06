package service;

import java.util.ArrayList;

import dao.IngredienteDao;
import dominio.Ingrediente;
import dominio.Receita;

public class IngredienteService {
	
	IngredienteDao ingredienteDao= new IngredienteDao();
	
	public void cadastrarIngrediente(Ingrediente ingrediente){
		this.ingredienteDao.inserirIngrediente(ingrediente);
		
	}
	
	public void atualizarIngrediente(Ingrediente ingrediente){
		this.ingredienteDao.atualizarIngrediente(ingrediente);
	}
	
	public void deletarIngrediente(Ingrediente ingrediente){
		this.ingredienteDao.deletarIngrediente(ingrediente);
	}
	
	public ArrayList<Ingrediente> getListaIngredientesReceita(Receita receita){
		return this.ingredienteDao.getListaIngredientesReceita(receita);
	}
        
        public void cadastrarListaIngrediente(ArrayList<Ingrediente> listaIngrediente){
            ingredienteDao.cadastrarListaIngredientes(listaIngrediente);
        }
        
       

}
