import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class practiseapi {
	
	@Test
	public void Test1() {
		Response res =RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody().asString());	
	
}
	@Test
	public void Test2() {
		
		baseURI="https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data[1].id",equalTo(8)).
		log().all();
}
	@Test
	public void delete() {
	
		baseURI="https://reqres.in";
		given().
		delete("/api/users?page=2").
		then().statusCode(204).log().all();
	}
}
