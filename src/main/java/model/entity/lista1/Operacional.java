package model.entity.lista1;

public class Operacional extends Empregado {

	public Operacional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operacional(int id, String nome, String cpf, boolean sexo, int idade, double salarioBruto, Lotacao lotacao,
			double descontosImpostoDeRenda, double contribuicaoPrevidenciaria, double salarioBase) {
		super(id, nome, cpf, sexo, idade, salarioBruto, lotacao, descontosImpostoDeRenda, contribuicaoPrevidenciaria,
				salarioBase);
		// TODO Auto-generated constructor stub
	}

	public double calSalarioBase(int salarioBruto) {
		double acrescimoOperacional = 0;
		acrescimoOperacional = 85 / salarioBruto;
		return salarioBruto + acrescimoOperacional;
	}

	@Override
	public double calculaSalario() {
		double salario = (this.getSalarioBase() * (0.85));
		return salario;
	}

}
