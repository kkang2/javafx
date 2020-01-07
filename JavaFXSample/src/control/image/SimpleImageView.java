package control.image;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleImageView extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ImageView Experiment 1");

        FileInputStream input = new FileInputStream("resources/images/poo.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        HBox hbox = new HBox(imageView);

        Scene scene = new Scene(hbox, 500, 330);
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
