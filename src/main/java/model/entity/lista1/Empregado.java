package model.entity.lista1;

public abstract class Empregado {

	private int id;
	private String nome;
	private String cpf;
	private boolean sexo;
	private int idade;
	private double salarioBruto;
	private Lotacao lotacao;
	private double descontosImpostoDeRenda;
	private double contribuicaoPrevidenciaria;
	private double salarioBase;

	public Empregado(int id, String nome, String cpf, boolean sexo, int idade, double salarioBruto, Lotacao lotacao,
			double descontosImpostoDeRenda, double contribuicaoPrevidenciaria, double salarioBase) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
		this.salarioBruto = salarioBruto;
		this.lotacao = lotacao;
		this.descontosImpostoDeRenda = descontosImpostoDeRenda;
		this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
		this.salarioBase = salarioBase;
	}

	public Empregado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Lotacao getLotacao() {
		return lotacao;
	}

	public void setLotacao(Lotacao lotacao) {
		this.lotacao = lotacao;
	}

	public double getDescontosImpostoDeRenda() {
		return descontosImpostoDeRenda;
	}

	public void setDescontosImpostoDeRenda(double descontosImpostoDeRenda) {
		this.descontosImpostoDeRenda = descontosImpostoDeRenda;
	}

	public double getContribuicaoPrevidenciaria() {
		return contribuicaoPrevidenciaria;
	}

	public void setContribuicaoPrevidenciaria(double contribuicaoPrevidenciaria) {
		this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public abstract double calculaSalario();

	public void calcularSalarioBase(double salarioBruto) {
		calculaDescontoIr();
		calculaDescontoInss();
		salarioBase = salarioBruto - (descontosImpostoDeRenda + contribuicaoPrevidenciaria);
	}

	public void calculaDescontoIr() {
		double descontosImpostoDeRendaMet;
		if (salarioBruto < 1800) {
			descontosImpostoDeRendaMet = 0;
		} else if (salarioBruto < 1800 || salarioBruto >= 3000) {
			descontosImpostoDeRendaMet = ((salarioBruto / 100) * 10);
		} else {
			descontosImpostoDeRendaMet = ((salarioBruto / 100) * 30);
		}
		descontosImpostoDeRenda = descontosImpostoDeRendaMet;
	}

	public void calculaDescontoInss() {
		if (idade < 45) {
			contribuicaoPrevidenciaria = salarioBruto - ((salarioBruto / 100) * 12);
		} else {
			contribuicaoPrevidenciaria = salarioBruto - ((salarioBruto / 100) * 8);
		}

	}

}
