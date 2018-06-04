package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import Contrutores.Acoes;

import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InterfaceJogos extends JFrame {

	private JPanel pnlPrincipal;
	private JTextField txtNomeJogo;
	private JTextField txtFabricante;
	private JTextField txtGenero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceJogos frame = new InterfaceJogos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InterfaceJogos() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (e.getID() == WindowEvent.WINDOW_CLOSING){
					int selectedOption = JOptionPane.showConfirmDialog(null,"Deseja Sair Realmente?", "Sistema informa:", JOptionPane.YES_NO_OPTION);
	if(selectedOption == JOptionPane.YES_OPTION){
		System.exit(0);  	                	
	}	
				}	
			}
		});
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 586);
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlPrincipal);
		this.setLocationRelativeTo(null);
		pnlPrincipal.setLayout(null);
		
		JLabel lblImagemCima = new JLabel("");
		lblImagemCima.setIcon(new ImageIcon(InterfaceJogos.class.getResource("/Imagens/game-banner.png")));
		lblImagemCima.setBounds(0, 0, 654, 183);
		pnlPrincipal.add(lblImagemCima);
		
		JTabbedPane tbpJogos = new JTabbedPane(JTabbedPane.TOP);
		tbpJogos.setBounds(0, 186, 654, 363);
		pnlPrincipal.add(tbpJogos);
		
		JPanel pnlCadastroJogos = new JPanel();
		pnlCadastroJogos.setToolTipText("");
		tbpJogos.addTab("Cadastro Jogo", null, pnlCadastroJogos, null);
		pnlCadastroJogos.setLayout(null);
		
		txtNomeJogo = new JTextField();
		txtNomeJogo.setBounds(10, 11, 181, 37);
		txtNomeJogo.setOpaque(false);
		txtNomeJogo.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Nome", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlCadastroJogos.add(txtNomeJogo);
		txtNomeJogo.setColumns(10);
		
		txtFabricante = new JTextField();
		txtFabricante.setBounds(201, 11, 181, 37);
		txtFabricante.setOpaque(false);
		txtFabricante.setColumns(10);
		txtFabricante.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Fabricante", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlCadastroJogos.add(txtFabricante);

		MaskFormatter mask = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask = new MaskFormatter("##/##/####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
		JFormattedTextField txtDataLancamento = new JFormattedTextField(mask);
		txtDataLancamento.setBounds(34, 59, 120, 37);
		txtDataLancamento.setOpaque(false);
		txtDataLancamento.setHorizontalAlignment(SwingConstants.CENTER);
		txtDataLancamento.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Data Lancamento", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		pnlCadastroJogos.add(txtDataLancamento);
		
		MaskFormatter mask1 = null;
        try {
            // Create a MaskFormatter for accepting phone number, the # symbol accept
            // only a number. We can also set the empty value with a place holder
            // character.
            mask1 = new MaskFormatter("###");
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
		JFormattedTextField txtQuantidade = new JFormattedTextField(mask1);
		txtQuantidade.setBounds(211, 59, 94, 37);
		txtQuantidade.setOpaque(false);
		txtQuantidade.setFocusLostBehavior(JFormattedTextField.COMMIT);
		txtQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuantidade.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Quantidade", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlCadastroJogos.add(txtQuantidade);
		
		JLabel lblImagemDireita = new JLabel("");
		lblImagemDireita.setIcon(new ImageIcon("C:\\Users\\sopar\\eclipse-workspace\\LocadoraGames\\Imagens\\path_of_exile_logo.png"));
		lblImagemDireita.setBounds(391, 11, 248, 313);
		pnlCadastroJogos.add(lblImagemDireita);
		
		JPanel pnlHistoricoJogos = new JPanel();
		tbpJogos.addTab("Historico Jogos", null, pnlHistoricoJogos, null);
		pnlHistoricoJogos.setLayout(null);
		
		JTable modelo = new JTable();
	    JScrollPane barra = new JScrollPane(modelo);
	 
	        Acoes a = new Acoes();
	        
	        modelo.setModel(a.listarJogos());
	        
	        barra.setBounds(5, 5, 690, 380);
	        
	        pnlHistoricoJogos.add(barra);
		
		JButton btnCadastroJogos = new JButton("");
		btnCadastroJogos.setToolTipText("Cadastro");
		btnCadastroJogos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				  Acoes a = new Acoes();
			        
			        String nomeJogo = txtNomeJogo.getText();
			        String fabricante = txtFabricante.getText();
			        String dataLancamento = txtDataLancamento.getText();
			        String quantidadeJogo = txtQuantidade.getText();
			        String genero = txtGenero.getText();
			        a.jogos(nomeJogo, fabricante, quantidadeJogo, genero, dataLancamento);
			        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			        
			        txtNomeJogo.setText("");
			        txtFabricante.setText("");
			        txtDataLancamento.setText("");
			        txtQuantidade.setText("");
			        txtGenero.setText("");
			  
			            modelo.setModel(a.listarJogos());
			}
		});
		btnCadastroJogos.setIcon(new ImageIcon(InterfaceJogos.class.getResource("/Imagens/icons8-mario-8-bit-filled-50.png")));
		btnCadastroJogos.setBounds(102, 185, 162, 89);
		pnlCadastroJogos.add(btnCadastroJogos);
		
		txtGenero = new JTextField();
		txtGenero.setOpaque(false);
		txtGenero.setColumns(10);
		txtGenero.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Genero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtGenero.setBounds(110, 107, 127, 37);
		pnlCadastroJogos.add(txtGenero);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setToolTipText("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InterfacePrincipal().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setIcon(new ImageIcon(InterfaceJogos.class.getResource("/Imagens/icons8-voltar-16.png")));
		btnVoltar.setBounds(137, 285, 89, 23);
		pnlCadastroJogos.add(btnVoltar);
		
		modelo.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int linha = modelo.getSelectedRow();
				String nomeJogo = modelo.getValueAt(linha, 0).toString();
		        String fabricante = modelo.getValueAt(linha, 1).toString();
		        String dataLancamento = modelo.getValueAt(linha, 2).toString();
		        String quantidade = modelo.getValueAt(linha, 3).toString(); 
		        String genero = modelo.getValueAt(linha, 4).toString(); 
		      
				
		       AlterarJogo a = new AlterarJogo(nomeJogo, fabricante, dataLancamento, quantidade, genero);
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
