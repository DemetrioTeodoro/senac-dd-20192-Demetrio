package model.entity;

public class Operacional extends Empregado {

	public Operacional() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operacional(int id, String nome, String cpf, boolean sexo, int idade, int salarioBruto,
			int descontosImpostoDeRenda, int contribuicaoPrevidenciaria) {
		super(id, nome, cpf, sexo, idade, salarioBruto, descontosImpostoDeRenda, contribuicaoPrevidenciaria);
		// TODO Auto-generated constructor stub
	}



	public double calSalarioBase(int salarioBruto) {
		double acrescimoOperacional = 0;
		acrescimoOperacional = 85/salarioBruto;
		return salarioBruto + acrescimoOperacional; 
	}
	
	@Override
	public double descontos(double salarioBase) {
		// TODO Auto-generated method stub
		return super.descontos(salarioBase);
	}
	
	
	
}
