package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class CrearEquipoNuevo extends JFrame {

	private JPanel contentPane;
	private JTextField textNombreEquipo;
	private JLabel lblFechaDeFundacion;
	private JTextField textFechaDeFundacion;
	private JTextField textBarrio;
	private JTextField textContacto;
	private JTextField textEmail;
	private ViewController _iViewController;

	

	/**
	 * Create the frame.
	 */
	public CrearEquipoNuevo(ViewController vc) {
		_iViewController = vc;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMostrarBandera = new JLabel("");
		lblMostrarBandera.setOpaque(true);
		lblMostrarBandera.setForeground(Color.WHITE);
		lblMostrarBandera.setBackground(Color.WHITE);
		lblMostrarBandera.setBounds(195, 379, 203, 122);
		contentPane.add(lblMostrarBandera);
		
		JLabel lblNombre = new JLabel("Nombre ");
		lblNombre.setBounds(195, 111, 50, 27);
		contentPane.add(lblNombre);
		
		textNombreEquipo = new JTextField();
		textNombreEquipo.setBounds(249, 114, 149, 20);
		contentPane.add(textNombreEquipo);
		textNombreEquipo.setColumns(10);
		
		lblFechaDeFundacion = new JLabel("Fecha de fundacion");
		lblFechaDeFundacion.setBounds(462, 117, 104, 14);
		contentPane.add(lblFechaDeFundacion);
		
		textFechaDeFundacion = new JTextField();
		textFechaDeFundacion.setBounds(572, 114, 121, 20);
		contentPane.add(textFechaDeFundacion);
		textFechaDeFundacion.setColumns(10);
		
		
		JLabel lblCategorias = new JLabel("Categorias");
		lblCategorias.setBounds(416, 166, 112, 14);
		contentPane.add(lblCategorias);
		
		JRadioButton rdbtnSeniorMasc = new JRadioButton("Senior");
		rdbtnSeniorMasc.setBounds(249, 202, 109, 23);
		contentPane.add(rdbtnSeniorMasc);
		rdbtnSeniorMasc.setEnabled(false);
		
		JRadioButton rdbtnInferioresMasc = new JRadioButton("Inferiores");
		rdbtnInferioresMasc.setBounds(249, 238, 109, 23);
		contentPane.add(rdbtnInferioresMasc);
		rdbtnInferioresMasc.setEnabled(false);

		

		JRadioButton rdbtnSeniorFem = new JRadioButton("Senior");
		rdbtnSeniorFem.setBounds(572, 202, 109, 23);
		contentPane.add(rdbtnSeniorFem);
		rdbtnSeniorFem.setEnabled(false);
		
		JRadioButton rdbtnInferioresFem = new JRadioButton("Inferiores");
		rdbtnInferioresFem.setBounds(572, 238, 109, 23);
		contentPane.add(rdbtnInferioresFem);
		rdbtnInferioresFem.setEnabled(false);
		
		JCheckBox chckbxMasculino = new JCheckBox("Masculino");
		chckbxMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxMasculino.isSelected())
				{
				rdbtnSeniorMasc.setEnabled(true);
				rdbtnInferioresMasc.setEnabled(true);
				}
				else 
				{
					rdbtnSeniorMasc.setEnabled(false);
					rdbtnInferioresMasc.setEnabled(false);
				}
			}
		});
		chckbxMasculino.setBounds(249, 162, 97, 23);
		contentPane.add(chckbxMasculino);
		
		JCheckBox chckbxFemenino = new JCheckBox("Femenino");
		chckbxFemenino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxFemenino.isSelected()) {
					rdbtnSeniorFem.setEnabled(true);
					rdbtnInferioresFem.setEnabled(true);
				}
				else 
				{
					rdbtnSeniorFem.setEnabled(false);
					rdbtnInferioresFem.setEnabled(false);
				}
			}
		});
		chckbxFemenino.setBounds(572, 162, 97, 23);
		contentPane.add(chckbxFemenino);


		JComboBox CBDT = new JComboBox();
		CBDT.setBounds(280, 286, 118, 20);
		contentPane.add(CBDT);
		//hacer un setmodel con la base de datos hacer un string con los dTs de la base de datos
		
		
		
		JLabel lblDirectorTecnico = new JLabel("Director tecnico");
		lblDirectorTecnico.setBounds(195, 289, 75, 14);
		contentPane.add(lblDirectorTecnico);
		
		JLabel lblBarrio = new JLabel("Barrio");
		lblBarrio.setBounds(520, 288, 46, 14);
		contentPane.add(lblBarrio);
		
		textBarrio = new JTextField();
		textBarrio.setBounds(572, 286, 121, 17);
		contentPane.add(textBarrio);
		textBarrio.setColumns(10);
		
		textContacto = new JTextField();
		textContacto.setBounds(572, 326, 121, 20);
		contentPane.add(textContacto);
		textContacto.setColumns(10);
		
		JLabel lblContacto = new JLabel("Contacto");
		lblContacto.setBounds(520, 329, 46, 14);
		contentPane.add(lblContacto);
		
		JLabel lblBandera = new JLabel("Bandera");
		lblMostrarBandera.setLabelFor(lblBandera);
		lblBandera.setBounds(199, 349, 46, 14);
		contentPane.add(lblBandera);
		
		JButton btnSubirArchivo = new JButton("Subir archivo");
		btnSubirArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (ViewController.seleccionar.showDialog(null, null) == JFileChooser.APPROVE_OPTION )
				{
					ViewController.Bandera = ViewController.seleccionar.getSelectedFile();
					if (ViewController.Bandera.canRead())
					{
						if ( ViewController.Bandera.getName().endsWith("jpg") || ViewController.Bandera.getName().endsWith("png"))
						{
							ViewController.imagenBandera = _iViewController.subirBandera(ViewController.Bandera);
							lblMostrarBandera.setIcon(new ImageIcon(ViewController.imagenBandera));
						}
						else 
							JOptionPane.showMessageDialog(null, "Archivo no compatible");
					}
							
				}
			}
		});
		btnSubirArchivo.setBounds(249, 345, 149, 23);
		contentPane.add(btnSubirArchivo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(520, 365, 46, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(572, 362, 121, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Registro exitoso", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
				_iViewController.irAlInicio();
				dispose();
			}
		});
		btnRegistrar.setBounds(604, 465, 89, 23);
		contentPane.add(btnRegistrar);
		
	}
}
	

