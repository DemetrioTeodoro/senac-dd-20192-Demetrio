package model.dao.lista1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dao.Banco;
import model.dao.BaseDAO;
import model.entity.lista1.Diretoria;
import model.entity.lista1.Gerencias;
import model.entity.lista1.Lotacao;

public class LotacaoDAO implements BaseDAO<Lotacao> {

	public Lotacao salvar(Lotacao novaLotacao) {
		Connection conexao = Banco.getConnection();
		String sql = " INSERT INTO LOCACAO(nome, sigla, idlotacao, idfuncionario_responsavel) " + " VALUES (?,?,?,?)";
		PreparedStatement stmt = Banco.getPreparedStatement(conexao, sql, PreparedStatement.RETURN_GENERATED_KEYS);
		try {
			stmt.setString(1, novaLotacao.getNome());
			if (novaLotacao instanceof Diretoria) {
				Diretoria novaDiretoria;
				stmt.setString(2, ((Diretoria) novaLotacao).getSigla());
			}
			if (novaLotacao instanceof Diretoria) {
				Diretoria novaDiretoria;
				novaDiretoria = (Diretoria) novaLotacao;
				stmt.setInt(3, novaLotacao.getLotacao().getId());
			} else if (novaLotacao instanceof Gerencias) {
				Gerencias novaGerencia;
				novaGerencia = (Gerencias) novaLotacao;
				stmt.setInt(3, novaLotacao.getLotacao().getId());
			}
			stmt.setInt(4, novaLotacao.getResponsavel().getId());
			stmt.execute();

			ResultSet rs = stmt.getGeneratedKeys();

			if (rs.next()) {
				int idGerado = rs.getInt(1);
				novaLotacao.setId(idGerado);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao inserir novo endereço.");
			System.out.println("Erro: " + e.getMessage());
		}

		return novaLotacao;
	}

	public boolean excluir(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean alterar(Lotacao entidade) {
		// TODO Auto-generated method stub
		return false;
	}

	public Lotacao consultarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Lotacao> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
