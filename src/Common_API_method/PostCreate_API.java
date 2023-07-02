package Common_API_method;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
public class PostCreate_API 

{
	public static int ResponseStatusCode (String BaseURI , String Resource ,String RequsetBody ) 
	
	{
		RestAssured.baseURI = BaseURI;
		int statusCode = given().header("content-type", "application/json").body(RequsetBody).when().post(Resource)
				.then().extract().statusCode();
		return statusCode ;
		
	}
	
	public static String ResponseBody (String BaseURI,String Resource , String RequestBody)
	{
		RestAssured.baseURI = BaseURI;
		
		String ResponseBody = given().header("content-type", "application/json").body(RequestBody).when().post(Resource)
				.then().extract().response().asPrettyString();
		return ResponseBody;
		
		
	}
	

}
