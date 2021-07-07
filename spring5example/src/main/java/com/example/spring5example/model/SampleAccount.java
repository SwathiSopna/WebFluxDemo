package com.example.spring5example.model;

public class SampleAccount {
   private String id;
   private String issuebundleId;
	private String bundleId;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getIssuebundleId() {
	return issuebundleId;
}

public void setIssuebundleId(String issuebundleId) {
	this.issuebundleId = issuebundleId;
}

public String getBundleId() {
	return bundleId;
}

public void setBundleId(String bundleId) {
	this.bundleId = bundleId;
}

@Override
public String toString() {
	return "SampleAccount [id=" + id + ", issuebundleId=" + issuebundleId + ", bundleId=" + bundleId + "]";
}
   
   
   
}
