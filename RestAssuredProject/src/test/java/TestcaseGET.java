/*
 * import org.testng.Assert; import org.testng.annotations.Test;
 * 
 * import static io.restassured.RestAssured.*; import
 * io.restassured.response.Response; import static
 * io.restassured.matcher.RestAssuredMatchers.*; import static
 * org.hamcrest.Matchers.*;
 * 
 * import org.json.simple.JSONObject;
 * 
 * public class TestcaseGET {
 * 
 * 
 * //@Test
 * 
 * public void TC01() { Response response =
 * RestAssured.get("https://reqres.in/api/users?page=2");
 * System.out.println(response.getStatusCode());
 * System.out.println(response.getTime());
 * System.out.println(response.getBody());
 * System.out.println(response.getBody().asString());
 * System.out.println(response.getHeader("content-type"));
 * Assert.assertEquals(response.getStatusCode(), 201);
 * 
 * }s
 * 
 * 
 * 
 * @Test public void TC02() {
 * 
 * given() .get("https://reqres.in/api/users?page=2"). then(). statusCode(200);
 * }
 * 
 * @Test
 * 
 * public void TC03() { JSONObject obj = new JSONObject(); obj.put("name",
 * "liki"); obj.put("job", "mammu"); given().body(obj.toJSONString()).
 * when().post("https://reqres.in/api/users"). then().statusCode(200);
 * 
 * }
 * 
 * }
 */