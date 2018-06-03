package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfacePrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfacePrincipal frame = new InterfacePrincipal();
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
	public InterfacePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnClientes.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagens/icons8-m\u00E1scara-dos-anonymous-50.png")));
		btnClientes.setBounds(0, 176, 137, 59);
		contentPane.add(btnClientes);
		
		JButton btnJogos = new JButton("Jogos");
		btnJogos.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagens/icons8-mario-8-bit-filled-50.png")));
		btnJogos.setBounds(173, 176, 137, 59);
		contentPane.add(btnJogos);
		
		JButton btnLocao = new JButton("Loca\u00E7\u00E3o");
		btnLocao.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagens/icons8-cole\u00E7\u00E3o-de-cds-50.png")));
		btnLocao.setBounds(340, 176, 137, 59);
		contentPane.add(btnLocao);
		
		JButton btnDevolucao = new JButton("Devolucao");
		btnDevolucao.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagens/icons8-devolver-compra-filled-50.png")));
		btnDevolucao.setBounds(505, 176, 149, 59);
		contentPane.add(btnDevolucao);
		
		JLabel lblImagemPrincipal = new JLabel("");
		lblImagemPrincipal.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagens/game-banner.png")));
		lblImagemPrincipal.setBounds(0, 0, 654, 175);
		contentPane.add(lblImagemPrincipal);
		
		JLabel lblImagemBaixo = new JLabel("");
		lblImagemBaixo.setIcon(new ImageIcon(InterfacePrincipal.class.getResource("/Imagens/de30bdc3237ed1d09edcea4534e60c4b--xbox-one-games-videogames.jpg")));
		lblImagemBaixo.setBounds(0, 176, 654, 380);
		contentPane.add(lblImagemBaixo);
	}
}
