package view.aula05;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.aula05.ClienteController;
import controller.aula05.EnderecoController;
import controller.aula05.TelefoneController;
import model.entity.aula05.Cliente;
import model.entity.aula05.Endereco;
import model.entity.aula05.Telefone;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextnome;
	private JTextField textCPF;
	private JTextField textSobrenome;
	private JTextField textNumero;
	private JTextField textCodPais;
	private JTextField textDDD;
	private JTable tblTelefone;
	private JComboBox cbEndereco;
	private String[] nomeCampos = {"Pais","DDD","Numero","Tipo"};
	private Cliente cliente = new Cliente();
	private Cliente novoCliente = null;
	private JButton btnAdicionarTelefone;
	private ArrayList<Endereco> enderecos;
	private ArrayList<Telefone> telefonesNovos;
	private String[] tipos = {TelefoneController.TIPO_TELEFONE_FIXO, TelefoneController.TIPO_TELEFONE_MOVEL};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroCliente() {
		setTitle("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 13, 56, 16);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(12, 42, 56, 16);
		contentPane.add(lblCpf);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(194, 13, 77, 16);
		contentPane.add(lblSobrenome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(194, 42, 64, 16);
		contentPane.add(lblEndereo);
		
		txtTextnome = new JTextField();
		txtTextnome.setBounds(52, 13, 116, 22);
		contentPane.add(txtTextnome);
		txtTextnome.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(52, 42, 116, 22);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(271, 13, 116, 22);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);
		
		consultarEndereco();
		cbEndereco = new JComboBox(enderecos.toArray());
		cbEndereco.setBounds(270, 39, 117, 22);
		cbEndereco.setSelectedIndex(-1);
		contentPane.add(cbEndereco);
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClienteController clienteController = new ClienteController();
				String nome = txtTextnome.getText();
				String sobrenome = textSobrenome.getText();
				String cpf = textCPF.getText();
				Endereco enderecoTela = (Endereco) cbEndereco.getSelectedItem();
				String sucessocadastro = "Cliente cadastrado com sucesso!";
				String msg = clienteController.vaidarCampos(nome, sobrenome, cpf, enderecoTela);
					
				if (msg.isEmpty()) {
					novoCliente = new Cliente(nome, sobrenome, cpf,new ArrayList<Telefone>(), enderecoTela);
					novoCliente = clienteController.salvarCliente(novoCliente);
					
					if (novoCliente.getId() > 0) {
						btnAdicionarTelefone.setEnabled(true);
					}
				} else {
					JOptionPane.showInternalMessageDialog(null, msg, "Erros acontecem!", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		btnSalvar.setBounds(175, 79, 97, 25);
		contentPane.add(btnSalvar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 117, 359, 2);
		contentPane.add(separator);
		
		JLabel lblNovoTelefone = new JLabel("Novo telefone:");
		lblNovoTelefone.setBounds(12, 121, 90, 16);
		contentPane.add(lblNovoTelefone);
		
		JLabel lblCdPas = new JLabel("C\u00F3d. Pa\u00EDs:");
		lblCdPas.setBounds(22, 150, 67, 16);
		contentPane.add(lblCdPas);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(46, 182, 56, 16);
		contentPane.add(lblTipo);
		
		JLabel lblDDD = new JLabel("DDD:");
		lblDDD.setBounds(142, 150, 64, 16);
		contentPane.add(lblDDD);
		
		JLabel lblN = new JLabel("N\u00B0:");
		lblN.setBounds(248, 150, 56, 16);
		contentPane.add(lblN);
		
		textNumero = new JTextField();
		textNumero.setBounds(271, 147, 116, 22);
		contentPane.add(textNumero);
		textNumero.setColumns(10);
		
		textCodPais = new JTextField();
		textCodPais.setBounds(90, 147, 48, 22);
		contentPane.add(textCodPais);
		textCodPais.setColumns(10);
		
		textDDD = new JTextField();
		textDDD.setBounds(175, 147, 56, 22);
		contentPane.add(textDDD);
		textDDD.setColumns(10);
		
		JComboBox cbTipo = new JComboBox(tipos);
		cbTipo.setBounds(82, 179, 56, 22);
		cbTipo.setSelectedIndex(-1);
		contentPane.add(cbTipo);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 211, 359, 2);
		contentPane.add(separator_1);
		
		btnAdicionarTelefone = new JButton("Adicionar Telefone");
		btnAdicionarTelefone.setEnabled(false);
		btnAdicionarTelefone.setBounds(207, 178, 139, 25);
		contentPane.add(btnAdicionarTelefone);
		
		JLabel lblTelefones = new JLabel("Telefones:");
		lblTelefones.setBounds(12, 226, 64, 16);
		contentPane.add(lblTelefones);
		
		tblTelefone = new JTable();
		tblTelefone.setBounds(27, 251, 372, 119);
		contentPane.add(tblTelefone);
		
	}

	private void consultarEndereco() {
		EnderecoController enderecoController = new EnderecoController();
		enderecos = enderecoController.consultarEnderecos();
	}
	
	protected void atualizarListaTelefones() {
		TelefoneController telefoneController = new TelefoneController();
		
		if (cliente != null && cliente.getId() > 0) {
			telefonesNovos = telefoneController.consultarTelefones(cliente.getId());
		}
		
		limparCampos();
		
		DefaultTableModel model = (DefaultTableModel) tblTelefone.getModel();
		for (Telefone telefone : telefonesNovos) {
			String[] linhas = new String[5];
			linhas[0] = telefone.getCodigoPais();
			linhas[1] = telefone.getDdd();
			linhas[2] = telefone.getNumero();
			linhas[3] = telefone.getTipoLinha();
			model.addRow(linhas);
		}
	}

	private void limparCampos() {
		tblTelefone.setModel(new DefaultTableModel(
				new Object[][] {nomeCampos,},nomeCampos));
	}
}
