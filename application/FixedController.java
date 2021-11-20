package application;

import java.io.IOException;
import javafx.fxml.FXML;

public class FixedController {
	
	@FXML
	private void goFixedFirst() throws IOException{
		Main.algoOption = 1;
		Main.showFixedMemory();
	}
	
	@FXML
	private void goFixedBest() throws IOException{
		Main.algoOption = 2;
		Main.showFixedMemory();
	}
	
}