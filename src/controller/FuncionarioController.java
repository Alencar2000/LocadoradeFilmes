package controller;

import java.util.Scanner;

import model.Contadores;
import model.Funcionario;

public class FuncionarioController {

	@SuppressWarnings("resource")
	public static Funcionario adicionarfuncionario() {
		Funcionario funcionario = new Funcionario();

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		funcionario.setNome(nome);
		System.out.println("Digite seu endereço: ");
		String endereco = sc.nextLine();
		funcionario.setEndereco(endereco);
		System.out.println("Digite o telefone: ");
		String telefone = sc.nextLine();
		funcionario.setTelefone(telefone);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		funcionario.setIdade(idade);
		System.out.println("Digite o salario: ");
		double salario = sc.nextInt();
		sc.nextLine();
		funcionario.setSalario(salario);

		Contadores.countfuncionario = Contadores.countfuncionario + 1;
		funcionario.setRegistro(Contadores.countfuncionario);

		return funcionario;
	}

	public static Funcionario listarfuncionario(Funcionario funcionario) {

		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Codigo funcionario: " + funcionario.getRegistro());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Idade: " + funcionario.getIdade());
		System.out.println("Salario: " + funcionario.getSalario());

		return funcionario;
	}

	public static int getIdentificador() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o identificador do funcionario: ");
		int codigo = sc.nextInt();
		sc.nextLine();

		return codigo;
	}
}
