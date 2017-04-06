package dialog;

import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TextInputDialogAlert extends Application {
	@Override
	public void start(Stage stage) throws Exception {
        stage.setTitle("TextInput Dialog 테스트!");
         
        // 버튼 만들기.
        Button btn = new Button();
        btn.setText("TextInput Dialog 보이기");
        
        btn.setOnAction(new EventHandler<ActionEvent>() { // 버튼 눌렀을 때 실행됨.
            public void handle(ActionEvent arg0) {
            	TextInputDialog dialog = new TextInputDialog("이름을 입력해주세요!");

            	dialog.setTitle("CONFIRMATION 알림");
            	dialog.setHeaderText("헤더영역 문자열");
            	dialog.setContentText("OK/Cancel 선택하세요.");
                
                Optional<String> result = dialog.showAndWait();
                
                if (result.isPresent()) {
                    System.out.println("Your name: " + result.get());
                }
                
                result.ifPresent(name -> System.out.println("Your name: " + name));
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
