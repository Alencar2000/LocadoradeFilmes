package model;

public class Filme {

	private int id;
	private String nome;
	private double valor;
	private boolean alugado;
	private Cliente cliente;
	private Funcionario funcionario;

	public Filme(String nome, double valor) {
		super();
		this.nome = nome;
		this.id = ++Contadores.countfilme;
		this.valor = valor;
	}

	public Filme() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
