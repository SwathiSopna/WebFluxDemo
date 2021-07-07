package com.example.spring5example.model;

import java.util.List;

public class AccountArrangements {

	private String arrangements;
	private String experienceId;
	private String effectiveTimestamp;
	private List<Features> features;
	
	public String getArrangements() {
		return arrangements;
	}
	public void setArrangements(String arrangements) {
		this.arrangements = arrangements;
	}
	public String getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}
	public String getEffectiveTimestamp() {
		return effectiveTimestamp;
	}
	public void setEffectiveTimestamp(String effectiveTimestamp) {
		this.effectiveTimestamp = effectiveTimestamp;
	}
	public List<Features> getFeatures() {
		return features;
	}
	public void setFeatures(List<Features> features) {
		this.features = features;
	}
	
	
	
}
