package model;

import java.util.ArrayList;

import controller.ClienteController;
import controller.FilmeController;
import controller.FuncionarioController;

public class Locadora {
	
	private ArrayList<Filme> bibliofilmes = new ArrayList<Filme>();
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public Locadora() {
		super();
	}

	public ArrayList<Filme> getBibliofilmes() {
		return bibliofilmes;
	}
	
	public void getFilmes() {
		for (Filme filme : this.bibliofilmes) {
			FilmeController.listarfilme(filme);
		}
	}

	public void setBibliofilmes(Filme filme) {
		this.bibliofilmes.add(filme);
	}
	
	public Filme buscaFilme(int codigo) {
		for (Filme filme : this.bibliofilmes) {
			if (filme.getId() == codigo) {
				return filme;
			}
		}
		
		System.out.println("Codigo não encontrado");
		return null;
	}

	public Filme buscaFilme(String nome) {
		for (Filme filme : this.bibliofilmes) {
			if (filme.getNome().equalsIgnoreCase(nome)) {
				return filme;
			}
		}
		
		System.out.println("Filme não encontrado");
		return null;
	}
	
	public ArrayList<Funcionario> getFuncionariosList() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}

	public void getFuncionarios() {
		for (Funcionario funcionario : this.funcionarios) {
			FuncionarioController.listarfuncionario(funcionario);
		}
	}
	
	public Funcionario buscaFuncionario(int codigo) {
		for (Funcionario funcionario : this.funcionarios) {
			if (funcionario.getRegistro() == codigo) {
				return funcionario;
			}
		}
		
		System.out.println("Codigo não encontrado");
		return null;
	}

	public void getClientes() {
		for (Cliente cliente : this.clientes) {
			ClienteController.listarcliente(cliente);
		}
	}

	public void deleteCliente(int codigo) {
		Cliente cliente = buscaCliente(codigo);
		
		if (cliente != null) {
			this.clientes.remove(cliente);
		}
	}
	
	public Cliente buscaCliente(int codigo) {
		for (Cliente cliente : this.clientes) {
			if (cliente.getCodigocliente() == codigo) {
				return cliente;
			}
		}
		
		System.out.println("Codigo não encontrado");
		return null;
	}

	public void setClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void alugarFilme(Cliente cliente, Funcionario funcionario, Filme filme) {
		cliente.getFilmes().add(filme);
				
		filme.setCliente(cliente);
		filme.setFuncionario(funcionario);
		filme.setAlugado(true);
		
		funcionario.setSalario(funcionario.getSalario() + (filme.getValor() * 0.1));
	}
	
	public void devolverFilme(Cliente cliente, Filme filme) {
		cliente.getFilmes().remove(filme);
		
		filme.setCliente(null);
		filme.setFuncionario(null);
		filme.setAlugado(false);
	}
	
}
