package helper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class helper {
	public static RequestSpecification req;

	//here logg files are generated/they are created to seerecords manually
	public RequestSpecification requestData() throws FileNotFoundException
	//public static RequestSpecification req;
	{
		PrintStream ps=new PrintStream(new FileOutputStream("test-output/logging.txt"));
		if(req==null) {
		 req=new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/")
				.addHeader("Content-Type", "application/json")
				.addFilter(RequestLoggingFilter.logRequestTo(ps))
				.addFilter(ResponseLoggingFilter.logResponseTo(ps))
				.build();
		}
		return req;
	
}
}
