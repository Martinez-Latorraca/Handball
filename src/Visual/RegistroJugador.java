package Visual;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Equipos;
import Model.Posiciones;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
public class RegistroJugador extends JFrame {
	

	protected  JPanel contentPane;
	protected  JTextField txtNombre;
	protected  JTextField txtEdad;
	protected  JTextField txtCI;
	protected  JTextField txtAltura;
	protected  JTextField txtPeso;
	protected  JTextField txtNroDeCamiseta;
	protected  JComboBox CBPosicion;
	protected  JComboBox CBEquipo;
	protected  JComboBox CBSexo;
	private JPasswordField pwdContrasea;
	private ViewController _iViewController;
	



	/**
	 * Create the frame.
	 */
	public RegistroJugador(ViewController vc) {
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
		txtNombre.setBounds(293, 163, 128, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		
		txtCI = new JTextField();
		txtCI.setHorizontalAlignment(SwingConstants.CENTER);
		txtCI.setText("12343543");
		txtCI.setColumns(10);
		txtCI.setBounds(293, 194, 128, 20);
		contentPane.add(txtCI);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.setText("Contrase\u00F1a");
		pwdContrasea.setBounds(450, 257, 113, 22);
		contentPane.add(pwdContrasea);
			
		txtEdad = new JTextField();
		txtEdad.setHorizontalAlignment(SwingConstants.CENTER);
		txtEdad.setText("Fecha de nacimiento");
		txtEdad.setColumns(10);
		txtEdad.setBounds(450, 163, 113, 20);
		contentPane.add(txtEdad);
		
		
		JComboBox CBPosicion = new JComboBox();
		CBPosicion.setBounds(293, 225, 128, 20);
		contentPane.add(CBPosicion);
		CBPosicion.addItem(Posiciones.GOLERO);
		CBPosicion.addItem(Posiciones.ARMADOR);
		CBPosicion.addItem(Posiciones.LATERAL);
		CBPosicion.addItem(Posiciones.PIVOTE);
		CBPosicion.addItem(Posiciones.PUNTERO);
		
		JComboBox CBEquipo = new JComboBox();
		CBEquipo.setBounds(293, 256, 128, 23);
		contentPane.add(CBEquipo);
		CBEquipo.addItem(Equipos.A);
		CBEquipo.addItem(Equipos.B);
		CBEquipo.addItem(Equipos.C);
		CBEquipo.addItem(Equipos.D);
		CBEquipo.addItem(Equipos.E);
		CBEquipo.addItem(Equipos.F);
		CBEquipo.addItem(Equipos.G);
		CBEquipo.addItem(Equipos.H);
		
		txtAltura = new JTextField();
		txtAltura.setHorizontalAlignment(SwingConstants.CENTER);
		txtAltura.setText("Altura");
		txtAltura.setColumns(10);
		txtAltura.setBounds(450, 194, 53, 20);
		contentPane.add(txtAltura);
		
		txtPeso = new JTextField();
		txtPeso.setHorizontalAlignment(SwingConstants.CENTER);
		txtPeso.setText("Peso");
		txtPeso.setColumns(10);
		txtPeso.setBounds(510, 194, 53, 20);
		contentPane.add(txtPeso);
		
		txtNroDeCamiseta = new JTextField();
		txtNroDeCamiseta.setHorizontalAlignment(SwingConstants.CENTER);
		txtNroDeCamiseta.setText("Camiseta");
		txtNroDeCamiseta.setColumns(10);
		txtNroDeCamiseta.setBounds(450, 225, 53, 20);
		contentPane.add(txtNroDeCamiseta);
		
		JComboBox CBSexo = new JComboBox();
		CBSexo.setBounds(510, 225, 53, 22);
		contentPane.add(CBSexo);
		CBSexo.addItem("Masculino");
		CBSexo.addItem("Femenino");
	
		
		
		JLabel lblTodosLosCampos = new JLabel("Todos los campos son obligatorios");
		lblTodosLosCampos.setBounds(331, 300, 169, 20);
		contentPane.add(lblTodosLosCampos);
		
		JButton btnRegistrarse2 = new JButton("Registrarse");
		btnRegistrarse2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				_iViewController.CrearJugador();
							
			}});
		btnRegistrarse2.setBounds(376, 331, 89, 23);
		contentPane.add(btnRegistrarse2);
		
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
		

}
