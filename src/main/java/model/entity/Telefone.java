package model.entity;

public class Telefone {
	int id;
	int idCliente;
	String codigoPais;
	String ddd;
	String numero;
	String tipo;
	boolean ativo;
	public Telefone(int id, int idCliente, String codigoPais, String ddd, String numero, String tipo, boolean ativo) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.codigoPais = codigoPais;
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
		this.ativo = ativo;
	}
	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", idCliente=" + idCliente + ", codigoPais=" + codigoPais + ", ddd=" + ddd
				+ ", numero=" + numero + ", tipo=" + tipo + ", ativo=" + ativo + "]";
	}
	

}
