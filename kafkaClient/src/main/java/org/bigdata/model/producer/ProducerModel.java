package org.bigdata.model.producer;

import javafx.beans.property.StringProperty;

public class ProducerModel {
	private StringProperty topicName;
	private StringProperty bootstrapServers;
	private StringProperty acks;
	private StringProperty retries;
	private StringProperty batchSize;
	private StringProperty lingerMs;
	private StringProperty bufferMemory;
	private StringProperty keySerializer;
	private StringProperty valueSerializer;
	
	public final StringProperty topicNameProperty() {
		return this.topicName;
	}
	
	public final String getTopicName() {
		return this.topicNameProperty().get();
	}
	
	public final void setTopicName(final String topicName) {
		this.topicNameProperty().set(topicName);
	}
	
	public final StringProperty bootstrapServersProperty() {
		return this.bootstrapServers;
	}
	
	public final String getBootstrapServers() {
		return this.bootstrapServersProperty().get();
	}
	
	public final void setBootstrapServers(final String bootstrapServers) {
		this.bootstrapServersProperty().set(bootstrapServers);
	}
	
	public final StringProperty acksProperty() {
		return this.acks;
	}
	
	public final String getAcks() {
		return this.acksProperty().get();
	}
	
	public final void setAcks(final String acks) {
		this.acksProperty().set(acks);
	}
	
	public final StringProperty retriesProperty() {
		return this.retries;
	}
	
	public final String getRetries() {
		return this.retriesProperty().get();
	}
	
	public final void setRetries(final String retries) {
		this.retriesProperty().set(retries);
	}
	
	public final StringProperty batchSizeProperty() {
		return this.batchSize;
	}
	
	public final String getBatchSize() {
		return this.batchSizeProperty().get();
	}
	
	public final void setBatchSize(final String batchSize) {
		this.batchSizeProperty().set(batchSize);
	}
	
	public final StringProperty lingerMsProperty() {
		return this.lingerMs;
	}
	
	public final String getLingerMs() {
		return this.lingerMsProperty().get();
	}
	
	public final void setLingerMs(final String lingerMs) {
		this.lingerMsProperty().set(lingerMs);
	}
	
	public final StringProperty bufferMemoryProperty() {
		return this.bufferMemory;
	}
	
	public final String getBufferMemory() {
		return this.bufferMemoryProperty().get();
	}
	
	public final void setBufferMemory(final String bufferMemory) {
		this.bufferMemoryProperty().set(bufferMemory);
	}
	
	public final StringProperty keySerializerProperty() {
		return this.keySerializer;
	}
	
	public final String getKeySerializer() {
		return this.keySerializerProperty().get();
	}
	
	public final void setKeySerializer(final String keySerializer) {
		this.keySerializerProperty().set(keySerializer);
	}
	
	public final StringProperty valueSerializerProperty() {
		return this.valueSerializer;
	}
	
	public final String getValueSerializer() {
		return this.valueSerializerProperty().get();
	}
	
	public final void setValueSerializer(final String valueSerializer) {
		this.valueSerializerProperty().set(valueSerializer);
	}
	
	
	
}
