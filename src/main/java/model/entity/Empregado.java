package model.entity;

public abstract class Empregado {
	
	int id;
	String nome;
	String cpf;
	boolean sexo;
	int idade;
	int salarioBruto;
	int descontosImpostoDeRenda;
	int contribuicaoPrevidenciaria;
	
	public Empregado(int id, String nome, String cpf, boolean sexo, int idade, int salarioBruto,
			int descontosImpostoDeRenda, int contribuicaoPrevidenciaria) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
		this.salarioBruto = salarioBruto;
		this.descontosImpostoDeRenda = descontosImpostoDeRenda;
		this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
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

	public int getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(int salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public int getDescontosImpostoDeRenda() {
		return descontosImpostoDeRenda;
	}

	public void setDescontosImpostoDeRenda(int descontosImpostoDeRenda) {
		this.descontosImpostoDeRenda = descontosImpostoDeRenda;
	}

	public int getContribuicaoPrevidenciaria() {
		return contribuicaoPrevidenciaria;
	}

	public void setContribuicaoPrevidenciaria(int contribuicaoPrevidenciaria) {
		this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
	}

	public double descontos(double salarioBase) {
		double descontoIr = 0;
		double descontoPrevidencia = 0;
		double salario = 0;
		if (salarioBase < 1800) {
			salario = salarioBase;
		} else if (salarioBase >= 1800 || salarioBase <= 3000) {
				descontoIr = 10/salarioBase;
		} else if (salarioBase > 3000) {
				descontoIr = 15/salarioBase;
		}
		
		if (this.getIdade() < 45) {
			descontoPrevidencia = 12/salarioBase;
		} else if (this.getIdade() >= 45) {
			descontoPrevidencia = 8/salarioBase;
		}
		
		return salarioBase - descontoPrevidencia - descontoIr;
	}
	

}
