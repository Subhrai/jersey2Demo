package com.socioladder;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class PostExample {
	@GET
	@Path("message")
	@Produces("text/html")
	public Response getStartingPage()
	{
		String output = "<h1>Hello World!<h1>" +
				"<p>RESTful Service is running ... <br>Ping @ " + new Date().toString() + "</p<br>";
		return Response.status(200).entity(output).build();
	}

		@POST
	    @Path("addperson")
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.TEXT_PLAIN)
	    public String createOrSaveBookInfo(TesterPojo empRec) {
	 
	        // get book information from formal arguments and inserts into database & return bookId (primary_key)
			System.out.println("New Book information saved successfully with Book_ID " + empRec.toString());
	        return "New Book information saved successfully with Book_ID " + empRec.toString();
	    }
}
