package Controller;


import interfases.ILogicController;
import interfases.IModelController;
import interfases.IViewController;

public class LogicController implements ILogicController
{

	private IViewController _iVewController;
	private IModelController _iModelController;

	@Override
	public void init() {
		
		_iVewController.irAlInicio();
	}

 
	public void setViewController(IViewController iViewController) {
		this._iVewController = iViewController;
		 
		
	}
 
	public void setModelController(IModelController iModelController) {
		this._iModelController = iModelController;
		
	}
	
	

	
	
	
	
	

}
