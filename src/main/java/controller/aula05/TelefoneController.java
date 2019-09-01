package controller.aula05;

import java.util.ArrayList;

import model.bo.aula05.TelefoneBO;
import model.entity.aula05.Telefone;

public class TelefoneController {
	
	public static final String TIPO_TELEFONE_MOVEL = "Móvel";
	public static final String TIPO_TELEFONE_FIXO = "Fixo";
	
	private TelefoneBO tel = new TelefoneBO();
	
	public ArrayList<Telefone> consultarTodosTelefones() {
		return tel.consultarTodos();
	}

	public ArrayList<Telefone> consultarTelefones(int idCliente) {
		return tel.consultarTodosCliente(idCliente);
	}
	
	

}
