package lt.robot;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/")
public class API {

    @Path("helloworld")
    @GET
    public String helloWorld(){
        return "HelloWorld";
    }
}