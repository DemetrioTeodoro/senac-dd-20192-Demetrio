package controller.aula05;

import model.entity.aula05.Cliente;
import model.entity.aula05.Endereco;

public class ClienteController {
	
	Cliente cliente = new Cliente();
	
	public String vaidarCampos(String nome, String sobrenome, String cpf, Endereco enderecoTela) {
				
		String msg = "";
		if (nome.isEmpty() || nome.trim().length() < 3) {
			msg += "O nome deve ter mais de três letras.";
		}
		
		if (sobrenome.isEmpty() || sobrenome.trim().length() < 3) {
			msg += "O sobrenome deve ter mais de três letras.";
		}
		
		if (cpf.isEmpty() || cpf.trim().length() < 11) {
			msg += "O cpf não está valido.";
		}
		
		if (enderecoTela == null) {
			msg += "Por favor, selecione um endereço.";
		}
		
		return msg;
	}
	

	public Cliente salvarCliente(Cliente c) {
		return cliente.salvar(c);
		
	}
	
	

}
