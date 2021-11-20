package application;

import java.io.IOException;
import javafx.fxml.FXML;

public class DynamicController {
	
	@FXML
	private void goDynamicFirst() throws IOException{
		Main.algoOption = 1;
		Main.showDynamicMemory();
	}
	
	@FXML
	private void goDynamicBest() throws IOException{
		Main.algoOption = 2;
		Main.showDynamicMemory();
	}
	
	@FXML
	private void goDynamicWorst() throws IOException{
		Main.algoOption = 3;
		Main.showDynamicMemory();
	}
}
