package basic;

import javafx.application.Application;
import javafx.stage.Stage;

/*
 * javafx 에서 각 부분을 실행하는 쓰레드 정보 출력 
 **/
public class ThreadInfo extends Application {

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread() + " : init()");
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread() + " : start()");
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread() + " : stop()");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " : main()");
		launch(args);
	}
}
