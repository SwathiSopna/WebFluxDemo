package com.example.spring5example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import io.netty.util.internal.ThreadLocalRandom;
import reactor.core.publisher.Flux;

public class StockGenerator {
	 public  static Flux<Integer> fluxAll(){
		    int min=356;
		    int max=456;
		        System.out.println("The Stock values of ABC Ltd. are as follows:");
		        System.out.println("************************************************");
		        Flux<Integer> flux=Flux.interval(Duration.ofSeconds(1)).map(n-> ThreadLocalRandom.current().nextInt(min, max) );        
		        return  flux;
		    }
		    public  static List<Integer> ListAll(){
		        int min=356;
		        int max=456;
		        System.out.println("The Stock values of ABC Ltd. are as follows:");
		        System.out.println("************************************************");  
		        List<Integer> listStock = new ArrayList<Integer>();
		        for(int i=0;i<=20;i++)
		        {
		            listStock.add(ThreadLocalRandom.current().nextInt(min, max));
		        }
		            return  listStock; 
		        }

}
