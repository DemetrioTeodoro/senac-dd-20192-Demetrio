package model.entity.lista1;

import java.util.ArrayList;

public class Gerente extends Empregado {

        private double comissao;

        public Gerente(double comissao, int id, String nome, String cpf, boolean sexo, int idade, double salarioBruto, double descontosImpostoDeRenda, double contribuicaoPrevidenciaria, double salarioBase) {
            super(id, nome, cpf, sexo, idade, salarioBruto, descontosImpostoDeRenda, contribuicaoPrevidenciaria, salarioBase);
            this.comissao = comissao;
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
