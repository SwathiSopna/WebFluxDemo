package com.example.spring5example.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import com.example.spring5example.handler.SampleHandlerfunction;

@Configuration
public class RouterConfig {

	@Bean
	public RouterFunction<ServerResponse> route(SampleHandlerfunction handlerFunction){
		return RouterFunctions.route(GET("/functional/flux").and(accept(MediaType.APPLICATION_JSON)),handlerFunction::flux);
	}
	
	
}
