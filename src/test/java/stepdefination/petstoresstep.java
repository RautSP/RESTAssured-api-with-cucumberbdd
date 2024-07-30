package stepdefination;

import java.io.File;
import java.io.FileNotFoundException;

import helper.helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;




public class petstoresstep extends helper {
	
	
	File f=new File("C:\\Users\\Admin\\workspace-mohini\\apiwithrestassuredcucumberbdd\\src\\test\\resources\\json\\pet.json");
	RequestSpecification res;
	String response;
	
	
	@Given("create request using payload")
	public void create_request_using_payload() throws FileNotFoundException {
		res=given().spec(requestData()).body(f);
	   
	}

	
	@When("add pet to the store")
	public void add_pet_to_the_store() {
		res.when().post();
	    
	}
	@Then("verify status code")
	public void verify_status_code() {
	  res.then().statusCode(200);
	  System.out.println(response);
	}
	@Then("verify id")
	public void verify_id() {
	   
	}

}
