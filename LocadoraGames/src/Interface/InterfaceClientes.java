package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.Icon;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import Contrutores.Acoes;

import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.border.BevelBorder;
import java.awt.Font;

import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class InterfaceClientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtnResidencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceClientes frame = new InterfaceClientes();
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
	
	public InterfaceClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblImagemCliente = new JLabel("");
		lblImagemCliente.setIcon(new ImageIcon(InterfaceClientes.class.getResource("/Imagens/game-banner.png")));
		lblImagemCliente.setBounds(0, 0, 685, 152);
		contentPane.add(lblImagemCliente);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 154, 685, 301);
		contentPane.add(tabbedPane);
		
		
		 MaskFormatter mask = null;
	        try {
	            // Create a MaskFormatter for accepting phone number, the # symbol accept
	            // only a number. We can also set the empty value with a place holder
	            // character.
	            mask = new MaskFormatter("###-###-###-##");
	            mask.setPlaceholderCharacter('_');
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		
		
		JPanel pnlCadastroCliente = new JPanel();
		pnlCadastroCliente.setToolTipText("");
		tabbedPane.addTab("Cadastro Cliente", null, pnlCadastroCliente, null);
		pnlCadastroCliente.setLayout(null);
		
		JFormattedTextField txtCPF = new JFormattedTextField(mask);
		txtCPF.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtCPF.setOpaque(false);
		txtCPF.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "CPF", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtCPF.setBounds(225, 0, 101, 50);
		pnlCadastroCliente.add(txtCPF);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtNome.setOpaque(false);
		txtNome.setBounds(0, 0, 215, 50);
		txtNome.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Nome", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlCadastroCliente.add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setOpaque(false);
		txtEndereco.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtEndereco.setColumns(10);
		txtEndereco.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Endereco", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtEndereco.setBounds(0, 61, 215, 50);
		pnlCadastroCliente.add(txtEndereco);
		
		MaskFormatter mask1 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask1 = new MaskFormatter("## / ## / ####");
            mask1.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
	
		JFormattedTextField txtDataNascimento = new JFormattedTextField(mask1);
		txtDataNascimento.setHorizontalAlignment(SwingConstants.CENTER);
	
		txtDataNascimento.setOpaque(false);
		txtDataNascimento.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtDataNascimento.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Data Nascimento", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtDataNascimento.setBounds(336, 0, 120, 50);
		pnlCadastroCliente.add(txtDataNascimento);
		
		MaskFormatter mask2 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask2 = new MaskFormatter("##### / ###");
            mask2.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		JFormattedTextField txtCep = new JFormattedTextField(mask2);
		txtCep.setOpaque(false);
		txtCep.setHorizontalAlignment(SwingConstants.CENTER);
		txtCep.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtCep.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "CEP", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtCep.setBounds(336, 61, 120, 50);
		pnlCadastroCliente.add(txtCep);
		
		txtnResidencia = new JTextField();
		txtnResidencia.setOpaque(false);
		txtnResidencia.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtnResidencia.setColumns(10);
		txtnResidencia.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "N\u00BA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtnResidencia.setBounds(235, 61, 88, 50);
		pnlCadastroCliente.add(txtnResidencia);
		
		MaskFormatter mask3 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask3 = new MaskFormatter("(##) #### - ####");
            mask3.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
		JFormattedTextField txtNumeroResidencial = new JFormattedTextField(mask3);
		txtNumeroResidencial.setOpaque(false);
		txtNumeroResidencial.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumeroResidencial.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtNumeroResidencial.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Telefone Residencial", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtNumeroResidencial.setBounds(0, 122, 146, 50);
		pnlCadastroCliente.add(txtNumeroResidencial);
		
		MaskFormatter mask4 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask4 = new MaskFormatter("(##) ##### - ####");
            mask4.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
		JFormattedTextField txtCelular = new JFormattedTextField(mask4);
		txtCelular.setOpaque(false);
		txtCelular.setHorizontalAlignment(SwingConstants.CENTER);
		txtCelular.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtCelular.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Celular", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtCelular.setBounds(156, 122, 146, 50);
		pnlCadastroCliente.add(txtCelular);
		
		
		JTable modelo = new JTable();
        JScrollPane barra = new JScrollPane(modelo);
 
        Acoes a = new Acoes();
        
        modelo.setModel(a.listarClientes());
        
        barra.setBounds(5, 5, 675, 257);
        
        
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Acoes a = new Acoes();

		        String nomeCliente = txtNome.getText();
		        String enderecoCliente = txtEndereco.getText();
		        String cpfCliente = txtCPF.getText();
		        String dataNascimento = txtDataNascimento.getText();
		        String cepCliente = txtCep.getText();
		        String nResidencial = txtNumeroResidencial.getText();
		        String nCelular = txtCelular.getText();
		        String nEndereco = txtEndereco.getText();
		        a.clientes(nomeCliente, enderecoCliente, cpfCliente, dataNascimento, cepCliente, nResidencial, nCelular, nEndereco);
		        JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
		        modelo.setModel(a.listarClientes());
		        txtNome.setText("");
		       txtEndereco.setText("");
		       txtCPF.setText("");
		       txtDataNascimento.setText("");
		        txtCep.setText("");
		        txtCelular.setText("");
		        txtNumeroResidencial.setText("");
		        txtEndereco.setText("");
		        txtNome.requestFocus();
			}
		});
		btnCadastro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, Color.BLACK, Color.BLACK));
		btnCadastro.setIcon(new ImageIcon(InterfaceClientes.class.getResource("/Imagens/icons8-adicionar-usu\u00E1rio-masculino-26.png")));
		btnCadastro.setBounds(237, 183, 156, 44);
		pnlCadastroCliente.add(btnCadastro);
		
		JLabel lblImagemDireita = new JLabel("");
		lblImagemDireita.setIcon(new ImageIcon("C:\\Users\\sopar\\eclipse-workspace\\LocadoraGames\\Imagens\\cadastro-clientes.png"));
		lblImagemDireita.setBounds(455, 0, 225, 262);
		pnlCadastroCliente.add(lblImagemDireita);
		
		JPanel pnlHistoricoCliente = new JPanel();
		tabbedPane.addTab("Historico Cliente", (Icon) null, pnlHistoricoCliente, null);
		pnlHistoricoCliente.setLayout(null);
		pnlHistoricoCliente.add(barra);
		
		modelo.addMouseListener(new MouseListener() {
		
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				int linha = modelo.getSelectedRow();
				String nomeCliente = modelo.getValueAt(linha, 0).toString();;
		        String enderecoCliente = modelo.getValueAt(linha, 1).toString();
		        String cpfCliente = modelo.getValueAt(linha, 2).toString();;
		        String dataNascimento = modelo.getValueAt(linha, 3).toString(); ;
		        String cepCliente = modelo.getValueAt(linha, 4).toString(); ;
		        String nResidencial = modelo.getValueAt(linha, 5).toString();;
		        String nCelular = modelo.getValueAt(linha, 6).toString();;
		        String nEndereco = modelo.getValueAt(linha, 7).toString();;
				
		        
		        AlteracaoCliente a = new AlteracaoCliente(nomeCliente, enderecoCliente, cpfCliente, dataNascimento, cepCliente, nResidencial, nCelular, nEndereco);
				
		        a.setVisible(true);
		        		dispose();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
