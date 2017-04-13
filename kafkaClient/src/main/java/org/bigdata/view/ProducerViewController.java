package org.bigdata.view;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.bigdata.util.DialogUtil;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProducerViewController {
	@FXML
    private Label topicNameLabel;
	@FXML
	private Label bootstrapServersLabel;
	@FXML
	private Label acksLabel;
	@FXML
	private Label retriesLabel;
	@FXML
	private Label batchSizeLabel;
	@FXML
	private Label lingerMsLabel;
	@FXML
	private Label bufferMemoryLabel;
	@FXML
	private Label keySerializerLabel;
	@FXML
	private Label valueSerializerLabel;
	
	@FXML
	private TextField topicNameTF;
	@FXML
	private TextField bootstrapServersTF;
	@FXML
	private TextField acksTF;
	@FXML
	private TextField retriesTF;
	@FXML
	private TextField batchSizeTF;
	@FXML
	private TextField lingerMsTF;
	@FXML
	private TextField bufferMemoryTF;
	@FXML
	private TextField keySerializerTF;
	@FXML
	private TextField valueSerializerTF;
	
	@FXML
	private TextArea sendDataTA;
	
	@FXML
	private Button sendBtn;
	
	/**
     * 컨트롤러 클래스를 초기화한다.
     * fxml 파일이 로드되고 나서 자동으로 호출된다.
     */
    @FXML
    private void initialize() {
    	System.out.println(bootstrapServersTF.getText());
    }
    
    @FXML
    private void sendMsg() {
    	String sendData	= sendDataTA.getText();
    	Properties props	= new Properties();
    	
    	if(sendData.trim().length() == 0) {
    		DialogUtil.createInformationDialog("정보", null, "데이터를 입력해 주세요.").showAndWait();
    		
    		return;
    	}
    	
    	//Assign localhost id
    	props.put("bootstrap.servers", bootstrapServersTF.getText());
    	 
    	//Set acknowledgements for producer requests.
	    props.put("acks", acksTF.getText());
	      
	    //If the request fails, the producer can automatically retry,
	    props.put("retries", retriesTF.getText());
	      
	    //Specify buffer size in config
	    props.put("batch.size", batchSizeTF.getText());
	      
	    //Reduce the no of requests less than 0   
	    props.put("linger.ms", lingerMsTF.getText());
	      
	    //The buffer.memory controls the total amount of memory available to the producer for buffering.   
	    props.put("buffer.memory", bufferMemoryTF.getText());
	      
	    props.put("key.serializer", keySerializerTF.getText());
	         
	    props.put("value.serializer", valueSerializerTF.getText());
	      
	    Producer<String, String> producer = new KafkaProducer<String, String>(props);
	     
	    producer.send(new ProducerRecord<String, String>(topicNameTF.getText(), System.currentTimeMillis() + "", sendData));
    }
}
