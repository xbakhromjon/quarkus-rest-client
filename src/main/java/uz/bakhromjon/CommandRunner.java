package uz.bakhromjon;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import java.util.List;

@QuarkusMain
public class CommandRunner implements QuarkusApplication {
    @Inject
    @RestClient
    RemoteRoomService remoteRoomService;
    @Override
    public int run(String... args) throws Exception {
        List<Room> allRooms = remoteRoomService.getAllRooms();
        System.out.println(allRooms);
        return 0;
    }
}
