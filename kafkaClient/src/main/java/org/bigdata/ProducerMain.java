package org.bigdata;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ProducerMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
	        // 연락처 요약을 가져온다.
	        FXMLLoader loader = new FXMLLoader();
	        
	        loader.setLocation(ProducerMain.class.getResource("view/ProducerView.fxml"));
	        
	        AnchorPane producerView = (AnchorPane)loader.load();
	        
	        primaryStage.setTitle("Kafka Producer");
	        primaryStage.setScene(new Scene(producerView));
	        primaryStage.show();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public static void main(String[] args) {
		launch(args);
	}
}
