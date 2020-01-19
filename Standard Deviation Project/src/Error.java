

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Error {

public  void errorBox(){
	Stage window = new Stage();
	Label label = new Label("Improper Input!");
	label.setFont(new Font("Arial",30));
	BorderPane pane = new BorderPane();
	pane.setCenter(label);
	Scene scene =new Scene(pane);
	window.setScene(scene);
	window.setMinWidth(250);
	window.setMinHeight(250);
	window.show();
}

}
