package application;

import java.io.IOException;
import javafx.fxml.FXML;

public class FixedMemoryController {
	
	@FXML
	private void goFixedMemory1() throws IOException{
		Main.memoryBlock = 3;
		Main.runEvent();
	}

	@FXML
	private void goFixedMemory2() throws IOException{
		Main.memoryBlock = 5;
		Main.runEvent();
	}
	
	@FXML
	private void goFixedMemory3() throws IOException{
		Main.memoryBlock = 7;
		Main.runEvent();
	}
	
	@FXML
	private void goFixedMemory4() throws IOException{
		Main.memoryBlock = 10;
		Main.runEvent();
	}
}
