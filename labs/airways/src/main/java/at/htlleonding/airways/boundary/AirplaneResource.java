package at.htlleonding.airways.boundary;

import at.htlleonding.airways.entity.Airplane;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("airplane")
public class AirplaneResource {

    @POST
    public Response createAirplane(Airplane airplane) {
        return Response.ok().build();
    }


}
