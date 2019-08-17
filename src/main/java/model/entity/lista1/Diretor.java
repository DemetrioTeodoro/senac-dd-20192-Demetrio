package model.entity.lista1;

public class Diretor extends Empregado {
	
	private String nomeString;
	private Gerente[] gerentes;
		
	public Diretor(int id, String nome, String cpf, boolean sexo, int idade, double salarioBruto,
			double descontosImpostoDeRenda, double contribuicaoPrevidenciaria, double salarioBase, String nomeString,
			Gerente[] gerentes) {
		super(id, nome, cpf, sexo, idade, salarioBruto, descontosImpostoDeRenda, contribuicaoPrevidenciaria,
				salarioBase);
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
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	

}
