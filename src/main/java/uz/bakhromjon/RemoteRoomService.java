package uz.bakhromjon;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/room")
@ApplicationScoped
@RegisterRestClient(configKey = "rest-full")
public interface RemoteRoomService {
    @GET
    List<Room> getAllRooms();
}
