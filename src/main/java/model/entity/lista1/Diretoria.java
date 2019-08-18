package model.entity.lista1;

import java.util.ArrayList;


public class Diretoria extends Lotacao {
    
    private String sigla;
    private ArrayList<Gerencias> gerencias;

    public Diretoria(String sigla, ArrayList<Gerencias> gerencias, String nome, Empregado responsavel) {
        super(nome, responsavel);
        this.sigla = sigla;
        this.gerencias = gerencias;
    }

    

    

    

    

    
    
    
    
}
