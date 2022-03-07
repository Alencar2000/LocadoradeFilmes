package model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	private int codigocliente = 0;
	private ArrayList<Filme> filmes = new ArrayList<Filme>();

	public Cliente() {
		super();
	}

	public Cliente(String nome, String endereco, String telefone, int idade) {
		super(nome, endereco, telefone, idade);
		this.codigocliente = ++Contadores.countcliente;
	}

	public void setCodigocliente(int codigocliente) {
		this.codigocliente = codigocliente;
	}

	public int getCodigocliente() {
		return codigocliente;
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(ArrayList<Filme> filmes) {
		this.filmes = filmes;
	}

}
