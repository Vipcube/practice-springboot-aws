package org.vipcube.spring.function.lambda;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;

@SpringBootApplication
public class LambdaJpaApplication {
	public static void main( String[] args ){
		FunctionalSpringApplication.run( LambdaJpaApplication.class, args );
	}
}
