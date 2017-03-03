package dao;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Pessoa;
import dominio.Receita;
import dominio.Telefone;
import service.PessoaService;
import service.ReceitaService;
import service.TelefoneService;

public class Main {
	public static void main(String[] args){
		
		PessoaService pessoaService= new PessoaService();
		TelefoneService telefoneService= new TelefoneService();
		/*
		Telefone tel= new Telefone();
		tel.setCodigoPessoa("08858655451");
		tel.setNumero("885209732");
		tel.setTipo("Pós-Pago");
		*/
		//telefoneService.deletarTelefone(tel);
		
		
		
		//telefoneService.cadastrarTelefone(tel);
		
		Pessoa pessoa1= new Pessoa();
		Pessoa pessoa2= new Pessoa();
		
		pessoa1.setCodigo("08858655451");
		pessoa2.setCodigo("14342425213");
		
		pessoa1.setNome("Vinicius Mateus");
		pessoa2.setNome("João");
		
		pessoa1.setEmail("vmms16@gmail.com");
		pessoa2.setEmail("joaoleo17@gmail.com");
		
		pessoa1.setEndereco("Rua do Limoeiro");
		pessoa2.setEndereco("Rua das Laranjeiras");
		
		pessoaService.deletarPessoa(pessoa1);
		
		/*pessoaService.cadastrarPessoa(pessoa1);
		pessoaService.cadastrarPessoa(pessoa2);
		*/
		
		/*
		System.out.println("--------Selecione a Opção--------");
		System.out.println("1-Cadastrar Pessoa");
		System.out.println("2-Cadastrar Receita");
		System.out.println("3-Consultar Pessoa");
		System.out.println("4-Connsultar Receita");
		
		System.out.print("Opção: ");
		Scanner ler= new Scanner(System.in);
		
		int x= ler.nextInt();
		
		
		switch(x){
		case 1:
			//ArrayList<Telefone> listaTelefone= new ArrayList<Telefone>();
			Pessoa pessoa= new Pessoa();
			
			System.out.println("Nome:");
			String nome= ler.next();
			pessoa.setNome(nome);
			
			System.out.println("Endereço:");
			String endereco= ler.nextLine();
			pessoa.setEndereco(endereco);
			
			System.out.println("E-mail:");
			String email= ler.nextLine();
			pessoa.setEmail(email);
			
			//pessoaService.cadastrarPessoa(pessoa);
				
		}
		
*/		

	}

}
