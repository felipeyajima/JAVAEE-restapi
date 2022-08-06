package br.com.yajima;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class EchoResource {

    @GET
    public String ola(){
        return "opaaa";
    }

}
