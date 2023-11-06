package main;

import gui.BuergeraemterView;
import javafx.application.Application;
import javafx.stage.Stage;
import business.BuergeraemterModel;
import gui.BuergeraemterControl;
public class Main extends Application {
	
	private BuergeraemterModel bgModel;
	private BuergeraemterControl bgControl;
	
	@Override
	public void start(Stage primaryStage) {
		new BuergeraemterControl(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
