package com.example.spring5example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.eclipse.jetty.client.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring5example.model.Configuration;
import com.example.spring5example.model.Features;
import com.example.spring5example.model.FeaturesRes;
import com.example.spring5example.model.PaceResponse;
import com.example.spring5example.model.SampleAccount;
import com.example.spring5example.model.Stock;
import com.sun.el.stream.Optional;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.netty.util.internal.ThreadLocalRandom;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.ParallelFlux;
import reactor.core.scheduler.Schedulers;

/*@RestController

@RequestMapping("/api/stockprice")*/
public class StockController {


public static void main(String a[]) throws ParseException {
	/*@GetMapping( value = "/EDG")

    Flux<Stock> fetchStockPriceEDG() {*/

       /* return Flux

                .interval(Duration.ofSeconds(1))

                .map(l -> new Stock("EDG", ThreadLocalRandom.current().nextInt(160,161)).toString()).log();*/
	    String newVal = new String();
		Stock stock1 = new Stock("123","2340");
		Stock stock2 = new Stock("234","4340");
		Stock stock3 = new Stock("555","4340");
		Flux<Stock> string = Flux.just(stock1,stock2,stock3);
		
		Mono<List<Stock>> list = string.collectList();
		list.subscribe(sto -> {
			Features features = getMappingData(sto);
		   //getFinalMethod(features);
		});
		//Mono<List<Stock>> list = string.collectList();
		/*Mono.from(string).map(lst -> {
			getMappingData(lst)
		})*/
		
		Mono.just(list);
		
		
		Mono<Stock> str = Mono.just(stock1);
		Stock blockVal = str.block();
		
		System.out.println("block Stt"+blockVal.getStockCode());
		
		str.subscribe(strs -> {
			String news= strs.getStockCode();
			getStringMethod(news);
			//newVal = news;
		System.out.println("new Val"+news);
		} );
		
		List<String> strList = Arrays.asList("231","456","678");
		List<Features> featrList = new ArrayList<>();
		Features features = new Features();
		features.setBundleId("516MU");
		features.setIssuebundleId("2314");
		features.setId("231");
		features.setStatus("Pending");
		featrList.add(features);
		
		Features features1 = new Features();
		features1.setBundleId("435MU");
		features1.setIssuebundleId("4563");
		features1.setId("456");
		features1.setStatus("Enrolled");
		featrList.add(features1);
		
		Features features2 = new Features();
		features2.setBundleId("789MU");
		features2.setIssuebundleId("6785");
		features2.setId("678");
		features2.setStatus("Enrolled");
		featrList.add(features2);
		
		Flux<Features> fluxVal = Flux.fromIterable(featrList);
		
		fluxVal
		 .filter(val -> val.getStatus().equalsIgnoreCase("Pending"))
		 .sort()
	    .groupBy(Features::getId)
	    .flatMap(Flux::collectList)
	   
	    .subscribe(System.out::println);
	    
	   

		
		PaceResponse paceRes = new PaceResponse();
		List<Configuration> conList = new ArrayList<>();
		List<Configuration> conList1 = new ArrayList<>();
		Configuration config = new Configuration();
		config.setIdentifier("QLE");
		Configuration config1 = new Configuration();
		config1.setIdentifier("AAB");
		conList.add(config);
		conList1.add(config1);
		List<FeaturesRes> featureList = new ArrayList<>();
		FeaturesRes featurs = new FeaturesRes();
		featurs.setName("PAYMENT-DEVICE");
		featurs.setConfiguration(conList);
		FeaturesRes featurs1 = new FeaturesRes();
		featurs1.setName("MEMBERSHIP");
		featurs1.setConfiguration(conList1);
		featureList.add(featurs);
		featureList.add(featurs1);
		paceRes.setFeatures(featureList);
		paceRes.setIdentifier("123456-b5678");
		
		//Map<Object, Object> map = 
			Map<String, List<Configuration>> mapValue= paceRes.getFeatures().stream()
		.filter(e -> e.getName().equalsIgnoreCase("PAYMENT-DEVICE"))
		.collect(Collectors.toMap(FeaturesRes::getName, FeaturesRes::getConfiguration));
		/*.filter(e-> Objects.nonNull(e.getConfiguration()))
		.flatMap( e-> e.getConfiguration().stream())
		.filter(e -> e.getIdentifier().equalsIgnoreCase("QLE"))*/
		//.findFirst();
		//.collect(Collectors.toMap( PaceResponse::getIdentifier, PaceResponse::getFeatures));
		//.collect(Collectors.toMap( res ->res.getIdentifier(), res -> res.getFeatures()));
		
					 
              
             /* String startDateString = "14/10/2020";
              //LocalDate inputStrings = LocalDate.parse(startDateString);
              DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
              System.out.println(LocalDate.parse(startDateString, formatter1));*/
			
			/*Flux<Integer> valuess = Flux.just(1,2,3,4,5,6,7,8,9,10);
              
              valuess
              .groupBy(k -> k % 3)
              .flatMap(g -> g)
              .subscribe(System.out::println);*/

          

			/*mapValue.entrySet().forEach( e-> {
				e.getValue().stream()
				.filter(e-> Objects.nonNull(e.getConfiguration()))
				.flatMap( e-> e.getConfiguration().stream())
				.filter(e -> e.getIdentifier().equalsIgnoreCase("QLE"))
				
			});*/
		
		/*	mapValue.entrySet().forEach(item -> 
            item.forEach((k, v) -> 
           
            		));*/

	//String	parseCode = "90643229520";
	
	//int val = parseCode.chars().map(i-> i );
	
	 // System.out.println("yutyreut"+val.sum());
		
		//
			
			//Flux<String> integerFlux = Flux.just("Swathi","Jesus","Priya");
			Flux<String> integerFlux = null;
		//ParallelFlux<Integer> monoIn = fluxStr.parallel().runOn(Schedulers.elastic()).map(in ->in*2).flatMap(in);
		
		//monoIn.subscribe(System.out::println);
		/*integerFlux
		.flatMap(flux -> {
			if(flux == null || flux.isEmpty()) {
				Mono.error(new IllegalAccessError("some error message"));
			} else {
				switchOnFirst((signal, flux) -> signal.get() != null && signal.get().equalsIgnoreCase("Jesus") ? flux : Flux.empty())
				.defaultIfEmpty("Jesus is here")
		        .subscribe(System.out::println);
			}
		});*/
			integerFlux.switchOnFirst((signal, flux) -> {
				System.out.println( "signalss"+signal.get());
				if( signal.get().isEmpty() || signal.get() == null ) {
					return Mono.error(new IllegalAccessError("some error message"));
				} else 
				return flux;
			});
		//.switchIfEmpty(Mono.error(new IllegalAccessError("some error message")))
		/*.switchOnFirst((signal, flux) -> {
			if (signal.isOnNext()) {
	            return flux;
	          } else {
	            return Mono.error(new IllegalAccessError("some error message"));
	          }

		})
*/		//signal.get() != null && signal.get().equalsIgnoreCase("Jesus") ? flux : Flux.empty())
        
		
	/*List<SampleAccount>	 lists = featrList.stream().map(feature-> {
			//.filter(e ->Objects.nonNull(e.getBundleId()))
			//.flatMap(strList.stream()).collect(Collectors.toList());
	
	 
		 
			SampleAccount sampleAccount = new SampleAccount();
			for(String st : strList) {
			sampleAccount.setId(st);
			}
			sampleAccount.setBundleId(feature.getBundleId());
			sampleAccount.setIssuebundleId(feature.getIssuebundleId());
			return sampleAccount;
			
		}).collect(Collectors.toList());
	System.out.println("lists1"+lists.get(0).getId());
	System.out.println("lists2"+lists.get(1).getId());	
	System.out.println("lists3"+lists.get(2).getId());*/
		
		/*Map<String,Features> mapValue = IntStream.range(0,strList.size()).boxed().collect(Collectors.toMap(i->strList.get(i), 
				i-> featrList.get(i)));*/
		
		//System.out.println("mapValue"+mapValue);
		List<SampleAccount>	 lists = new ArrayList<>();
		
		 for(String st : strList) {
			 SampleAccount sampleAccount = new SampleAccount();
			 for (Features feature :featrList) {
				if(st.equals(feature.getId())) {
					sampleAccount.setId(feature.getId());
					sampleAccount.setBundleId(feature.getBundleId());
					sampleAccount.setIssuebundleId(feature.getIssuebundleId());
					lists.add(sampleAccount);
				}
				
			 }
			
		 }
		 
		 //System.out.println("lists1"+lists.get(0).getId());
			//System.out.println("lists2"+lists.get(1).getId());	
			//System.out.println("lists3"+lists.get(2).getId());
		 
    }
  

private static void getStringMethod(String news) {
	
	if ( news.equalsIgnoreCase("123") ){
		//System.out.println("Sucess");
	}
	// TODO Auto-generated method stub
	
}

private static void getFinalMethod(Features features) {
	/*System.out.println(features.getBundleId());
	System.out.println(features.getIssuebundleId());*/
	// TODO Auto-generated method stub
	
}



private static  Features getMappingData(List<Stock> sto) {
	// TODO Auto-generated method stub
	/*lst.stream().forEach(entity -> {
		Features feature = new Features();
		feature.setBundleId());
	})*/
	Features feature = new Features();
	sto.stream().forEach(entity -> {
		feature.setBundleId(entity.getStockCode());
		feature.setIssuebundleId(entity.getPrice());
		
	});
	/*System.out.println(feature.getBundleId());
	System.out.println(feature.getIssuebundleId());*/
	return feature;
}
}
