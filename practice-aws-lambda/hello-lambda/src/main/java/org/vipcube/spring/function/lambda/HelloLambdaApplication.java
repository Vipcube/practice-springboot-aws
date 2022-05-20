package org.vipcube.spring.function.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.vipcube.spring.function.lambda.dto.HelloVO;

import java.util.function.Function;

@SpringBootApplication
public class HelloLambdaApplication {
	public static void main( String[] args ){
		SpringApplication.run( HelloLambdaApplication.class, args );
	}

	@Bean
	public Function<HelloVO, HelloVO> uppercase() {
		return vo -> HelloVO.builder()
				.value( vo.getValue().toUpperCase() )
				.build();
	}
}
