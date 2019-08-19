package model.entity;

import java.util.ArrayList;

public class Cliente {

	String nome;
	String Sobrenome;
	String cpf;
	ArrayList<Telefone> telefone;
	Endereco endereco;

	public Cliente(String nome, String sobrenome, String cpf, ArrayList<Telefone> telefone, Endereco endereco) {
		super();
		this.nome = nome;
		Sobrenome = sobrenome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(ArrayList<Telefone> telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "[Nome=" + nome + ", Sobrenome=" + Sobrenome + ", Cpf=" + cpf + ", Telefone=" + telefone + ", Endereco="
				+ endereco + "]";
	}

	public void nomeCompleto(String nome) {
		if (nome.equalsIgnoreCase(this.getNome())) {
			System.out.println(this.getNome() + this.getSobrenome());
		}

	}

}
