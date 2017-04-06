package dialog;

import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CustomConfirmationAlert extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("CUSTOM CONFIRMATION 경고창테스트!");
        
        // 버튼 만들기.
        Button btn = new Button();
        btn.setText("CUSTOM CONFIRMATION 경고창보이기");
        
        btn.setOnAction(new EventHandler<ActionEvent>() { // 버튼 눌렀을 때 실행됨.
            public void handle(ActionEvent arg0) {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("CUSTOM CONFIRMATION 알림");
                alert.setHeaderText("헤더영역 문자열");
                alert.setContentText("여러버튼중 선택하세요.");
                
                ButtonType buttonTypeOne = new ButtonType("One");
                ButtonType buttonTypeTwo = new ButtonType("Two");
                ButtonType buttonTypeThree = new ButtonType("Three");
                ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE); // 차이점은 다른 버튼과의 간격이 좀더 벌어짐?
                
                alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree,
                        buttonTypeCancel);

                Optional<ButtonType> result = alert.showAndWait();
                
                if(result.get() == buttonTypeOne) {
                    System.out.println("One 버튼 클릭!!");
                } else if(result.get() == buttonTypeTwo) {
                	System.out.println("Two 버튼 클릭!!");
                } else if(result.get() == buttonTypeThree) {
	            	System.out.println("Three 버튼 클릭!!");
	            } else {
	            	System.out.println("Cancel 버튼 클릭!!");
	            }
            }
        });
         
        // 판때기 하나 깔아주시고,,
        StackPane sp = new StackPane();
        sp.getChildren().addAll(btn);
         
        // 창 설정.
        stage.setScene(new Scene(sp, 500, 300));
        stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
