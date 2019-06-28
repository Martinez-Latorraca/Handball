package Model;


import interfases.ILogicController;
import interfases.IModelController;

public class ModelController implements IModelController {
	
	

	@Override
	public void setLogicController(ILogicController iLogicController) {
		
	}

	private  Jugador[] _jugador = new Jugador[100];

	protected  void crearJugador(String nombre, String cedulaDeIdentidad, String sexo, 
  			String fechaDeNacimiento, String equipo, String posicion,
  			int altura, int peso, int numeroDeCamiseta)
	{
		Jugador jugador = new Jugador( nombre,  cedulaDeIdentidad,  sexo, 
  			 fechaDeNacimiento,  equipo,  posicion,
  			 altura,  peso,  numeroDeCamiseta);
		agregarJugador(jugador);
	}
	
	protected void agregarJugador(Jugador jugador)
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
	
	

	protected  DirectorTecnico[] _directorTecnico = new DirectorTecnico[100];

	protected void crearDT(String nombre,String fechaDeNacimiento,
			String cedulaDeIdentidad, String equipo) 
	{
		DirectorTecnico DT = new DirectorTecnico(nombre, fechaDeNacimiento, cedulaDeIdentidad, equipo);
		agregarDTS(DT);
				
	}
	
	protected  void agregarDTS(DirectorTecnico dts)
	{
		int i = 0;
		while(_directorTecnico[i] != null)
		{
			i++;
		}
			
		_directorTecnico[i] = dts;
	}

	public  DirectorTecnico[] getDTS() {
		return _directorTecnico;
	}
	
	protected  Admin[] _admin = new Admin[100];
	
	protected void crearAdmin( String nombre, String CI, String pass)
	{
		Admin admin = new Admin(nombre, CI, pass);
		agregarUsuario(admin);
		
	}

	protected void agregarUsuario(Admin admin)
	{
		int i = 0;
		while(_admin[i] != null)
		{
			i++;
		}
			
		_admin[i] = admin;
	}

	public  Admin[] getAdmin() {
		return _admin;
	}
	
	
	
	protected  Equipo[] _equipo = new Equipo[100];
	
	protected void crearEquipo(String nombre, String fechaDeFundacion, String barrio, int contacto, String email, byte bandera)
	{
		Equipo equipo = new Equipo(nombre, fechaDeFundacion, barrio, contacto, email, bandera);
		agregarEquipo(equipo);
	}

	protected void agregarEquipo(Equipo equipo)
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

	@Override
	public void agregarDTS() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
