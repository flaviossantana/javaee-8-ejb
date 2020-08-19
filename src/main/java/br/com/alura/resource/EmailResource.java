package br.com.alura.resource;

import br.com.alura.business.EmailBusiness;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/email")
public class EmailResource {

    @Inject
    private EmailBusiness emailBusiness;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response todos(){
        return Response.ok(emailBusiness.todos()).build();
    }

}
