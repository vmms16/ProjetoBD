package dao;

import java.util.ArrayList;
import dominio.Telefone;

public class TelefoneDao{
	
	private DataBase db=new DataBase();
	

	public void listarTelefone(){
		
		try{
			
			db.conectar();
			String query="SELECT * FROM tel";
			db.resultset=db.statement.executeQuery(query);
			db.statement=db.connection.createStatement();
			
			while(db.resultset.next()){
				String codpessoa= db.resultset.getString("codpessoa");
				String numtel=db.resultset.getString("numtel");
				String tipotel=db.resultset.getString("tipotel");
				
				System.out.println("Codigo P.: "+codpessoa+" Telefone: "+ numtel +" Tipo: "+ tipotel);
				
			
			}
			db.desconectar();
			
		}catch (Exception e){
			System.out.println("Erro: "+e.getMessage());
		}
		
	}
	
	public void inserirTelefone(Telefone telefone){
		
		String codpessoa= telefone.getCodigoPessoa();
		String numtel=telefone.getNumero();
		String tipotel=telefone.getTipo();
		
		try{
			db.conectar();
			String query=" INSERT INTO tel(codpessoa,numtel,tipotel) VALUES ('"+codpessoa+"','"+ numtel+"','"+tipotel+"');";
			db.statement.executeUpdate(query);
			db.desconectar();
	
		}catch (Exception e){
			System.out.println("Erro: "+e);
		}
	}
	
	public void atualizarTelefone(Telefone telefone){
		
		String codpessoa= telefone.getCodigoPessoa();
		String numtel=telefone.getNumero();
		String tipotel=telefone.getTipo();
		
		
		try{
			
			db.conectar();
			String query="UPDATE tel SET codpessoa='"+codpessoa+"', numtel='"+numtel+"', tipotel='"+tipotel+"' WHERE codpessoa="+codpessoa+";";
			db.statement.executeUpdate(query);
			db.desconectar();
			
		}catch (Exception e){
			System.out.println("Erro: "+e.getMessage());
		}
	}
	
	public void deletarTelefone(Telefone telefone){
		
		String codpessoa= telefone.getCodigoPessoa();
		String numtel=telefone.getNumero();
		
		
		try{
			
			db.conectar();
			String query="DELETE FROM tel WHERE numtel="+numtel+" AND codpessoa="+codpessoa+";";
			db.statement.executeUpdate(query);
			db.desconectar();
			
		}catch (Exception e){
			System.out.println("Erro: "+e.getMessage());
		}
		
	}
	
	public void cadastrarListaTelefones(ArrayList<Telefone> listaTelefone){
		
		db.conectar();
		try{
		for (int i=0; i<listaTelefone.size();i++){
			String codpessoa=listaTelefone.get(i).getCodigoPessoa();
			String numtel=listaTelefone.get(i).getNumero();
			String tipotel=listaTelefone.get(i).getTipo();
			String query=" INSERT INTO tel(codpessoa,numtel,tipotel) VALUES ('"+codpessoa+"','"+
			numtel+"','"+
					tipotel+"');";
			db.statement.executeUpdate(query);
			}
		}catch(Exception e){
			System.out.println("Erro: "+e.getMessage());
			}
		db.desconectar();
	}
		
	
}
