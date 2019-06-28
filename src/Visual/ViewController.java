package Visual;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream.GetField;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.omg.CORBA.INITIALIZE;

import Model.DirectorTecnico;
import Model.Equipos;
import interfases.ILogicController;
import interfases.IViewController;

import javax.imageio.stream.FileImageInputStream;
import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ViewController implements IViewController 
{
	private ILogicController _iLogicController = null;
	static ImageIcon imagen[] = new ImageIcon[31];		
	static int contador = 	1;
	static ImageIcon video[] = new  ImageIcon[11];
	static JFileChooser seleccionar = new JFileChooser();
	static File Bandera;
	static byte[] imagenBandera;
	static FileInputStream entrada;
	static FileOutputStream salida;
	
	

	@Override
	public void setLogicController(ILogicController iLogicController) 
	{
		_iLogicController = iLogicController;
	}
	
	byte[] subirBandera(File Bandera)
	{
		byte[] imagenBandera = new byte[1024*100];
		
		try 
		{
			entrada = new FileInputStream(Bandera);
			entrada.read(imagenBandera);
		} 
		catch (Exception e){
		}
		return imagenBandera;	
		
	}
	
	private String GuardarBandera(File Bandera, byte[]imagenBandera) 
	{
		String mensaje = null;
		try
		{
			salida = new FileOutputStream(Bandera);
			salida.write(imagenBandera);
			mensaje = "Archivo guardado";
		}
		catch (Exception e)
		{
			
		}
		return mensaje;
	}
	
	public void irAlInicio() 
	{
		VistaPrincipal vistaPrincipal = new VistaPrincipal(this);
		vistaPrincipal.setVisible(true);
	}
	public void irARegistroDT() 
	{
		RegistroDT registroDt = new RegistroDT(this);
		registroDt.setVisible(true);
	}
	public void irARegristroJugador() 
	{
		RegistroJugador registroJugador = new RegistroJugador(this);
		registroJugador.setVisible(true);
	}
	
	public void irAtras() 
	{
		VistaPrincipal vistaPrincipal = new VistaPrincipal(this);
		vistaPrincipal.setVisible(true);
	}
	
	public void irACrearEquipo()
	{
		CrearEquipoNuevo crearEquipoNuevo = new CrearEquipoNuevo(this);
		crearEquipoNuevo.setVisible(true);
	}
	
	public void irAVideos() {
		Videos videos = new Videos(this);
		videos.setVisible(true);		
	}
	

//	public void ingresar() {
//		
//		IViewController.Ingresar();
//		
//		
//	}

	@Override
	public void VistaPrincipal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IrAtras() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void CrearJugador() {
//		IViewController.crearJugador();
//		
//	}

	public void irACampeonatos() {
		Campeonatos campeonatos = new Campeonatos(this);
		campeonatos.setVisible(true);
	}

	public void irAJugadores() {
		Jugadores jugadores = new Jugadores(this);
		jugadores.setVisible(true);
		
	}

	public void irALogIn() {
		LogIn logIn = new LogIn(this);
		logIn.setVisible(true);
		
	}

	@Override
	public void CrearJugador() {
		// TODO Auto-generated method stub
		
	}

	


	public void crearDirectorTecnico(String _nombre, String _cedulaDeIdentidad, String _fechaDeNacimiento,
			String _equipo, String pass) {
		IViewController.agregarDTS();
	}

	

	

	


	
	



	
	
	
	
		
	
	


	

	
	
}
