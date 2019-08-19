package model.dao.lista1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dao.Banco;
import model.dao.BaseDAO;
import model.entity.lista1.Diretor;
import model.entity.lista1.Diretoria;
import model.entity.lista1.Empregado;
import model.entity.lista1.Gerencias;
import model.entity.lista1.Gerente;
import model.entity.lista1.Operacional;

public class EmpregadoDAO implements BaseDAO<Empregado> {

	public Empregado salvar(Empregado novoEmpregado) {
		Connection conexao = Banco.getConnection();
		String sql = " INSERT INTO EMPREGADO(nome, cpf, sexo, idade, salarioBruto, descontosImpostoRenda, "
				+ "contribuicaoPevidenciaria, salarioBase, idLotacao, cargo) " + " VALUES (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql, PreparedStatement.RETURN_GENERATED_KEYS);
		try {
			stmt.setString(1, novoEmpregado.getNome());
			stmt.setString(2, novoEmpregado.getCpf());
			stmt.setBoolean(3, novoEmpregado.isSexo());
			stmt.setInt(4, novoEmpregado.getIdade());
			stmt.setDouble(5, novoEmpregado.getSalarioBruto());
			stmt.setDouble(6, novoEmpregado.getDescontosImpostoDeRenda());
			stmt.setDouble(7, novoEmpregado.getContribuicaoPrevidenciaria());
			stmt.setDouble(8, novoEmpregado.getSalarioBase());
			if (novoEmpregado instanceof Diretor) {
				Diretor novaDiretoria;
				novaDiretoria = (Diretor) novoEmpregado;
				stmt.setInt(9, novoEmpregado.getLotacao().getId());
			} else if (novoEmpregado instanceof Gerente) {
				Gerente novaGerencia;
				novaGerencia = (Gerente) novoEmpregado;
				stmt.setInt(10, novoEmpregado.getLotacao().getId());
			}
			if (novoEmpregado instanceof Operacional) {
				Operacional novoOperacional;
				novoOperacional = (Operacional) novoEmpregado;
				stmt.setInt(10, novoOperacional.getId());
			} else if (novoEmpregado instanceof Gerente) {
				Gerente novoGerente;
				novoGerente = (Gerente) novoEmpregado;
				stmt.setInt(10, novoGerente.getId());
			} else {
				Diretor novoDiretor;
				novoDiretor = (Diretor) novoEmpregado;
				stmt.setInt(10, novoDiretor.getId());
			}
			stmt.execute();

			ResultSet rs = stmt.getGeneratedKeys();

			if (rs.next()) {
				int idGerado = rs.getInt(1);
				novoEmpregado.setId(idGerado);
			}

//			TelefoneDAO telDAO = new TelefoneDAO();
//			telDAO.ativarTelefones(novoEmpregado, novoEmpregado.getTelefones());
		} catch (SQLException e) {
			System.out.println("Erro ao inserir novo endereço.");
			System.out.println("Erro: " + e.getMessage());
		}

		return novoEmpregado;
	}

	public boolean excluir(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean alterar(Empregado entidade) {
		// TODO Auto-generated method stub
		return false;
	}

	public Empregado consultarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Empregado> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
