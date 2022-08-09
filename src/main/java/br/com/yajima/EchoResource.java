package br.com.yajima;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.io.IOException;


@Path("/")
public class EchoResource {

    @GET
    public String ola() {

        Person pessoa1 = new Person();
        pessoa1.setName("Felipe");
        pessoa1.setLastName("Batista");
        pessoa1.setGender("male");

        Person pessoa2 = new Person();
        pessoa2.setName("Roger");
        pessoa2.setLastName("Silva");
        pessoa2.setGender("male");

        Person pessoa3 = new Person();
        pessoa3.setName("Maria");
        pessoa3.setLastName("Silva");
        pessoa3.setGender("female");

        ObjectMapper Obj = new ObjectMapper();
        String jsonStr1 = null;
        String jsonStr2 = null;
        String jsonStr3 = null;
        try {
            // Converting the Java object into a JSON string
            jsonStr1 = Obj.writeValueAsString(pessoa1);
            jsonStr2 = Obj.writeValueAsString(pessoa2);
            jsonStr3 = Obj.writeValueAsString(pessoa3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String pessoas = '[' + jsonStr1 + ',' + jsonStr2 + ',' + jsonStr3 + ']';

        return pessoas;
    }

}
