package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import Contrutores.Acoes;

import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarJogo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtFabricante;
	private JTextField txtGenero;
	protected int linha;

	public AlterarJogo(String nomeJogo,String fabricante,String dataLancamento,String quantidade,String genero) {
		setTitle("***************  ALTERAR JOGO ***************");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 649, 307);
		panel.setLayout(null);
		panel.setToolTipText("");
		contentPane.add(panel);
		
		txtNome = new JTextField(nomeJogo);
		txtNome.setOpaque(false);
		txtNome.setColumns(10);
		txtNome.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Nome", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtNome.setBounds(10, 11, 181, 37);
		panel.add(txtNome);
		
		txtFabricante = new JTextField(fabricante);
		txtFabricante.setOpaque(false);
		txtFabricante.setColumns(10);
		txtFabricante.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Fabricante", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtFabricante.setBounds(201, 11, 181, 37);
		panel.add(txtFabricante);
		
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
		txtDataLancamento.setOpaque(false);
		txtDataLancamento.setHorizontalAlignment(SwingConstants.CENTER);
		txtDataLancamento.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Data Lancamento", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		txtDataLancamento.setBounds(34, 59, 120, 37);
		txtDataLancamento.setText(dataLancamento);
		panel.add(txtDataLancamento);
		
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
		txtQuantidade.setOpaque(false);
		txtQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuantidade.setFocusLostBehavior(JFormattedTextField.COMMIT);
		txtQuantidade.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Quantidade", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtQuantidade.setBounds(211, 59, 94, 37);
		panel.add(txtQuantidade);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\sopar\\eclipse-workspace\\LocadoraGames\\Imagens\\path_of_exile_logo.png"));
		label.setBounds(391, 11, 248, 313);
		panel.add(label);
		
		JButton btnAlterarJogo = new JButton("Alterar");
		btnAlterarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acoes a = new Acoes();
				
				String nomeJogo = txtNome.getText();
				String fabricante = txtFabricante.getText();
				String dataLancamento = txtDataLancamento.getText();
				String quantidade = txtQuantidade.getText();
				String genero = txtGenero.getText();
				
				a.alterarJogo(nomeJogo, fabricante, dataLancamento, quantidade, genero, linha);
				JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
		        
			       InterfaceJogos i = new InterfaceJogos();
				
			}
		});
		btnAlterarJogo.setIcon(new ImageIcon(AlterarJogo.class.getResource("/Imagens/icons8-alterar-24.png")));
		btnAlterarJogo.setBounds(95, 155, 162, 49);
		panel.add(btnAlterarJogo);
		
		txtGenero = new JTextField(genero);
		txtGenero.setOpaque(false);
		txtGenero.setColumns(10);
		txtGenero.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 0, 0), new Color(0, 0, 0)), "Genero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		txtGenero.setBounds(110, 107, 127, 37);
		panel.add(txtGenero);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Acoes a = new Acoes();
				a.excluirJogo(linha);
				JOptionPane.showMessageDialog(null, "Excluido!");
				
			}
		});
		btnExcluir.setIcon(new ImageIcon(AlterarJogo.class.getResource("/Imagens/icons8-delete-16.png")));
		btnExcluir.setBounds(131, 215, 106, 30);
		panel.add(btnExcluir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InterfaceJogos().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setIcon(new ImageIcon(AlterarJogo.class.getResource("/Imagens/icons8-voltar-16.png")));
		btnVoltar.setBounds(141, 256, 89, 23);
		panel.add(btnVoltar);
	}

}
