package org.bigdata.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DialogUtil {
	/**
	 * @param title 다이얼로그창 최상단 문자열
	 * @param headerText 다이얼로그창 헤더부분 문자열
	 * @param contentText 다이얼로그창 본문 문자열
	 */
	public static Alert createInformationDialog(String title, String headerText, String contentText) {
		Alert alert = new Alert(AlertType.INFORMATION);
		
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(contentText);
		
		return alert;
	}
	
	public static void main(String[] args) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText("Look, an Information Dialog");
		alert.setContentText("I have a great message for you!");

		alert.showAndWait();
	}

}
