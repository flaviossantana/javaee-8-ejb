package br.com.alura.resource;

import br.com.alura.business.EmailBusiness;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.TimeUnit;

@Path("/email")
public class EmailResource {

    @Inject
    private EmailBusiness emailBusiness;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response todos(){
        return Response.ok(emailBusiness.todos()).build();
    }

    @GET
    @Path("http")
    @Produces(MediaType.APPLICATION_JSON)
    public Response http(){

        ClientBuilder clientBuilder = ClientBuilder.newBuilder();
        clientBuilder.connectTimeout(10000, TimeUnit.MILLISECONDS);
        clientBuilder.readTimeout(10000, TimeUnit.MILLISECONDS);

        Client client = clientBuilder.build();

        WebTarget target = client.target("https://run.mocky.io");
        String retorno = target.path("/v3/8349b5f0-1156-4139-9ffa-aa8027111200").request().get(String.class);

        return Response.ok(retorno).build();

    }



}
