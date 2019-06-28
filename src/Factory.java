import Controller.LogicController;
import Model.ModelController;
import Visual.ViewController;
import interfases.ILogicController;
import interfases.IModelController;
import interfases.IViewController;

public abstract class Factory {
	
	public static IViewController getViewController() {
		return new ViewController();
	}

	public static ILogicController getLogicController() {
		return new LogicController();
	}

	public static IModelController getModelController() {
		
		return new ModelController();
	}

}
