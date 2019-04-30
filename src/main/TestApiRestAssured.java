package main;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.http.ContentType;

public class TestApiRestAssured {
	@Test
	public void TesteApi() {
		String uriBase = "https://jsonplaceholder.typicode.com";
		
		given().relaxedHTTPSValidation()
		.param("id", "1")
	.when()
		.get(uriBase)
	.then()
		.statusCode(200) // O status http retornado foi 200
		.contentType(ContentType.JSON) // O response foi retornado no formato JSON
		.contentType(ContentType.JSON) // O response foi retornado no formato JSON
		.body("args.foo1", containsString("bar"));
	}

}
