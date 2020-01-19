
import java.io.*;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Calculate extends Application{


public String [] returne(String input) {
	String[]newe=input.split(",");
	return newe;
	
}

static public String calculationType(ChoiceBox<String> item) {
	String type=item.getValue();
	return type;
}

public void start(Stage stage) {
Label label=new Label("Enter Input Separated By A Comma");
String  population="p";
String  sample="s";
TextField field = new TextField();
TextField field2= new TextField();
Button button= new Button("Submit");
ChoiceBox <String>list = new ChoiceBox<>();
list.getItems().addAll("Mean","Variance(Population)","Variance(Sample)","Std Deviation(Population)","Std Deviation(Sample)");

button.setOnAction(e->{
    try {
	String value=calculationType(list);
	String array[]=returne(field.getText());
	String output=null;
	double arr[]=new double[array.length];
	for(int i=0;i<array.length;i++) {
		arr[i]=Double.parseDouble(array[i]);
	}
	Main function = new Main(arr);
	switch (value) {
	  case "Mean":
		output = Double.toString(function.findAverage());
		field2.setText(output);
	    break;
	  case "Variance(Population)":
		output = Double.toString(function.findVariance(population));
		field2.setText(output);	    
	    break;
	  case "Variance(Sample)":
		 output = Double.toString(function.findVariance(sample));
		field2.setText(output);
	    break;
	  case "Std Deviation(Population)":
		 output = Double.toString(function.findStandardDeviation(population));
		 field2.setText(output);
	    break;
	  case "Std Deviation(Sample)":
		output = Double.toString(function.findStandardDeviation(sample));
	    field2.setText(output);
	    break;
	  default:
		  field.setText("ERROR");
		  break;
	}
	
    }catch(Exception e1) {
    	Error err= new Error();
    	err.errorBox();
    }

});
Region spacer=new Region();
VBox box = new VBox();
VBox.setVgrow(spacer, Priority.ALWAYS);



box.getChildren().addAll(label,field,list,button,field2);
Scene scene = new Scene(box);
scene.getStylesheets().addAll("style.css");
stage.setResizable(true);

stage.setScene(scene);
stage.show();

	
}
public static void main(String args[]) {
launch(args);
}

	
	
}