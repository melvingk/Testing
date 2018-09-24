package com.qa.SwaggerUITest;

import org.junit.*;


import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class SwaggerTest {
	
	
	private RequestSpecification setup;
	private Response request;
	private ValidatableResponse value;
	
	@Ignore
	@Test
	public void test()	{
		setup = given().contentType(ContentType.JSON);
		request  = setup.when().get(SwaggerConstant.websiteURL + SwaggerConstant.getRequest);
		System.out.println(request.asString());
	}

	//@Ignore
	@Test 
	public void test2() {
		
		JSONObject values = new JSONObject();
		
		values.put("city", "Manchester");
		values.put("description", "HElooooo");
//		values.put("id", 45 );
		values.put("name", "Bloop");
		values.put("rating", 3 );
		
		baseURI = SwaggerConstant.websiteURL;
		setup= given().header("Content-Type", "application/json").body(values.toString());
		request = setup.when().post();
		value = request.then().statusCode(201);
		
	}

}




//"city": "string",
//"description": "string",
//"id": 0,
//"name": "string",
//"rating": 0