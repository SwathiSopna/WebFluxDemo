package com.example.spring5example.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring5example.model.AccountArrangements;
import com.example.spring5example.model.Arrangements;
import com.example.spring5example.model.Features;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import reactor.core.scheduler.Schedulers;

@Component
public class GetArrangementMapping {

	@SuppressWarnings("deprecation")
	public Arrangements getArrangements(String str) {
		
		JsonObject g = new Gson().fromJson(str,JsonObject.class);	
		String arrgements = g.get("arrangements").toString();
		String experience = g.get("experienceId").toString();
		String effective = g.get("effectiveTimestamp").toString();
		String issuebundleId = g.get("issuebundleId").toString();
		
		
		String bundleId = g.get("bundleId").toString();
		//System.out.println("ssfs"+ error + develop);
		Arrangements arrangements = new Arrangements();
		List<AccountArrangements> list = new ArrayList<>();
		AccountArrangements accountArrangements = new AccountArrangements();
		accountArrangements.setArrangements(arrgements);
		accountArrangements.setExperienceId(experience);
		accountArrangements.setEffectiveTimestamp(effective);
		List<Features> features = new ArrayList<>();
		Features feature = new Features();
		feature.setIssuebundleId(issuebundleId);
		feature.setBundleId(bundleId);
		features.add(feature);
		accountArrangements.setFeatures(features);
		list.add(accountArrangements);
		arrangements.setArrangements(list);
		return arrangements;
		
	}
	
}
