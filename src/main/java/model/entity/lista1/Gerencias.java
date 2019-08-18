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
    
    private ArrayList<Operacional> operacional;

    public Gerencias(ArrayList<Operacional> operacional, String nome, Empregado responsavel) {
        super(nome, responsavel);
        this.operacional = operacional;
    }

    
    
    
    
}
