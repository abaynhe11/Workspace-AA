package abitew.rest;

import java.io.File;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/image")
public class ImageService {

	private static final String FILE_PATH = "c:\\temp\\abitew.jpg";

	@GET
	@Path("/get")
	@Produces("image/jpg")
	public Response getFile() {

		File file = new File(FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=abitew.jpg");
		return response.build();

	}

}
