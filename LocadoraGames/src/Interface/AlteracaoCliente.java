package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Contrutores.Acoes;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Frame;

public class AlteracaoCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtNumeroRes;
	protected int linha;
	
	public AlteracaoCliente(String nomeCliente,
			String enderecoCliente,
			String cpfCliente,
					        String dataNascimento,
					        String cepCliente,
					        String nResidencial,
					        String nCelular,
					        String nEndereco) {
		setTitle("********** Alterac\u00E3o Cliente **********");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		MaskFormatter mask1 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask1 = new MaskFormatter("(##) #### - ####");
            mask1.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    	
		MaskFormatter mask2 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask2 = new MaskFormatter("(##) ##### - ####");
            mask2.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        MaskFormatter mask3 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask3 = new MaskFormatter("###-###-###-##");
            mask3.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		MaskFormatter mask4 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask4 = new MaskFormatter("## / ## / ####");
            mask4.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		MaskFormatter mask5 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask5 = new MaskFormatter("##### / ###");
            mask5.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
		JPanel pnlAlterarCliente = new JPanel();
		pnlAlterarCliente.setBounds(0, 0, 699, 261);
		contentPane.add(pnlAlterarCliente);
		pnlAlterarCliente.setLayout(null);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\sopar\\eclipse-workspace\\LocadoraGames\\Imagens\\cadastro-clientes.png"));
		lblImagem.setBounds(465, 0, 225, 262);
		pnlAlterarCliente.add(lblImagem);
		
		txtNome = new JTextField(nomeCliente);
		txtNome.setOpaque(false);
		txtNome.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtNome.setColumns(10);
		txtNome.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Nome", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtNome.setBounds(10, 0, 215, 50);		
		pnlAlterarCliente.add(txtNome);
		
		JFormattedTextField txtCpf = new JFormattedTextField(mask3);
		
		txtCpf.setOpaque(false);
		txtCpf.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtCpf.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "CPF", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtCpf.setBounds(235, 0, 101, 50);
		pnlAlterarCliente.add(txtCpf);
		
		JFormattedTextField txtDataNascimento = new JFormattedTextField(mask4);
		txtDataNascimento.setOpaque(false);
		txtDataNascimento.setHorizontalAlignment(SwingConstants.CENTER);
		txtDataNascimento.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtDataNascimento.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Data Nascimento", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtDataNascimento.setBounds(346, 0, 120, 50);
		
		pnlAlterarCliente.add(txtDataNascimento);
		
		txtEndereco = new JTextField();
		txtEndereco.setOpaque(false);
		txtEndereco.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtEndereco.setColumns(10);
		txtEndereco.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Endereco", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtEndereco.setBounds(10, 61, 215, 50);
		
		pnlAlterarCliente.add(txtEndereco);
		
		
		
		txtNumeroRes = new JTextField();
		txtNumeroRes.setOpaque(false);
		txtNumeroRes.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtNumeroRes.setColumns(10);
		txtNumeroRes.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "N\u00BA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtNumeroRes.setBounds(245, 61, 88, 50);
		
		pnlAlterarCliente.add(txtNumeroRes);
		
		JFormattedTextField txtCep = new JFormattedTextField(mask5);
		txtCep.setOpaque(false);
		txtCep.setHorizontalAlignment(SwingConstants.CENTER);
		txtCep.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtCep.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "CEP", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtCep.setBounds(346, 61, 120, 50);		
		pnlAlterarCliente.add(txtCep);
        
		JFormattedTextField txtNumeroResidencial = new JFormattedTextField(mask1);
		txtNumeroResidencial.setOpaque(false);
		txtNumeroResidencial.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeroResidencial.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtNumeroResidencial.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Telefone Residencial", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtNumeroResidencial.setBounds(10, 122, 146, 50);
		pnlAlterarCliente.add(txtNumeroResidencial);
	
		JFormattedTextField txtCelular = new JFormattedTextField(mask2);
		txtCelular.setOpaque(false);
		txtCelular.setHorizontalAlignment(SwingConstants.CENTER);
		txtCelular.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtCelular.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Celular", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtCelular.setBounds(166, 122, 146, 50);
		pnlAlterarCliente.add(txtCelular);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setIcon(new ImageIcon(AlteracaoCliente.class.getResource("/Imagens/icons8-alterar-24.png")));

		btnAlterar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, Color.BLACK, Color.BLACK));
		btnAlterar.setBounds(322, 122, 131, 53);
		pnlAlterarCliente.add(btnAlterar);
		
		
		

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new InterfaceClientes().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setIcon(new ImageIcon(AlteracaoCliente.class.getResource("/Imagens/icons8-voltar-16.png")));
		btnVoltar.setBounds(350, 227, 89, 23);
		pnlAlterarCliente.add(btnVoltar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon(AlteracaoCliente.class.getResource("/Imagens/icons8-delete-16.png")));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Acoes a = new Acoes();
			a.excluiCliente(linha);
			JOptionPane.showMessageDialog(null, "Excluido!");
			
			}
			
		});
		btnExcluir.setBounds(350, 186, 89, 30);
		pnlAlterarCliente.add(btnExcluir);
		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Acoes a = new Acoes();

		        String nomeCliente = txtNome.getText();
		        String cpfCliente = txtCpf.getText();
		        String dataNascimento = txtDataNascimento.getText();	
		        String enderecoCliente = txtEndereco.getText();
		        String nEndereco = txtNumeroRes.getText();	  	        
		        String cepCliente = txtCep.getText();
		        String nResidencial = txtNumeroResidencial.getText();
		        String nCelular = txtCelular.getText();
		        
		       a.alterarCliente(nomeCliente, cpfCliente, dataNascimento, enderecoCliente, nEndereco, cepCliente, nResidencial, nCelular, linha);
		        JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
		        
		        InterfaceClientes i = new InterfaceClientes();
		        
			}
		});
	}

}
