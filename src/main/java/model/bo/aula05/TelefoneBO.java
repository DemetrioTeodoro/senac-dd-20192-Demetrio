package model.bo.aula05;

import java.util.ArrayList;

import model.dao.aula05.TelefoneDAO;
import model.entity.aula05.Telefone;

public class TelefoneBO {
	
	private TelefoneDAO telefoneDAO = new TelefoneDAO();
	
	public ArrayList<Telefone> consultarTodos() {
		return telefoneDAO.consultarTodos();
	}

	public ArrayList<Telefone> consultarTodosCliente(int idCliente) {
		return telefoneDAO.consultarTodosPorIdCliente(idCliente);
	}
	
	

}
