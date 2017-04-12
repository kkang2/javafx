package org.bigdata.model.config;

public class KafkaConnectionModel {
	private String clusterName;
	private String kafkaVersion;
	private String zookeeperHost;
	
	public KafkaConnectionModel() {}
	
	public KafkaConnectionModel(String clusterName, String kafkaVersion, String zookeeperHost) {
		this.clusterName = clusterName;
		this.kafkaVersion = kafkaVersion;
		this.zookeeperHost = zookeeperHost;
	}

	public String getClusterName() {
		return clusterName;
	}
	
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	
	public String getKafkaVersion() {
		return kafkaVersion;
	}
	
	public void setKafkaVersion(String kafkaVersion) {
		this.kafkaVersion = kafkaVersion;
	}
	
	public String getZookeeperHost() {
		return zookeeperHost;
	}
	
	public void setZookeeperHost(String zookeeperHost) {
		this.zookeeperHost = zookeeperHost;
	}	
}
