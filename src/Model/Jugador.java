package Model;

public class Jugador 
{
	protected  String _nombre;
	protected  String _equipo;
	protected  String _fechaDeNacimiento;
	protected  String _cedulaDeIdentidad;
	protected  String _posicion;
	protected  String _sexo;
	protected  int _altura;
	protected  int _peso;
	protected  int _numeroDeCamiseta;
	
	public Jugador(String nombre, String cedulaDeIdentidad, String sexo, 
  			String fechaDeNacimiento, String equipo, String posicion,
  			int altura, int peso, int numeroDeCamiseta)
	{
		_nombre = nombre;
		_fechaDeNacimiento = fechaDeNacimiento;
		_cedulaDeIdentidad = cedulaDeIdentidad;
		_altura = altura;
		_peso = peso;
		_sexo = sexo;
		_posicion = posicion;
		_equipo = equipo;
		_numeroDeCamiseta = numeroDeCamiseta;
		
	}
}
