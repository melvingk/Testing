package com.qa.FirstPost;

import org.junit.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

public class FirstPostTest {

	
	private RequestSpecification setup;
	private Response request;
	private ValidatableResponse value;
	
	@Given("^a film exists with the Title Guardians of the Galaxy Two$")
	public void a_film_exists_with_the_Title_Guardians_of_the_Galaxy_Two()  {
		
		setup = RestAssured.given().contentType(ContentType.JSON);
	}

	@When("^a user retrieves the film by the title Guardians of the Galaxy Two$")
	public void a_user_retrieves_the_film_by_the_title_Guardians_of_the_Galaxy_Two()  {
	   
		request  = setup.when().get(Constants.websiteURL);
		
	}

	@Then("^the status code reads (\\d+)$")
	public void the_status_code_reads(int arg1) throws InterruptedException  {
	    //Thread.sleep(500);
		 value = request.then().statusCode(arg1);
	}

	@Given("^a film exists with the Title IT$")
	public void a_film_exists_with_the_Title_IT() {
		
		setup = RestAssured.given().contentType(ContentType.JSON);
	   
	}

	@When("^a user retrieves the film by the title IT$")
	public void a_user_retrieves_the_film_by_the_title_IT() {
		
		request  = setup.when().get(Constants.websiteURL1);
	   
	}

	@Then("^the Rated Field is equal to R$")
	public void the_Rated_Field_is_equal_to_R() {
	     
	value  = request.then().body("Rated",equalTo("R"));
	}

	@Given("^a film exists with the Title \"([^\"]*)\"$")
	public void a_film_exists_with_the_Title(String arg1)  {
	    
		//value = request.then().body("Title",equalTo("arg1"));
		
		setup = RestAssured.given().contentType(ContentType.JSON);
	}

	@When("^a user retrieves the film by the title \"([^\"]*)\"$")
	public void a_user_retrieves_the_film_by_the_title(String arg1){
		
		request  = setup.when().get(arg1);
	    
	}

	@Then("^the Rated Field is equal to \"([^\"]*)\"$")
	public void the_Rated_Field_is_equal_to(String arg1)  {
		
		value = request.then().body("Rated",equalTo(arg1));
	
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@Test
//	public void servreResponse() {
//	    
//		RestAssured.given()
//	        .contentType(ContentType.JSON)
//	    .when()
//        .get("http://www.omdbapi.com/?apikey=c7188f54&t=it")
//	    .then().statusCode(200)
//	    ;
//	}
//
//	@Test
//	public void titleAndClassification () {
//	RestAssured.given()
//		.contentType(ContentType.JSON)
//	.when()
//			.get("http://www.omdbapi.com/?apikey=c7188f54&t=it")
//	.then().body("Title",equalTo("It")).body("Rated", equalTo("R"));
//		
//}
//}
