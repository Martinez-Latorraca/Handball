package interfases;

public interface IViewController 
{
	void setLogicController(ILogicController iLogicController);
	void irAlInicio(); 
	void VistaPrincipal();
	void IrAtras();
	void CrearJugador();
	static void agregarDTS() {
		IModelController.agregarDTS();
		
		
		
	}
	
//	void crearJugador()
//	{
//		IModelController.crearJugador();
//		
//	}
	
//	static void Ingresar() {
//		
//		
//	}
}
