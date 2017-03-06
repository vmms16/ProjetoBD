package dao;

import dominio.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDao {
	private DataBase db=new DataBase(); 
	

	public void listarPessoas(){
		
		try{
			db.conectar();
			String query= "SELECT * FROM PESSOA";
			db.resultset =db.statement.executeQuery(query);
			db.statement=db.connection.createStatement();
			
			
			while(db.resultset.next()){
				String codPessoa= db.resultset.getString("codpessoa");
				String nome= db.resultset.getString("nome");
				String endereco= db.resultset.getString("endereco");
				String email= db.resultset.getString("email");
				System.out.println("ID: "+codPessoa+" Nome: "+nome+" Endere�o: "+endereco+" E-mail: "+email);
			}
			
			db.desconectar();
				
				
		}catch (Exception e){
			System.out.println("Erro "+ e.getMessage());
		}
	}
	
	public void inserirPessoa(Pessoa pessoa){
		
		String codpessoa= pessoa.getCodigo();
		String nome= pessoa.getNome();
		String endereco= pessoa.getEndereco();
		String email= pessoa.getEmail();
		
		try{
			
			db.conectar();
			String query = "INSERT INTO PESSOA(codpessoa ,nome, endereco, email) VALUES ('"+codpessoa+"','"+nome+"','"+endereco+"','"+email+"');";
			db.statement.executeUpdate(query);
			db.desconectar();
			
		}catch (Exception e){
			System.out.println("Erro "+ e.getMessage());
		}
	}
	
	public void atualizarPessoa(Pessoa pessoa){
		
		String codpessoa= pessoa.getCodigo();
		String nome= pessoa.getNome();
		String endereco= pessoa.getEndereco();
		String email= pessoa.getEmail();
		
		
		try{
			
			db.conectar();
			String query= "UPDATE pessoa SET nome='"+nome+"', endereco= '"+endereco+"', email ='"+ email+"' WHERE codpessoa ="+ codpessoa+";";
			db.statement.executeUpdate(query);
			db.desconectar();
			
		} catch (Exception e){
			System.out.println("Erro "+ e.getMessage());
		}
	}
	
	public void deletarPessoa(Pessoa pessoa){
		
		String codpessoa= pessoa.getCodigo();
		
		
		try{
			
			db.conectar();
			String query= "DELETE FROM pessoa WHERE codpessoa='"+codpessoa+"';";
			db.statement.executeUpdate(query);
			db.desconectar();
		
		}catch (Exception e){
			System.out.println("Erro "+ e.getMessage());
		}
		
	}
	
	public Pessoa getPessoa(String nome){
		try{
			db.conectar();
			String query= "SELECT * FROM pessoa WHERE nome='"+nome+"';";
			db.resultset= db.statement.executeQuery(query);
			db.statement= db.connection.createStatement();
			
			Pessoa pessoa= new Pessoa();
			pessoa.setCodigo(db.resultset.getString("codpessoa").toString());
			pessoa.setNome(db.resultset.getString("nome"));
			pessoa.setEmail(db.resultset.getString("email"));
			pessoa.setEndereco(db.resultset.getString("endereco"));
			
			db.desconectar();
			return pessoa;
			
			
		}catch(Exception e){
			System.out.println("Erro "+ e.getMessage());
		}
		
		return null;
	}
        
        public boolean existPessoa(String codpessoa){
            

            try{
                db.conectar();
                String query= "SELECT * FROM pessoa WHERE codpessoa='"+codpessoa+"';";
                db.resultset= db.statement.executeQuery(query);
                db.statement= db.connection.createStatement();
                
                if(db.resultset.next()){
                    return true;
                }else{
                    return false;
                }
            }catch(SQLException e){
                System.out.println("Erro: "+e);
        }
            return false;
		
    
        }
        
        public ArrayList<Pessoa> getTodasPessoas(){
            ArrayList<Pessoa> listaPessoas = new ArrayList();
            
            try{
			db.conectar();
			String query= "SELECT * FROM PESSOA";
			db.resultset =db.statement.executeQuery(query);
			db.statement=db.connection.createStatement();
			
			
			while(db.resultset.next()){
				String codPessoa= db.resultset.getString("codpessoa");
				String nome= db.resultset.getString("nome");
				String endereco= db.resultset.getString("endereco");
				String email= db.resultset.getString("email");
				
                                Pessoa pessoa= new Pessoa();
                                pessoa.setCodigo(codPessoa);
                                pessoa.setEmail(email);
                                pessoa.setNome(nome);
                                pessoa.setEndereco(endereco);
                                
                                listaPessoas.add(pessoa);
                                
			}
			
			db.desconectar();
                        
                        return listaPessoas;
				
				
		}catch (SQLException e){
			System.out.println("Erro "+ e.getMessage());
		}
            
            
            return null;
        }
}



