package Visual;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Model.Equipos;

public class RegistroAdmin extends JFrame {

	protected JPanel contentPane;
	protected JTextField txtNombre;
	protected JTextField txtEdad;
	protected JTextField txtCI;
	protected String _nombre;
	protected String _equipo;
	protected String _fechaDeNacimiento;
	protected String _cedulaDeIdentidad;
	private JPasswordField pwdContrasea;
	private JTextField txtIdAdmin;
	private ViewController _iViewController;

	

	/**
	 * Create the frame.
	 */
	public RegistroAdmin(ViewController vc) {
		_iViewController = vc;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setText("Nombre");
		txtNombre.setBounds(79, 37, 128, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		
		txtCI = new JTextField();
		txtCI.setHorizontalAlignment(SwingConstants.CENTER);
		txtCI.setText("12343543");
		txtCI.setColumns(10);
		txtCI.setBounds(79, 68, 128, 20);
		contentPane.add(txtCI);
		
				
		txtEdad = new JTextField();
		txtEdad.setHorizontalAlignment(SwingConstants.CENTER);
		txtEdad.setText("Fecha de nacimiento");
		txtEdad.setColumns(10);
		txtEdad.setBounds(236, 37, 113, 20);
		contentPane.add(txtEdad);
		
		
		JComboBox CBEquipo = new JComboBox();
		CBEquipo.setBounds(236, 68, 113, 20);
		contentPane.add(CBEquipo);
		CBEquipo.addItem("Crear nuevo equipo");
	
		
		
		
		JButton btnRegistrarse2 = new JButton("Registrarse");
		btnRegistrarse2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if ( CBEquipo.getSelectedItem().equals("Crear nuevo equipo")) 
				{
					_iViewController.irACrearEquipo();
					dispose();
				}
				
			}
	
		});
		btnRegistrarse2.setBounds(162, 205, 89, 23);
		contentPane.add(btnRegistrarse2);
		
	
		JLabel lblTodosLosCampos = new JLabel("Todos los campos son obligatorios");
		lblTodosLosCampos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTodosLosCampos.setBounds(122, 137, 178, 40);
		contentPane.add(lblTodosLosCampos);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.setText("Contrase\u00F1a");
		pwdContrasea.setBounds(79, 99, 128, 20);
		contentPane.add(pwdContrasea);
		
		txtIdAdmin = new JTextField();
		txtIdAdmin.setText("ID Admin");
		txtIdAdmin.setBounds(236, 99, 113, 20);
		contentPane.add(txtIdAdmin);
		txtIdAdmin.setColumns(10);
		
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

	public JTextField getTxtCI() {
		return txtCI;
	}

	public JPasswordField getPwdContrasea() {
		return pwdContrasea;
	}
	
}
