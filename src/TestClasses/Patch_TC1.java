package TestClasses;

import java.time.LocalDateTime;

import org.testng.Assert;

import Common_API_method.PostCreate_API;
import Repository.Post_Create_Repo;
import io.restassured.path.json.JsonPath;

public class Patch_TC1 

{
 
	public static void extractor() {
 
 {
	int statuscode = PostCreate_API.ResponseStatusCode(Post_Create_Repo.BaseURI(),
			Post_Create_Repo.Post_Resource(),Post_Create_Repo.Post_ReqBody());
	        System.out.println(statuscode);
	        
	
	String ResponseBody = PostCreate_API.ResponseBody(Post_Create_Repo.BaseURI(),
			Post_Create_Repo.Post_Resource(),Post_Create_Repo.Post_ReqBody());
	System.out.println(ResponseBody);
	
	//expected RequestBody
	
	JsonPath req_body = new JsonPath (Post_Create_Repo.Post_ReqBody());
	String req_name  = req_body.getString("name");
	String req_job = req_body.getString("job");
	
	
	LocalDateTime currentdate = LocalDateTime.now();
	String Expecteddate = currentdate.toString().substring(0,11);
	
	
	
	//validating Response body
	JsonPath res_body = new JsonPath (ResponseBody);
	String res_name  = res_body.getString("name");
	String res_job = res_body.getString("job");
	
	
	Assert.assertEquals(req_name, res_name);
	Assert.assertEquals(req_job,res_job);
	
	
	
	
	
	
			
			
			
	 
 }


}


	
}



