package com.example.spring5example.model;

import java.util.List;

public class FeaturesRes {
	
	private String name;
	private List<Configuration> configuration;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Configuration> getConfiguration() {
		return configuration;
	}
	public void setConfiguration(List<Configuration> configuration) {
		this.configuration = configuration;
	}
	@Override
	public String toString() {
		return "FeaturesRes [name=" + name + ", configuration=" + configuration + "]";
	}

	
	
}
