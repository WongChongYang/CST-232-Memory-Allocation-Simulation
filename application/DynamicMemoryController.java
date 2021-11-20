package application;

import java.io.IOException;
import javafx.fxml.FXML;

public class DynamicMemoryController {
	
	@FXML
	private void goDynamicMemory1() throws IOException{
		Main.memoryBlock = 20000;
		Main.runEvent();
	}

	@FXML
	private void goDynamicMemory2() throws IOException{
		Main.memoryBlock = 30000;
		Main.runEvent();
	}
	
	@FXML
	private void goDynamicMemory3() throws IOException{
		Main.memoryBlock = 40000;
		Main.runEvent();
	}
	
	@FXML
	private void goDynamicMemory4() throws IOException{
		Main.memoryBlock = 50000;
		Main.runEvent();
	}
}
