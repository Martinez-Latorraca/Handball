package Model;

public enum Funcion {
	
	Administrador(1), 
	Director_técnico(2), 
	Jugador(3);
	
	private int _valorFuncion;
	
	private Funcion (int valorFuncion) 
	{
		_valorFuncion = valorFuncion;
		
	}

	public int getvalorFuncion() 
	{
		return _valorFuncion;
	}
	

}
