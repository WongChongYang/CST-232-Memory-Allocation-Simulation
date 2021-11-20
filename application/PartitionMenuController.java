package application;

import java.io.IOException;
import javafx.fxml.FXML;

public class PartitionMenuController {
	
	@FXML
	private void goDynamic() throws IOException{
		Main.partitionChoice = 2;
		Main.showDynamicMenu();
	}
	
	@FXML
	private void goFixed() throws IOException {
		Main.partitionChoice = 1;
		Main.showFixedMenu();
	}
}
