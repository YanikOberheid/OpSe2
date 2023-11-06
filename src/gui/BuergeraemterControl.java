package gui;

import java.io.IOException;

import business.BuergeraemterModel;
import javafx.stage.Stage;

public class BuergeraemterControl {
	
	private BuergeraemterModel bgModel;
	private BuergeraemterView bgView;
	
	public BuergeraemterControl(Stage primaryStage){
		this.bgModel = new BuergeraemterModel();
		this.bgView = new BuergeraemterView(this, primaryStage,bgModel);
	}
	
	
	void schreibeBuergeraemterInDatei(String typ) {
		try {
			if("csv".equals(typ)) {
			
				bgModel.schreibeBuergeraemterinCsvDatei();
			} else {
				bgView.zeigeInformationsfensterAn("Noch nicht implementiert");
			}
		} catch(Exception exc) {
			bgView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!");
			exc.printStackTrace();
		} 
	}
	
	
	
	
}

