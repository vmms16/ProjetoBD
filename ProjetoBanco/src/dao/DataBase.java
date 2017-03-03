package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DataBase {
	
	public Connection connection=null;
	public Statement statement=null;
	public ResultSet resultset=null;
	
	public void conectar(){
		
		String servidor="jdbc:mysql://127.0.0.1:3306/culinaria";
		String usuario="root";
		String senha="9010";
		String driver="com.mysql.jdbc.Driver";
		
		try{
			
			Class.forName(driver);
			this.connection= (Connection)DriverManager.getConnection(servidor,usuario,senha);
			this.statement=this.connection.createStatement();
			
		}catch (Exception e){
			
			System.out.println("Erro: "+e);
		}
	}
	
	public boolean estaConectato(){
		
		if(this.connection!=null){
			return true;
		}else{
			return false;
		}
	}
	
	public void desconectar(){
		try{
			this.connection.close();
		}catch (Exception e){
			System.out.println("Erro: "+e);
		}
	}
}