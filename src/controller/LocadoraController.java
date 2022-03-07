package controller;

import model.Cliente;
import model.Filme;
import model.Funcionario;
import model.Locadora;

public class LocadoraController {

	public static void alugarFilme(Locadora locadora) {
		boolean filmeDisponivel = false;

		System.out.println("-------------------------------");
		System.out.println("Filme disponíveis para aluguel: ");
		System.out.println("");

		for (Filme filme : locadora.getBibliofilmes()) {
			if (!filme.isAlugado()) {
				FilmeController.listarfilme(filme);
				System.out.println("");
				filmeDisponivel = true;
			} 
		}

		if (!filmeDisponivel) {
			System.out.println("Nenhum filme está disponível para aluguel.");
			return;
		}

		Cliente cliente = locadora.buscaCliente(ClienteController.getIdentificador());

		if (cliente == null)
			return;

		Funcionario funcionario = locadora.buscaFuncionario(FuncionarioController.getIdentificador());

		if (funcionario == null)
			return;

		Filme filme = locadora.buscaFilme(FilmeController.getIdentificador());

		if (filme == null)
			return;

		if (filme.isAlugado()) {
			System.out.println("O filme já está alugado por outro cliente.");
			return;
		}

		locadora.alugarFilme(cliente, funcionario, filme);

		System.out.println("Filme alugado com sucesso.");
	}

	public static void devolverFilme(Locadora locadora) {
		Cliente cliente = locadora.buscaCliente(ClienteController.getIdentificador());

		if (cliente == null)
			return;

		Filme filme = locadora.buscaFilme(FilmeController.getIdentificador());

		if (filme == null)
			return;

		if (!filme.isAlugado()) {
			System.out.println("O filme não está alugado.");
			return;
		}

		if (!cliente.getFilmes().contains(filme)) {
			System.out.println("O filme não foi alugado por você.");
			return;
		}

		locadora.devolverFilme(cliente, filme);

		System.out.println("Filme devolvido com sucesso.");
	}

}
