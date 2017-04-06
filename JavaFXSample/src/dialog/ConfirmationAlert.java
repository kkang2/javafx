package dialog;

import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ConfirmationAlert extends Application {
	@Override
	public void start(Stage stage) throws Exception {
        stage.setTitle("CONFIRMATION 경고창테스트!");
         
        // 버튼 만들기.
        Button btn = new Button();
        btn.setText("CONFIRMATION 경고창보이기");
        
        btn.setOnAction(new EventHandler<ActionEvent>() { // 버튼 눌렀을 때 실행됨.
            public void handle(ActionEvent arg0) {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("CONFIRMATION 알림");
                alert.setHeaderText("헤더영역 문자열");
                alert.setContentText("OK/Cancel 선택하세요.");
                
                Optional<ButtonType> result = alert.showAndWait();
                
                if(result.get() == ButtonType.OK) {
                    System.out.println("OK 버튼 클릭!!");
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
