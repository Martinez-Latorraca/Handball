package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VistaPrincipal extends JFrame
{

	
	private JPanel contentPane;
	private ViewController _iViewController;


	/**
	 * Create the frame.
	 * @param vc 
	 */
	public VistaPrincipal(ViewController vc) {
		_iViewController = vc;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnNoticias = new JTextPane();
		txtpnNoticias.setText("Noticias");
		txtpnNoticias.setBounds(10, 38, 196, 398);
		contentPane.add(txtpnNoticias);
		
		JButton btnCampeonatos = new JButton("Campeonatos");
		btnCampeonatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				_iViewController.irACampeonatos();
				dispose();
				}
		});
		btnCampeonatos.setBounds(10, 465, 196, 85);
		contentPane.add(btnCampeonatos);
		
		JButton btnJugadores = new JButton("Jugadores");
		btnJugadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				_iViewController.irAJugadores();
				dispose();
			}
		});
		btnJugadores.setBounds(233, 467, 196, 80);
		contentPane.add(btnJugadores);
		
		JButton btnVideos = new JButton("Videos");
		btnVideos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				_iViewController.irAVideos();
				dispose();
				
			}
		});
		btnVideos.setBounds(461, 465, 196, 85);
		contentPane.add(btnVideos);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				_iViewController.irALogIn();
				dispose();
			}
		});
		btnLogIn.setBounds(678, 465, 196, 85);
		contentPane.add(btnLogIn);
		
		JLabel LBFotos = new JLabel("");
		LBFotos.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/Visual/Imagenes/1.jpg")));
		LBFotos.setBounds(216, 38, 658, 371);
		contentPane.add(LBFotos);
		
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ViewController.contador == 1)
				{
					ViewController.contador = 31;
				}
				ViewController.contador--;
			LBFotos.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/Visual/Imagenes/"+ViewController.contador+".jpg")));
			System.out.println(ViewController.contador);
			}
		});
		btnAnterior.setBounds(216, 413, 89, 23);
		contentPane.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ViewController.contador == 30) 
				{
					ViewController.contador = 0; 
				}
				ViewController.contador++;
				LBFotos.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/Visual/Imagenes/"+ViewController.contador+".jpg")));
			System.out.println(ViewController.contador);
			}
			
		});
		btnSiguiente.setBounds(785, 413, 89, 23);
		contentPane.add(btnSiguiente);
		
		JLabel lblIngresar = new JLabel("Para ingresar hacer click en Log In");
		lblIngresar.setBounds(682, 11, 173, 14);
		contentPane.add(lblIngresar);
		
		
		
		
	}
	
	
	
}
