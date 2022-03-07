package model;

public class Funcionario extends Pessoa {
	
	private double salario;
	private int registro;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String endereco, String telefone, int idade, double salario) {
		super(nome, endereco, telefone, idade);
		this.salario = salario;
		this.registro = ++Contadores.countfuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

}
