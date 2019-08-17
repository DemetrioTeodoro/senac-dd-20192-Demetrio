package model.entity.lista1;

public class Gerente extends Empregado {
	
	private String nome;
	private Operacional[] subordinados;
	
	public Gerente(int id, String nome, String cpf, boolean sexo, int idade, double salarioBruto,
			double descontosImpostoDeRenda, double contribuicaoPrevidenciaria, double salarioBase, String nome2,
			Operacional[] subordinados) {
		super(id, nome, cpf, sexo, idade, salarioBruto, descontosImpostoDeRenda, contribuicaoPrevidenciaria,
				salarioBase);
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
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	
	

}
