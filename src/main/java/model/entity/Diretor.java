package model.entity;

public class Diretor extends Empregado {
	
	String nomeString;
	Gerente[] gerentes;
	
	public Diretor(int id, String nome, String cpf, boolean sexo, int idade, int salarioBruto,
			int descontosImpostoDeRenda, int contribuicaoPrevidenciaria, String nomeString, Gerente[] gerentes) {
		super(id, nome, cpf, sexo, idade, salarioBruto, descontosImpostoDeRenda, contribuicaoPrevidenciaria);
		this.nomeString = nomeString;
		this.gerentes = gerentes;
	}
	
	public Diretor() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public double calSalarioBase(int salarioBruto) {
		double acrescimoDiretor = 0;
		acrescimoDiretor = 85/salarioBruto;
		return salarioBruto + acrescimoDiretor; 
	}

	@Override
	public double descontos(double salarioBase) {
		// TODO Auto-generated method stub
		return super.descontos(salarioBase);
	}
	
	
	
	

}
