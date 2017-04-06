package dialog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ChoiceDialogAlert extends Application {
	@Override
	public void start(Stage stage) throws Exception {
        stage.setTitle("Choice Dialog 테스트!");
         
        // 버튼 만들기.
        Button btn = new Button();
        btn.setText("Choice Dialog 보이기");
        
        btn.setOnAction(new EventHandler<ActionEvent>() { // 버튼 눌렀을 때 실행됨.
            public void handle(ActionEvent arg0) {
            	List<String> choices = new ArrayList<>();
            	choices.add("a");
            	choices.add("b");
            	choices.add("c");

            	ChoiceDialog<String> dialog = new ChoiceDialog<>("b", choices);
            	
            	dialog.setTitle("Choice Dialog");
            	dialog.setHeaderText("Look, a Choice Dialog");
            	dialog.setContentText("Choose your letter:");

            	// 응답 값을 얻는 전통적인 방법
            	Optional<String> result = dialog.showAndWait();
            	
            	if (result.isPresent()){
            	    System.out.println("Your choice: " + result.get());
            	}

            	// 응답 값을 얻는 Java 8의 방법(람다식)
            	result.ifPresent(letter -> System.out.println("Your choice: " + letter));
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
