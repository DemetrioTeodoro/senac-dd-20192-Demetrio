package controller.aula05;

import java.util.ArrayList;

import model.dao.aula05.EnderecoDAO;
import model.entity.aula05.Endereco;

public class EnderecoController {

	public ArrayList<Endereco> consultarEnderecos() {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		return enderecoDAO.consultarTodos();
	}

}
