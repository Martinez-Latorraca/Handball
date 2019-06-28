package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private static JTextField CedulaIdentidad;
	private JButton btnRegistrarse;
	private ViewController _iViewController;
	private static JPasswordField passwordField;

	

	/**
	 * Create the frame.
	 */
	public LogIn(ViewController vc) {
		_iViewController = vc;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CedulaIdentidad = new JTextField();
		CedulaIdentidad.setBounds(439, 183, 89, 20);
		contentPane.add(CedulaIdentidad);
		CedulaIdentidad.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(439, 214, 89, 20);
		contentPane.add(passwordField);
								
		JLabel lblCedulaDeIdentidad = new JLabel("Cedula de identidad");
		lblCedulaDeIdentidad.setBounds(328, 185, 101, 17);
		contentPane.add(lblCedulaDeIdentidad);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(328, 216, 101, 17);
		contentPane.add(lblContrasea);
		
		JButton Ingresar = new JButton("Ingresar");
		Ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
//				_iViewController.ingresar();
				dispose();
			}

			
		});
		Ingresar.setBounds(439, 282, 89, 23);
		contentPane.add(Ingresar);
		
		JRadioButton rdbtnJugador = new JRadioButton("Jugador");
		rdbtnJugador.setBounds(338, 241, 65, 23);
		contentPane.add(rdbtnJugador);
		
		JRadioButton rdbtnDirectorTecnico = new JRadioButton("Director Tecnico");
		rdbtnDirectorTecnico.setBounds(405, 241, 109, 23);
		contentPane.add(rdbtnDirectorTecnico);
	
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (rdbtnDirectorTecnico.isSelected() == true) 
				{
					_iViewController.irARegistroDT();
					dispose();
				}
				if(rdbtnJugador.isSelected() == true)
				{
					_iViewController.irARegristroJugador();
					dispose();
				}
				
			}
		});
		btnRegistrarse.setBounds(328, 282, 101, 23);
		contentPane.add(btnRegistrarse);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				_iViewController.irAtras();
				dispose();
			}
		});
		btnAtras.setBounds(10, 11, 89, 23);
		contentPane.add(btnAtras);
		
		
	
	
	
	}

	public static String getCedulaIdentidad() {
		return CedulaIdentidad.getText();
	}

	
	public static char[] getPasswordField() {
		return passwordField.getPassword();
	}

	
	
}
