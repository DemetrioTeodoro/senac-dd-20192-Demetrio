package model.entity;

public class Gerente extends Empregado {
	
	String nome;
	Operacional[] subordinados;
	
	public Gerente(int id, String nome, String cpf, boolean sexo, int idade, int salarioBruto,
			int descontosImpostoDeRenda, int contribuicaoPrevidenciaria, String nome2, Operacional[] subordinados) {
		super(id, nome, cpf, sexo, idade, salarioBruto, descontosImpostoDeRenda, contribuicaoPrevidenciaria);
		nome = nome2;
		this.subordinados = subordinados;
	}

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double calSalarioBase(int salarioBruto) {
		double acrescimoGerente = 0;
		acrescimoGerente = 90/salarioBruto;
		return salarioBruto + acrescimoGerente; 
	}
	
	@Override
	public double descontos(double salarioBase) {
		// TODO Auto-generated method stub
		return super.descontos(salarioBase);
	}

	
	
	

}
