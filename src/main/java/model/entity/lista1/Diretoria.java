package model.entity.lista1;

import java.util.ArrayList;


public class Diretoria extends Lotacao {
    
    private String sigla;
    private ArrayList<Gerencias> gerencias;

	public Diretoria(int id, String nome, Empregado responsavel, String sigla, ArrayList<Gerencias> gerencias) {
		super(id, nome, responsavel);
		this.sigla = sigla;
		this.gerencias = gerencias;
	}

	public Object getGerencias() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setGerencias(ArrayList<Gerencias> gerencias) {
		this.gerencias = gerencias;
	}

        
    
}
