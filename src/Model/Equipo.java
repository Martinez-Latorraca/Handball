package Model;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Equipo {
	
	
	private String _nombre;
	private String _fundacion;
	private String _barrio;
	private int _contacto;
	private String _email;
	private byte _bandera;
	
	public Equipo(String nombre, String fundacion, String barrio,
						int contacto, String email, byte bandera)
	{
		_nombre = nombre;
		_fundacion = fundacion;
		_barrio = barrio;
		_contacto = contacto;
		_email = email;
		_bandera = bandera;
	}

}
