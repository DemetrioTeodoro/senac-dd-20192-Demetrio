package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.entity.Endereco;

public class EnderecoDAO implements BaseDAO<Endereco> {

	public Endereco salvar(Endereco novoEndereco) {
		Connection conexao = Banco.getConnection();
		String sql = " INSERT INTO ENDERECO(ID, RUA, CEP, ESTADO, CIDADE, BAIRRO, NUMERO) " + " VALUES (?,?,?,?,?,?,?)";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql, PreparedStatement.RETURN_GENERATED_KEYS);
		try {
			stmt.setInt(1, novoEndereco.getId());
			stmt.setString(2, novoEndereco.getRua());
			stmt.setString(3, novoEndereco.getCep());
			stmt.setString(4, novoEndereco.getEstado());
			stmt.setString(5, novoEndereco.getCidade());
			stmt.setString(6, novoEndereco.getBairro());
			stmt.setString(7, novoEndereco.getNumero());

			stmt.execute();

			ResultSet rs = stmt.getGeneratedKeys();

			if (rs.next()) {
				int idGerado = rs.getInt(1);
				novoEndereco.setId(idGerado);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao inserir novo endereço.");
			System.out.println("Erro: " + e.getMessage());
		}

		return novoEndereco;
	}

	public boolean excluir(int id) {
		Connection conexao = Banco.getConnection();
		String sql = " DELETE FROM ENDERECO WHERE (ID=)" + id;
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql, PreparedStatement.RETURN_GENERATED_KEYS);
		int quantidadeLinhaAfetadas = 0;
		try {
			quantidadeLinhaAfetadas = stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao deletar novo endereço.");
			System.out.println("Erro: " + e.getMessage());
		}

		return quantidadeLinhaAfetadas > 0;
	}

	public boolean alterar(Endereco entidade) {
		Connection conn = Banco.getConnection();
		String sql = " UPDATE ENDERECO " + " SET ID=?, RUA=?, CEP=?, ESTADO=?, CIDADE=?, BAIRRO=?, NUMERO=? "
				+ " WHERE ID=? ";

		PreparedStatement stmt = Banco.getPreparedStatement(conn, sql);
		int quantidadeLinhasAfetadas = 0;

		try {
			stmt.setInt(1, entidade.getId());
			stmt.setString(2, entidade.getRua());
			stmt.setString(3, entidade.getCep());
			stmt.setString(4, entidade.getEstado());
			stmt.setString(5, entidade.getCidade());
			stmt.setString(6, entidade.getBairro());
			stmt.setString(7, entidade.getNumero());
			quantidadeLinhasAfetadas = stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao alterar endereço.");
			System.out.println("Erro: " + e.getMessage());
		}

		return quantidadeLinhasAfetadas > 0;
	}

	public Endereco consultarPorId(int id) {
		Connection conn = Banco.getConnection();
		String sql = " SELECT ID, RUA, CEP, ESTADO, CIDADE, BAIRRO, NUMERO " + " FROM ENDERECO " + " WHERE ID=" + id;

		Statement stmt = Banco.getStatement(conn);

		Endereco endereco = null;
		try {
			ResultSet resultadoDaConsulta = stmt.executeQuery(sql);

			if (resultadoDaConsulta.next()) {
				endereco = construirEnderecoDoResultSet(resultadoDaConsulta);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao consultar endereço por id = " + id);
			System.out.println("Erro: " + e.getMessage());
		}

		return endereco;
	}

	public ArrayList<Endereco> consultarTodos() {
		Connection conn = Banco.getConnection();
		String sql = " SELECT ID, RUA, CEP, ESTADO, CIDADE, BAIRRO, NUMERO " + " FROM ENDERECO ";

		Statement stmt = Banco.getStatement(conn);
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		try {
			ResultSet resultadoDaConsulta = stmt.executeQuery(sql);

			while (resultadoDaConsulta.next()) {
				Endereco endereco = construirEnderecoDoResultSet(resultadoDaConsulta);
				enderecos.add(endereco);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao consultar endereços");
			System.out.println("Erro: " + e.getMessage());
		}

		return enderecos;
	}

	private Endereco construirEnderecoDoResultSet(ResultSet resultadoDaConsulta) {
		Endereco endereco;
		endereco = new Endereco();
		try {
			endereco.setId(resultadoDaConsulta.getInt("id"));
			endereco.setRua(resultadoDaConsulta.getString("rua"));
			endereco.setCep(resultadoDaConsulta.getString("cep"));
			endereco.setEstado(resultadoDaConsulta.getString("estado"));
			endereco.setCidade(resultadoDaConsulta.getString("cidade"));
			endereco.setNumero(resultadoDaConsulta.getString("numero"));
			endereco.setBairro(resultadoDaConsulta.getString("bairro"));
		} catch (SQLException e) {
			System.out.println("Erro ao construir telefone a partir do ResultSet");
			System.out.println("Erro: " + e.getMessage());
		}

		return endereco;
	}
}