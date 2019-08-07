package model.entity;

import java.util.ArrayList;

public class Executavel {

	public static void main(String[] args) {
		
		Endereco e1 = new Endereco(1,"Rua das flores","88080500","sc","floripa","101A","serra");
		Endereco e2 = new Endereco(2,"Rua das flores jones","88080750","sc","floripa","12B","tapera");
		Endereco e3 = new Endereco(3,"Rua das flores secas","88080450","sc","floripa","104C","sul");
		Endereco e4 = new Endereco(4,"Rua das flores bonitas","880808960","sc","floripa","10F","palhoça");
		Endereco e5 = new Endereco(5,"Rua das motos","88080852","sc","floripa","1G","norte");
		
		Telefone t1 = new Telefone(1,1,"55","48","130","999995421",true);
		Telefone t2 = new Telefone(2,2,"55","47","139","999895421",true);
		Telefone t3 = new Telefone(3,3,"55","45","137","997895421",true);
		Telefone t4 = new Telefone(4,4,"55","40","136","997895422",true);
		Telefone t5 = new Telefone(5,5,"55","44","138","997896421",true);
		
		ArrayList<Telefone> telefones = new ArrayList();
		
		telefones.add(t1);
		telefones.add(t2);
		telefones.add(t3);
		telefones.add(t4);
		telefones.add(t5);
		
		Cliente c1 = new Cliente("Demetrio","Teodoro","123456789",telefones,e1);
		Cliente c2 = new Cliente("Jose","Rutt","123456789",telefones,e2);
		Cliente c3 = new Cliente("Creuza","Russ","123456789",telefones,e3);
		Cliente c4 = new Cliente("Augusto","Costa","123456789",telefones,e4);
		Cliente c5 = new Cliente("Mika","Silva","123456789",telefones,e5);
		
		ArrayList<Cliente> clientes = new ArrayList();
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);
		clientes.add(c5);
		
		for (Cliente c : clientes) {
			System.out.println("Clientes:"+c);
		}
		
	}

}
