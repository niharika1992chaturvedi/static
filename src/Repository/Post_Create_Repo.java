package Repository;

public class Post_Create_Repo 
{ 
	public static String BaseURI() 
	{
		String baseuri = "https://reqres.in" ;
		return baseuri;
		
	}

    public static String Post_Resource() 
    {
    	String Post_resource = "/api/users" ;
		return Post_resource ;
    }
    
    
    public static String Post_ReqBody() 
    {
    	String Req_Body = "{\n"
    			+ "    \"name\": \"morpheus\",\n"
    			+ "    \"job\": \"leader\"\n"
    			+ "}";
		return Req_Body;
    }
    
    
}