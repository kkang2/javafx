package org.bigdata.util;

import java.io.File;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.bigdata.model.config.KafkaConnectionListModel;
import org.bigdata.model.config.KafkaConnectionModel;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class JAXBUtil {
	/**
	 * @param title 다이얼로그창 최상단 문자열
	 * @param headerText 다이얼로그창 헤더부분 문자열
	 * @param contentText 다이얼로그창 본문 문자열
	 */
	public static Object loadDataFromFile(File configFile, Class instanceClass) {
		Object resultObj = null;
		
		try {
	        JAXBContext context 	= JAXBContext.newInstance(instanceClass);
	        Unmarshaller umObj 	= context.createUnmarshaller();

	        resultObj = umObj.unmarshal(configFile);
	    } catch (Exception e) { // 예외를 잡는다
	        Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Error");
	        alert.setHeaderText("Could not load data");
	        alert.setContentText("Could not load data from file:\n" + configFile.getPath());

	        alert.showAndWait();
	    }
		
		return resultObj;
	}
	
	/**
	 *
	 * @param marshalObj
	 * @param configFile
	 * @param instanceClass
	 */
	public static void savePersonDataToFile(Object marshalObj, File configFile, Class instanceClass) {
	    try {
	        JAXBContext context 	= JAXBContext.newInstance(instanceClass);
	        Marshaller mObj 		= context.createMarshaller();
	        
	        mObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	        // 마샬링 후 XML을 파일에 저장한다.
	        mObj.marshal(marshalObj, configFile);
	    } catch (Exception e) { // 예외를 잡는다.
	        Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Error");
	        alert.setHeaderText("Could not save data");
	        alert.setContentText("Could not save data to file:\n" + configFile.getPath());

	        alert.showAndWait();
	    }
	}
	
	public static void main(String[] args) {
		KafkaConnectionListModel listModel	= new KafkaConnectionListModel();
		
		listModel.setConnections(
			Arrays.asList(
				new KafkaConnectionModel("cluster1", "1.0", "zookeeper hosts1"),
				new KafkaConnectionModel("cluster2", "1.1", "zookeeper hosts2"),
				new KafkaConnectionModel("cluster3", "1.2", "zookeeper hosts3"),
				new KafkaConnectionModel("cluster4", "1.3", "zookeeper hosts4"),
				new KafkaConnectionModel("cluster5", "1.4", "zookeeper hosts5"),
				new KafkaConnectionModel("cluster6", "1.5", "zookeeper hosts6")
			)
		);
		
		savePersonDataToFile(listModel, FileUtil.createFile(FileUtil.getPathObj("config.xml")).toFile(), KafkaConnectionListModel.class);
	}
}
