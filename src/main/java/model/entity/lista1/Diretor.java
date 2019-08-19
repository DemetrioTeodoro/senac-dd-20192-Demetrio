package model.entity.lista1;

import java.util.ArrayList;

public class Diretor extends Empregado {

	private double comissao;

	public Diretor(int id, String nome, String cpf, boolean sexo, int idade, double salarioBruto, Lotacao lotacao,
			double descontosImpostoDeRenda, double contribuicaoPrevidenciaria, double salarioBase, double comissao) {
		super(id, nome, cpf, sexo, idade, salarioBruto, lotacao, descontosImpostoDeRenda, contribuicaoPrevidenciaria,
				salarioBase);
		this.comissao = comissao;
	}

	public Diretor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calSalarioBase(int salarioBruto) {
		double acrescimoDiretor = 0;
		acrescimoDiretor = 85 / salarioBruto;
		return salarioBruto + acrescimoDiretor;
	}

	@Override
	public double calculaSalario() {
		double salario = ((this.getSalarioBase() * 3) + comissao);
		return salario;
	}

}
