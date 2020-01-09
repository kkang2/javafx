package control.label;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ImageLabel extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("HBox Experiment 1");

        FileInputStream input = new FileInputStream("resources/images/address_book_icon.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        Label label = new Label("My Label", imageView);

        Scene scene = new Scene(label, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}