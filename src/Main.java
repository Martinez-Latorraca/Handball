import java.awt.EventQueue;

import Visual.ViewController;
import Visual.VistaPrincipal;
import interfases.ILogicController;
import interfases.IModelController;
import interfases.IViewController;

public abstract class Main {

		
		public static void main(String[] args) {
							
			
			IViewController iViewController = Factory.getViewController();
			ILogicController iLogicController = Factory.getLogicController();
			IModelController iModelController = Factory.getModelController();
			
			iLogicController.setModelController(iModelController);
			iLogicController.setViewController(iViewController);
			
			iModelController.setLogicController(iLogicController);
						
			iViewController.setLogicController(iLogicController);
			
			
			iLogicController.init();
		}
				
}


