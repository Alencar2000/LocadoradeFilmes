package controller;

import java.util.Scanner;

import model.Contadores;
import model.Filme;

public class FilmeController {
	
	public static Filme adicionarfilme() {

		Filme filme = new Filme();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do filme: ");
		String nome = sc.nextLine();
		filme.setNome(nome);
		System.out.println("Digite o valor do filme: ");
		double valor = sc.nextDouble();
		sc.nextLine();
		filme.setValor(valor);
		
		Contadores.countfilme = Contadores.countfilme + 1;
		filme.setId(Contadores.countfilme);

		return filme;
	}

	public static Filme listarfilme(Filme filme) {

		System.out.println("Nome do filme: " + filme.getNome());
		System.out.println("Codigo filme: " + filme.getId());
		System.out.println("Alugado: " + (filme.isAlugado() == false ? "Não" : "Sim"));
		System.out.println("Valor: " + filme.getValor());

		return filme;
	}

	public static int getIdentificador() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o identificador do filme: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		
		return codigo;
	}
}
