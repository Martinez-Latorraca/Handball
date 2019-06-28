package Model;

public class DirectorTecnico 
{
	protected  String _nombre;
	protected  String _equipo;
	protected  String _fechaDeNacimiento;
	protected  String _cedulaDeIdentidad;

	public DirectorTecnico(String nombre,String fechaDeNacimiento,
							String cedulaDeIdentidad, String equipo) 
	{
		
		_nombre = nombre;
		_fechaDeNacimiento = fechaDeNacimiento;
		_cedulaDeIdentidad = cedulaDeIdentidad;
		_equipo = equipo;		
		
	}
	
		
}
