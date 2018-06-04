package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Contrutores.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceLogin frame = new InterfaceLogin();
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
	public InterfaceLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setBounds(150, 105, 145, 33);
		contentPane.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);
		Login l = new Login();
		JButton btnLogar = new JButton("");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeUsuario = txtNomeUsuario.getText();
				String senhaUsuario = String.valueOf(txtSenha.getPassword());
				
				
				
				boolean valida = l.validarLogin(nomeUsuario, senhaUsuario);
				
				
				if(valida == true) {
					JOptionPane.showMessageDialog(null, "Logado Com Sucesso!");
					int nivel = l.retornarNivel();
					InterfacePrincipal fp = new InterfacePrincipal();
					fp.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
				}
			}
		});
		btnLogar.setToolTipText("Login");
		btnLogar.setBackground(new Color(102, 51, 153));
		btnLogar.setOpaque(false);
		btnLogar.setIcon(new ImageIcon("C:\\Users\\sopar\\eclipse-workspace\\LocadoraGames\\Imagens\\icons8-enter-26.png"));
		btnLogar.setBounds(178, 218, 89, 38);
		contentPane.add(btnLogar);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo !");
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setForeground(Color.WHITE);
		lblBemVindo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBemVindo.setBounds(65, 11, 311, 50);
		contentPane.add(lblBemVindo);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(137, 136, 158, 33);
		contentPane.add(lblSenha);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(137, 72, 158, 38);
		contentPane.add(lblNewLabel);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(150, 167, 145, 33);
		contentPane.add(txtSenha);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setBackground(new Color(102, 51, 153));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setOpaque(false);
		btnCancelar.setToolTipText("Cancelar");
		btnCancelar.setIcon(new ImageIcon(InterfaceLogin.class.getResource("/Imagens/icons8-voltar-16.png")));
		btnCancelar.setBounds(218, 267, 49, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\sopar\\eclipse-workspace\\LocadoraGames\\Imagens\\experiencia-do-usuario-1.png"));
		lblImagem.setBounds(0, 0, 450, 300);
		contentPane.add(lblImagem);
	}
}
