package org.vipcube.spring.function.lambda.function;

import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Slf4j
@Component
public class S3Trigger implements Function<S3Event, S3Event> {
	private final AmazonS3 amazonS3;

	public S3Trigger( AmazonS3 amazonS3 ) {
		this.amazonS3 = amazonS3;
	}

	@Override
	public S3Event apply( S3Event s3Event ) {
		s3Event.getRecords().forEach( record -> {
			String s3Key = record.getS3()
					.getObject()
					.getKey();
			String s3Bucket = record.getS3()
					.getBucket()
					.getName();
			log.info( "Received record with bucket: {}  and key:  {}", s3Bucket, s3Key );

			S3Object object = amazonS3.getObject( new GetObjectRequest( s3Bucket, s3Key ) );
			log.info( "Retrieved s3 object: {} ", object );
		} );
		return s3Event;
	}
}
