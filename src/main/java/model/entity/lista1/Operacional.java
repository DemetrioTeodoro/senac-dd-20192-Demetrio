package model.entity.lista1;

public class Operacional extends Empregado {

        public Operacional(int id, String nome, String cpf, boolean sexo, int idade, double salarioBruto, double descontosImpostoDeRenda, double contribuicaoPrevidenciaria, double salarioBase) {
            super(id, nome, cpf, sexo, idade, salarioBruto, descontosImpostoDeRenda, contribuicaoPrevidenciaria, salarioBase);
        }

	public double calSalarioBase(int salarioBruto) {
		double acrescimoOperacional = 0;
		acrescimoOperacional = 85/salarioBruto;
		return salarioBruto + acrescimoOperacional; 
	}

	@Override
	public double calculaSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
