package com.example.spring5example.model;

import java.util.List;

public class PaceResponse {

	private String identifier;
	private List<FeaturesRes> features;
	
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public List<FeaturesRes> getFeatures() {
		return features;
	}
	public void setFeatures(List<FeaturesRes> features) {
		this.features = features;
	}
	@Override
	public String toString() {
		return "PaceResponse [identifier=" + identifier + ", features=" + features + "]";
	}
	
	
	
}
