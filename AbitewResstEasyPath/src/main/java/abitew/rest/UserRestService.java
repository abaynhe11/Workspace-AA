package abitew.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserRestService {

	@GET
	public Response getUser() {

		return Response.status(200).entity("getUser is called").build();

	}

	@GET
	@Path("/vip")
	public Response getUserVIP() {

		return Response.status(200).entity("getUserVIP is called").build();

		
	}
	
	
	@GET
	@Path("{name}")
	
	public Response getUserByName(@PathParam("name") String name){
		
		return Response.status(200)
				.entity("the user name is :" + name).build();
		
	}
	
	@GET
	@Path("{id :  \\d+}")
	public Response getUserById(@PathParam("id") int id) {
		
		return Response.status(200). entity("the id number is : " + id).build();
		
	}
}
