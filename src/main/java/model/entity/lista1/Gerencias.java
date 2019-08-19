package model.entity.lista1;

import java.util.ArrayList;

public class Gerencias extends Lotacao {

	private ArrayList<Operacional> operacionais;

	public Gerencias(int id, String nome, Lotacao lotacao, Empregado responsavel, ArrayList<Operacional> operacionais) {
		super(id, nome, lotacao, responsavel);
		this.operacionais = operacionais;
	}

	public ArrayList<Operacional> getOperacionais() {
		return operacionais;
	}

	public void setOperacionais(ArrayList<Operacional> operacionais) {
		this.operacionais = operacionais;
	}

}
