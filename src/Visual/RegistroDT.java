package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Model.BaseDeDatos;
import Model.DirectorTecnico;
import Model.Equipos;
import javax.swing.JPasswordField;

public class RegistroDT extends JFrame {

	protected JPanel contentPane;
	protected JTextField txtNombre;
	protected JTextField txtEdad;
	protected JTextField txtCI;
	protected String _nombre;
	protected String _equipo;
	protected String _fechaDeNacimiento;
	protected String _cedulaDeIdentidad;
	private JPasswordField pwdContrasea;
	private ViewController _iViewController;
	private JPasswordField RepetiPasswordField;

	
	/**
	 * Create the frame.
	 */
	public RegistroDT(ViewController vc) {
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
		txtNombre.setBounds(307, 166, 128, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		
		txtCI = new JTextField();
		txtCI.setHorizontalAlignment(SwingConstants.CENTER);
		txtCI.setText("12343543");
		txtCI.setColumns(10);
		txtCI.setBounds(307, 197, 128, 20);
		contentPane.add(txtCI);
		
				
		txtEdad = new JTextField();
		txtEdad.setHorizontalAlignment(SwingConstants.CENTER);
		txtEdad.setText("Fecha de nacimiento");
		txtEdad.setColumns(10);
		txtEdad.setBounds(464, 166, 113, 20);
		contentPane.add(txtEdad);
		
		
		JComboBox CBEquipo = new JComboBox();
		CBEquipo.setBounds(464, 197, 113, 20);
		contentPane.add(CBEquipo);
		CBEquipo.addItem("Crear nuevo equipo");
		CBEquipo.addItem(Equipos.A);
		CBEquipo.addItem(Equipos.B);
		CBEquipo.addItem(Equipos.C);
		CBEquipo.addItem(Equipos.D);
		CBEquipo.addItem(Equipos.E);
		CBEquipo.addItem(Equipos.F);
		CBEquipo.addItem(Equipos.G);
		CBEquipo.addItem(Equipos.H);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.setText("Contrase\u00F1a");
		pwdContrasea.setBounds(307, 228, 128, 20);
		contentPane.add(pwdContrasea);
		
		RepetiPasswordField = new JPasswordField();
		RepetiPasswordField.setText("Contrase\u00F1a");
		RepetiPasswordField.setBounds(307, 265, 128, 20);
		contentPane.add(RepetiPasswordField);
		
		
		JButton btnRegistrarse2 = new JButton("Registrarse");
		btnRegistrarse2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				_nombre = txtNombre.getText();
				_fechaDeNacimiento = txtEdad.getText();
				_cedulaDeIdentidad = txtCI.getText();
				_equipo = CBEquipo.getToolTipText();
				char[] passArray = pwdContrasea.getPassword();
				char[] passDosArray = RepetiPasswordField.getPassword();
				String pass = String.valueOf(passArray);
				String passDos = String.valueOf(passDosArray);
				
				
				if(!pass.equals("") && !_cedulaDeIdentidad.equals("") && !_cedulaDeIdentidad.equals("") && pass.equals(passDos))
				{
					_iViewController.crearDirectorTecnico(_nombre, _cedulaDeIdentidad, _fechaDeNacimiento, _equipo,  pass);
					
					if ( CBEquipo.getSelectedItem().equals("Crear nuevo equipo")) 
					{
						_iViewController.irACrearEquipo();
						dispose();
					}
					else
					{
					JOptionPane.showMessageDialog(null, "Usuario creado", "Todo ok", JOptionPane.INFORMATION_MESSAGE);
					_iViewController.irAlInicio();
					dispose();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Algo anduvo mal", "Error", JOptionPane.ERROR_MESSAGE);
				
					for (int i = 0; i < passArray.length; i++) 
					{
						passArray[i] = ' ';
					}
					for (int i = 0; i < passDosArray.length; i++) 
					{
						passDosArray[i] = ' ';
					}
				
				
				
				
				}

			}

			

				
			
		});
		btnRegistrarse2.setBounds(390, 334, 89, 23);
		contentPane.add(btnRegistrarse2);
		
	
		JLabel lblTodosLosCampos = new JLabel("Todos los campos son obligatorios");
		lblTodosLosCampos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTodosLosCampos.setBounds(345, 283, 178, 40);
		contentPane.add(lblTodosLosCampos);
		
		
			
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				_iViewController.irAtras();
				dispose();
			}
		});
		btnAtras.setBounds(10, 11, 89, 23);
		contentPane.add(btnAtras);
		
		
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo");
		lblNombreCompleto.setBounds(199, 169, 113, 14);
		contentPane.add(lblNombreCompleto);
		
		JLabel lblCedulaDeIdentidad = new JLabel("Cedula de Identidad");
		lblCedulaDeIdentidad.setBounds(199, 200, 113, 14);
		contentPane.add(lblCedulaDeIdentidad);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(199, 234, 113, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir Contrase\u00F1a");
		lblRepetirContrasea.setBounds(199, 268, 113, 14);
		contentPane.add(lblRepetirContrasea);
		
	}


//	protected void crearDirectorTecnico(String _nombre, String _cedulaDeIdentidad, String _fechaDeNacimiento,
//			String _equipo, String pass) {
//		
//			BaseDeDatos DT = new BaseDeDatos(nombre, cedulaDeIdentidad, fechaDeNacimiento, equipo, pass);
//			_iViewController.agregarDTS(DT);
//	}
	
	
}
