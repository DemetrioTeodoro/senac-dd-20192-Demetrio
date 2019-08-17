package model.entity.lista1;

public class Operacional extends Empregado {

	


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
