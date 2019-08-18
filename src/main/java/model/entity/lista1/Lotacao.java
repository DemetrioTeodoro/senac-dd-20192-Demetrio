package model.entity.lista1;


public abstract class Lotacao {

	private int id;
    private String nome;
    private Empregado responsavel;
	
    public Lotacao(int id, String nome, Empregado responsavel) {
		super();
		this.id = id;
		this.nome = nome;
		this.responsavel = responsavel;
	}

	public Lotacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
