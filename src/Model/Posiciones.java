package Model;

public enum Posiciones 
{
	GOLERO(1),
	ARMADOR(2),
	LATERAL(3), 
	PUNTERO(4), 
	PIVOTE(5);
	
	private int _valorPosiciones;
	
	private Posiciones (int valorPosiciones) 
	{
		_valorPosiciones = valorPosiciones;
		
	}

	public int get_valorPosiciones() 
	{
		return _valorPosiciones;
	}
}
