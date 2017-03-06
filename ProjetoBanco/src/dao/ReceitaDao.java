package dao;


import java.util.ArrayList;

import dominio.Receita;
import java.sql.SQLException;


public class ReceitaDao {
	
	private DataBase db= new DataBase();
	
	
	public void listarReceita(){
		try{
			
			db.conectar();
			
			String query="SELECT * FROM receita";
			db.resultset=db.statement.executeQuery(query);
			
			while(db.resultset.next()){
				String codreceita=db.resultset.getString("codreceita");
				String titulo=db.resultset.getString("titulo");
				String modopreparo=db.resultset.getString("modopreparo");
				
				System.out.println("Cod. Receita= "+codreceita+" Titulo= "+titulo+" Modo de Preparo: "+modopreparo);
			}
			
		}catch (Exception e){
			System.out.println("Erro: "+e);
		}
	}
	
	public void inserirReceita(Receita receita){
		
		String codreceita= receita.getCodReceita();
		String titulo = receita.getTitulo();
		String codpessoa= receita.getCodigoPessoa();
		String modopreparo= receita.getModoPreparo();
		String datapostagem= receita.getData();
		
		try{
			db.conectar();
			String values="('"+codreceita+"','"+datapostagem+"','"+titulo+"','"+modopreparo+"','"+codpessoa+"')";
			String query="INSERT INTO receita(codreceita,datapostagem, titulo, modopreparo, codpessoa) VALUES "+values+";";
			db.statement.executeUpdate(query);
			db.desconectar();
		}catch (Exception e){
			System.out.println("Erro: "+e);
		}
	}
	
	public void atualizarReceita(Receita receita){
		
		String codreceita= receita.getCodReceita();
		String titulo = receita.getTitulo();
		//String codpessoa= receita.getCodigoPessoa();
		String modopreparo= receita.getModoPreparo();
		String datapostagem= receita.getData();
		
		
		
		try{
			db.conectar();
			String values= "datapostagem='"+datapostagem+"', titulo='"+titulo+"', modopreparo='"+modopreparo+"'";
			String query="UPDATE receita SET "+values+" WHERE codreceita="+codreceita;
			db.statement.executeUpdate(query);
			db.desconectar();
			
		}catch (Exception e){
			System.out.println("Erro :"+e);
		}
	}
	
	public void deletarReceita(Receita receita){
		
		String codreceita= receita.getCodReceita();
		//String titulo = receita.getTitulo();
		//String codpessoa= receita.getCodigoPessoa();
		//String modopreparo= receita.getModoPreparo();
		//String datapostagem= receita.getData();
		
		try{
			db.conectar();
			String query="DELETE FROM receita WHERE codreceita='"+codreceita+"';";
			db.statement.executeUpdate(query);
			db.desconectar();
		}catch (Exception e){
			System.out.println("Erro: "+e);
		}
	}
	
	//OK
	public ArrayList<Receita> getTodasReceitas(){
		ArrayList<Receita> receitas = new ArrayList<Receita>();
		
		try{
			
			db.conectar();
			
			String query="SELECT * FROM receita";
			db.resultset=db.statement.executeQuery(query);
			
			while(db.resultset.next()){
				String codreceita=db.resultset.getString("codreceita");
				String datapostagem=db.resultset.getString("datapostagem");
				String titulo=db.resultset.getString("titulo");
				String modopreparo=db.resultset.getString("modopreparo");
				String codpessoa=db.resultset.getString("codpessoa");
				
				Receita receita=new Receita();
				
				receita.setCodigoPessoa(codpessoa);
				receita.setData(datapostagem);
				receita.setModoPreparo(modopreparo);
				receita.setTitulo(titulo);
				receita.setCodReceita(codreceita);
				
                               
                                
				receitas.add(receita);
				
			}
			return receitas;
		}catch (Exception e){
			System.out.println("Erro: "+e);
		}
		
		return null;
	}
	
	
	//OK
	public ArrayList<Receita> getTodasReceita(String subString){
		ArrayList<Receita> receitas = new ArrayList<Receita>();
		
		try{
			
			db.conectar();
			
			String query="SELECT * FROM receita WHERE titulo LIKE '%"+subString+"%';";
			db.resultset=db.statement.executeQuery(query);
			
			while(db.resultset.next()){
				String codreceita=db.resultset.getString("codreceita");
				String datapostagem=db.resultset.getString("datapostagem");
				String titulo=db.resultset.getString("titulo");
				String modopreparo=db.resultset.getString("modopreparo");
				String codpessoa=db.resultset.getString("codpessoa");
				
				Receita receita=new Receita();
				
				receita.setCodigoPessoa(codpessoa);
				receita.setData(datapostagem);
				receita.setModoPreparo(modopreparo);
				receita.setTitulo(titulo);
				receita.setCodReceita(codreceita);
				
				receitas.add(receita);
				return receitas;
			}
			
		}catch (Exception e){
			System.out.println("Erro: "+e);
		}
		
		return null;
	
		
	}
	

        public boolean existReceita(Receita receita){
            
            String codpessoa = receita.getCodigoPessoa();
            String codreceita = receita.getCodReceita();
            
            try{
                db.conectar();
                String query = "SELECT * FROM receita WHERE codpessoa='"+codpessoa+"' AND codreceita="+codreceita+";";
                db.resultset= db.statement.executeQuery(query);
                db.statement= db.connection.createStatement();
                
                
                
                if(db.resultset.next()){
                    return true;
                }else{
                    return false;
                }
                
                
            }catch(SQLException e){
                System.out.println("Erro :"+e);
            }
            return false;
        }
}
