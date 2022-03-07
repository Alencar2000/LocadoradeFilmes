package controller;

import java.util.Scanner;

import model.Cliente;
import model.Contadores;
import model.Filme;

public class ClienteController {

	public static Cliente adicionarcliente() {
		Cliente cliente = new Cliente();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		cliente.setNome(nome);
		System.out.println("Digite seu endereço: ");
		String endereco = sc.nextLine();
		cliente.setEndereco(endereco);
		System.out.println("Digite o telefone: ");
		String telefone = sc.nextLine();
		cliente.setTelefone(telefone);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		cliente.setIdade(idade);
		
		Contadores.countcliente = Contadores.countcliente + 1;
		cliente.setCodigocliente(Contadores.countcliente);

		return cliente;
	}

	public static Cliente listarcliente(Cliente cliente) {

		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Codigo cliente: " + cliente.getCodigocliente());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("Idade: " + cliente.getIdade());
		
		if (!cliente.getFilmes().isEmpty()) {
			System.out.println("Filmes alugados: ");
			
			for (Filme filme : cliente.getFilmes()) {
				System.out.println("  " + filme.getNome() + " - R$" + filme.getValor());
			}
		}

		return cliente;
	}

	public static int getIdentificador() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o identificador do cliente: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		
		return codigo;
	}

}
