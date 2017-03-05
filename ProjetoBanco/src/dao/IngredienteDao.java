package dao;

import java.util.ArrayList;

import dominio.Ingrediente;
import dominio.Receita;
import java.sql.SQLException;


public class IngredienteDao {

	private DataBase db = new DataBase();
	
	
	public void listarIngredientes(){
		
		try{
			db.conectar();
			
			String query = "SELECT * FROM ingrediente";
			db.resultset=db.statement.executeQuery(query);
			
			while(db.resultset.next()){
				String codReceita= db.resultset.getString("codReceita");
				int seqIngrediente=db.resultset.getInt("seqIngrediente");
				String descricao=db.resultset.getString("descricao");
				String quantidade=db.resultset.getString("quantidade");
				String unidade=db.resultset.getString("unidade");
				
				System.out.println("Codigo R.: "+codReceita+
								   "Sequencia do Ingrediente: "+ seqIngrediente +
								   "Descri��o:  "+ descricao +
								   "Quantidade: " + quantidade +
								   "Unidade: " + unidade);
				}
			
			db.desconectar();
			
			}catch(SQLException e){
			System.out.println("Erro: "+e);
		}
	}
		
	public void inserirIngrediente(Ingrediente ingrediente){
			
			String codReceita= ingrediente.getCodigoReceita();
			String seqIngrediente= String.valueOf(ingrediente.getSeqIngrdiente());
			String descricao= ingrediente.getDescricao();
			String quantidade= Float.toString(ingrediente.getQuantidade());
			String unidade=ingrediente.getUnidade();
			
			try{
				db.conectar();
				String query=" INSERT INTO ingrediente(codReceita, seqIngrediente, descricao, quantidade, unidade)"
						+ " VALUES ('"+codReceita+"','"+ seqIngrediente+"','"+descricao+"','"+quantidade+"','"+unidade+"');";
				
				db.statement.executeUpdate(query);
				db.desconectar();
			}catch (Exception e){
				System.out.println("Erro: "+e);
			}
		}
		
	public void atualizarIngrediente(Ingrediente ingrediente){
			
			String codReceita= ingrediente.getCodigoReceita();
			String seqIngrediente= String.valueOf(ingrediente.getSeqIngrdiente());
			String descricao= ingrediente.getDescricao();
			String quantidade= Float.toString(ingrediente.getQuantidade());
			String unidade=ingrediente.getUnidade();
			
			
			
			try{
				db.conectar();
				String query="UPDATE ingrediente SET codReceita='"+codReceita+
						"',seqIngrediente='"+seqIngrediente+
						"', descricao='"+descricao+
						"',quantidade='"+quantidade+
						"', unidade='"+unidade+
						"', WHERE codReceita="+codReceita+" AND seqIngrediente="+seqIngrediente+";";
				
				db.statement.executeUpdate(query);
				db.desconectar();
			}catch (Exception e){
				System.out.println("Erro: "+e);
			}
		}
		
	public void deletarIngrediente(Ingrediente ingrediente){
			
			String codReceita= ingrediente.getCodigoReceita();
			String seqIngrediente= String.valueOf(ingrediente.getSeqIngrdiente());
			
			try{
				db.conectar();
				String query="DELETE FROM ingrediente WHERE codReceita="+codReceita+" AND seqIngrediente="+seqIngrediente+";";
				db.statement.executeUpdate(query);
				db.desconectar();
			}catch (Exception e){
				System.out.println("Erro: "+e);
			}
			
		}
	
		//Testar
	public ArrayList<Ingrediente> getListaIngredientesReceita(Receita receita){
			
			String codigoReceita=receita.getCodigoPessoa();
			ArrayList<Ingrediente> listaIngrediente= new ArrayList<Ingrediente>();
			
			try{
				db.conectar();
				
				String query = "SELECT * FROM ingrediente WHERE codreceita= "+codigoReceita+";";
				db.resultset=db.statement.executeQuery(query);
				
				while(db.resultset.next()){
					Ingrediente ingrediente= new Ingrediente();
					
					
					String codReceita= db.resultset.getString("codReceita");
					int seqIngrediente=db.resultset.getInt("seqIngrediente");
					String descricao=db.resultset.getString("descricao");
					String quantidade=db.resultset.getString("quantidade");
					String unidade=db.resultset.getString("unidade");
					
					
					ingrediente.setCodigoReceita(codReceita);
					ingrediente.setDescricao(descricao);
					ingrediente.setQuantidade(Float.parseFloat(quantidade));
					ingrediente.setSeqIngrdiente(seqIngrediente);
					ingrediente.setUnidade(unidade);
					
					listaIngrediente.add(ingrediente);
					
					}
		
				db.desconectar();
				
				return listaIngrediente;
				
				}catch(Exception e){
				System.out.println("Erro: "+e);
			} return null;
		}
		
               public void cadastrarListaIngredientes(ArrayList<Ingrediente> listaIngrediente){
                   
                   try{
                       db.conectar();
                       for( int i=0; i<listaIngrediente.size();i++){
                           Ingrediente ingrediente= listaIngrediente.get(i);
                           this.inserirIngrediente(ingrediente);
                       }
                   }catch(Exception e){
                       System.out.println("Erro: "+e);
                   }
               }
		
		
	}

