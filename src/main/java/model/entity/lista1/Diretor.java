package model.entity.lista1;

import java.util.ArrayList;

public class Diretor extends Empregado {
	
	private String nomeString;
	private ArrayList<Gerente> gerentes;

        public Diretor(String nomeString, ArrayList<Gerente> gerentes, int id, String nome, String cpf, boolean sexo, int idade, double salarioBruto, double descontosImpostoDeRenda, double contribuicaoPrevidenciaria, double salarioBase) {
            super(id, nome, cpf, sexo, idade, salarioBruto, descontosImpostoDeRenda, contribuicaoPrevidenciaria, salarioBase);
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
