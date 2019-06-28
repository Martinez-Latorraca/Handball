package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Campeonatos extends JFrame {

	private JPanel contentPane;
	private JTextField txtSanciones;
	private ViewController _iViewController;

	

	/**
	 * Create the frame.
	 */
	public Campeonatos(ViewController vc) {
		_iViewController = vc;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				_iViewController.irAtras();
				dispose();
			}
		});
		btnAtras.setBounds(10, 11, 89, 23);
		contentPane.add(btnAtras);
		
		JButton btnCampanteriores = new JButton("Campeonatos Anteriores");
		btnCampanteriores.setBounds(10, 45, 135, 100);
		contentPane.add(btnCampanteriores);
		
		JTextPane txtpnGoleadores = new JTextPane();
		txtpnGoleadores.setText("Goleadores");
		txtpnGoleadores.setBounds(580, 11, 160, 391);
		contentPane.add(txtpnGoleadores);
		
		JTextPane txtpnJugadormasvalioso = new JTextPane();
		txtpnJugadormasvalioso.setText("JugadorMasValioso");
		txtpnJugadormasvalioso.setBounds(750, 11, 124, 388);
		contentPane.add(txtpnJugadormasvalioso);
		
		JTextPane txtpnTabla = new JTextPane();
		txtpnTabla.setText("Tabla");
		txtpnTabla.setBounds(155, 11, 415, 391);
		contentPane.add(txtpnTabla);
		
		txtSanciones = new JTextField();
		txtSanciones.setHorizontalAlignment(SwingConstants.CENTER);
		txtSanciones.setText("sanciones");
		txtSanciones.setBounds(155, 413, 719, 137);
		contentPane.add(txtSanciones);
		txtSanciones.setColumns(10);
	}
}
