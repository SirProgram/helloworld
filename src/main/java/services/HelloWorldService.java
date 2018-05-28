package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloWorldService {

    @GET
    @Path("{name}")
    public Response greetName(@PathParam("name") String name) {
        String responseEntity = "Greetings " + name;

        return Response.status(Response.Status.OK).entity(responseEntity).build();
    }

}
