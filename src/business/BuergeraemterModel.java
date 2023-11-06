package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuergeraemterModel {
	
	public Buergeramt bgAmt;
	
	

	
	public void schreibeBuergeraemterinCsvDatei() {
		
		try {
			BufferedWriter aus = new BufferedWriter(new FileWriter("Buergeraemter.csv",true));
			aus.write(bgAmt.gibBuergeramtZurueck(';'));
			aus.flush();
			aus.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
