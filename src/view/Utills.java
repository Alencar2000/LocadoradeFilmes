package view;

import java.util.Scanner;

public class Utills {
	
	@SuppressWarnings("resource")
	public static int menuPrincipal() {
		int op;

		Scanner escolher = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("Locadora  de filmes");
		System.out.println("1 - Menu Cliente");
		System.out.println("2 - Menu Funcionario");
		System.out.println("3 - Menu Filme");
		System.out.println("4 - Locadora ");
		System.out.println("0 - Sair");
		System.out.println("-------------------------------");
		op = escolher.nextInt();
		return op;

	}

	@SuppressWarnings("resource")
	public static int menuCliente() {

		int op;
		Scanner escolher = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("1 - Adicionar cliente");
		System.out.println("2 - Listar clientes ");
		System.out.println("0 - Sair");
		System.out.println("-------------------------------");
		op = escolher.nextInt();
		return op;

	}

	@SuppressWarnings("resource")
	public static int menuFuncionario() {
		int op;
		Scanner escolher = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("1 - Adicionar funcionario");
		System.out.println("2 - Listar funcionario ");
		System.out.println("0 - Sair");
		System.out.println("-------------------------------");
		op = escolher.nextInt();
		return op;
	}

	@SuppressWarnings("resource")
	public static int menuFilmes() {
		int op;
		Scanner escolher = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("1 - Adicionar filmes");
		System.out.println("2 - Listar filmes ");
		System.out.println("0 - Sair");
		System.out.println("-------------------------------");
		op = escolher.nextInt();
		return op;
	}

	@SuppressWarnings("resource")
	public static int menuLocadora() {
		int op;
		Scanner escolher = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("1 - Devolver filmes");
		System.out.println("2 - Alugar filmes ");
		System.out.println("0 - Sair");
		System.out.println("-------------------------------");
		op = escolher.nextInt();
		return op;
	}
	
}
