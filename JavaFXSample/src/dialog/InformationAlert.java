package dialog;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InformationAlert extends Application {
	@Override
	public void start(Stage stage) throws Exception {
        stage.setTitle("INFORMATION 경고창테스트!");
         
        // 버튼 만들기.
        Button btn = new Button();
        btn.setText("INFORMATION 경고창보이기");
        
        btn.setOnAction(new EventHandler<ActionEvent>() { // 버튼 눌렀을 때 실행됨.
            public void handle(ActionEvent arg0) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("INFORMATION 알림");
                alert.setContentText("안녕?");
                alert.setHeaderText("헤더영역 문자열");
                alert.show();
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
