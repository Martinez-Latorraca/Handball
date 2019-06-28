package Model;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Admin
{
	protected  String _nombre;
	protected  String _fechaDeNacimiento;
	protected  String _cedulaDeIdentidad;

	
  public Admin(String nombre, String cedulaDeIdentidad, 
		  			String fechaDeNacimiento)
  {
	 _nombre = nombre;
	 _cedulaDeIdentidad = cedulaDeIdentidad;
	 _fechaDeNacimiento = fechaDeNacimiento;
	 
  }

	public String get_nombre() {
		return _nombre;
	}
		
	public String get_fechaDeNacimiento() {
		return _fechaDeNacimiento;
	}
	
	public String get_cedulaDeIdentidad() {
		return _cedulaDeIdentidad;
	}
	
	
	
	

}