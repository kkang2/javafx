package org.bigdata;

import org.bigdata.util.DialogUtil;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) {
		Alert initInfo = DialogUtil.createInformationDialog("No Configured Connections", null, "저장된 Kafka cluster 정보가 없습니다.");
		
		initInfo.showAndWait();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
