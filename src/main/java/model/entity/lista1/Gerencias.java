/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.lista1;

import java.util.ArrayList;

/**
 *
 * @author TiagoSuzanMiguel
 */
public class Gerencias extends Lotacao {
    
    private ArrayList<Operacional> operacionais;

	public Gerencias(String nome, Empregado responsavel, ArrayList<Operacional> operacionais) {
		super(nome, responsavel);
		this.operacionais = operacionais;
	}

    
    
    
    
    
}
