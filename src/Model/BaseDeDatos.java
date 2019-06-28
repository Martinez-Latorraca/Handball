package Model;
public class BaseDeDatos {

	public static Jugador[] _jugador = new Jugador[100];

	public void agregarJugador(Jugador jugador)
	{
		int i = 0;
		while(_jugador[i] != null)
		{
			i++;
		}
			
		_jugador[i] = jugador;
	}

	public  Jugador[] getJugador() {
		return _jugador;
	}

	public static  DirectorTecnico[] _directorTecnico = new DirectorTecnico[100];

	public  void agregarDTS(DirectorTecnico dts)
	{
		int i = 0;
		while(_directorTecnico[i] != null)
		{
			i++;
		}
			
		_directorTecnico[i] = dts;
	}

	public static DirectorTecnico[] getDTS() {
		return _directorTecnico;
	}
	
	public static Admin[] _admin = new Admin[100];

	public void agregarUsuario(Admin admin)
	{
		int i = 0;
		while(_admin[i] != null)
		{
			i++;
		}
			
		_admin[i] = admin;
	}

	public static Admin[] getAdmin() {
		return _admin;
	}
	
	public static Equipo[] _equipo = new Equipo[100];

	public void agregarEquipo(Equipo equipo)
	{
		int i = 0;
		while(_equipo[i] != null)
		{
			i++;
		}
			
		_equipo[i] = equipo;
	}

	public Equipo[] getEquipo() {
		return _equipo;
	}
}
