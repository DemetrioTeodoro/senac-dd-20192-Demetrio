package model.entity.lista1;

import java.util.ArrayList;

public class Gerente extends Empregado {

	private double comissao;

	public Gerente(int id, String nome, String cpf, boolean sexo, int idade, double salarioBruto, Lotacao lotacao,
			double descontosImpostoDeRenda, double contribuicaoPrevidenciaria, double salarioBase, double comissao) {
		super(id, nome, cpf, sexo, idade, salarioBruto, lotacao, descontosImpostoDeRenda, contribuicaoPrevidenciaria,
				salarioBase);
		this.comissao = comissao;
	}

	public double calSalarioBase(int salarioBruto) {
		double acrescimoGerente = 0;
		acrescimoGerente = 90 / salarioBruto;
		return salarioBruto + acrescimoGerente;
	}

	@Override
	public double calculaSalario() {
		double salario = (this.getSalarioBase() * (0.90) + comissao);
		return salario;
	}

}
