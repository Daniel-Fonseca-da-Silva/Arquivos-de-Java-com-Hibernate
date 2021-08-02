package com.abctreinamentos;

import java.util.Scanner;

public class ClienteApp {

	public static void main(String[] args) {
		
		try
		{
			
			Scanner entrada = new Scanner(System.in);
			int opcao = 0;
			int cpf;
			ClienteDAO clientedao = new ClienteDAO();
			String nome, email;
			while(opcao != 6)
			{
				System.out.println("Sistema de Gerenciamento de Clientes");
				System.out.println("------------------------------------");
				System.out.println("Digite [1] para consultar todos os clientes");
				System.out.println("Digite [2] para consultar um cliente");
				System.out.println("Digite [3] para cadastrar um novo cliente");
				System.out.println("Digite [4] para alterar um cliente");
				System.out.println("Digite [5] para excluir um cliente");
				System.out.println("Digite [6] para encerrar o programa");
				System.out.println("------------------------------------");
				opcao = entrada.nextInt();
				
				switch(opcao)
				{
					case 1:
					{
						System.out.println("[1] Consultando todos os clientes ativos");
						//consultarTodos();
						break;
					}
					case 2:
					{
						System.out.println("[2] Consultando um cliente selecionado");
						System.out.println("Informe o CPF do cliente");
						cpf = entrada.nextInt();
						System.out.println(clientedao.find(cpf));
						break;
						
					}
					case 3:
					{
						System.out.println("[3] Cadastrar um cliente selecionado");
						System.out.println("Informe o CPF do cliente");
						cpf = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Informe um nome valido");
						nome = entrada.nextLine();
						System.out.println("Informe um email valido");
						email = entrada.nextLine();
						Cliente cliente = new Cliente(cpf, nome, email);
						clientedao.persist(cliente);
						break;
					}
					case 4:
					{
						System.out.println("[4] Alterar um cliente");
						System.out.println("Informe o CPF do cliente");
						cpf = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Informe um nome valido");
						nome = entrada.nextLine();
						System.out.println("Informe um email valido");
						email = entrada.nextLine();
						Cliente cliente = new Cliente(cpf, nome, email);
						clientedao.merge(cliente);
						break;
					}
					case 5:
					{
						System.out.println("[5] Excluir um cliente selecionado");
						System.out.println("Informe o CPF do cliente");
						cpf = entrada.nextInt();
						entrada.nextLine();
						Cliente cliente = clientedao.find(cpf);
						clientedao.delete(cliente);
						break;
					}
					case 6:
					{
						System.out.println("Finalizando a sessão atual...");
						break;
					}
				}
				
			}
			entrada.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
