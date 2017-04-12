package org.bigdata.model.config;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "connections")
public class KafkaConnectionListModel {
	private List<KafkaConnectionModel> connections;

	@XmlElement(name = "connection")
	public List<KafkaConnectionModel> getConnections() {
		return connections;
	}

	public void setConnections(List<KafkaConnectionModel> connections) {
		this.connections = connections;
	}
}