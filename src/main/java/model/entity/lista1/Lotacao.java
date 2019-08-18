package model.entity.lista1;


public abstract class Lotacao {

    private String nome;
    private Empregado responsavel;

    public Lotacao(String nome, Empregado responsavel) {
        this.nome = nome;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empregado getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Empregado responsavel) {
        this.responsavel = responsavel;
    }

    
    
    
    
    
    
}
