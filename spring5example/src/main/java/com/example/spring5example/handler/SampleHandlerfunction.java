package com.example.spring5example.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.spring5example.model.Arrangements;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class SampleHandlerfunction {
	
	@Autowired
	private GetArrangementMapping getArrangementMapping;
	
	public Mono<ServerResponse> flux(ServerRequest req){
		/*return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(Flux.just(1,2,3,4).log(),Integer.class);*/
		String str = "{\"arrangements\":\"123456\",\"experienceId\":\"654321\", \"effectiveTimestamp\":\"2020-2-10\","
				+ "\"issuebundleId\":\"bundle12\",\"bundleId\":\"bundle123\"}";
		return 	ServerResponse.ok()
					.contentType(MediaType.APPLICATION_JSON)
					.body(getArrangementMapping.getArrangements(str),Arrangements.class);
				}
	}


