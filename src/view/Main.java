package view;

import controller.*;
import model.*;

public class Main {

	public static void main(String args[]) {
		Locadora locadora = new Locadora();
		int escolha;

		do {
			escolha = Utills.menuPrincipal();
			switch (escolha) {
			case 1:
				int escolhamenucliente;

				do {
					escolhamenucliente = Utills.menuCliente();

					switch (escolhamenucliente) {
					case 1:
						Cliente cliente = ClienteController.adicionarcliente();
						locadora.setClientes(cliente);  
						break;
					case 2:
						locadora.getClientes();
						break;
					}
				} while (escolhamenucliente != 0);

				break;
			case 2:
				int escolhafuncionario;

				do {
					escolhafuncionario = Utills.menuFuncionario();

					switch (escolhafuncionario) {
					case 1:
						Funcionario funcionario = FuncionarioController.adicionarfuncionario();
						locadora.setFuncionarios(funcionario);
						break;
					case 2:
						locadora.getFuncionarios();
						break;
					}
				} while (escolhafuncionario != 0);

				break;
			case 3:
				int escolhafilmes;

				do {
					escolhafilmes = Utills.menuFilmes();

					switch (escolhafilmes) {
					case 1:
						Filme filmes = FilmeController.adicionarfilme();
						locadora.setBibliofilmes(filmes);
						break;
					case 2:
						locadora.getFilmes();
						break;
					}
				} while (escolhafilmes != 0);

				break;
			case 4:
				int escolhalocadora;
				
				do {
					escolhalocadora = Utills.menuLocadora();
					
					switch (escolhalocadora) {
					case 1:
						LocadoraController.devolverFilme(locadora);
						break;
					case 2:
						LocadoraController.alugarFilme(locadora);
						break;
					}
				} while (escolhalocadora != 0);
				
				break;
			case 0:
				return;
			}
		} while (escolha != 0);
	}
}
