package Server;

import org.springframework.stereotype.Component;

@Component("song2")
public class songS implements ImpServer.Song {
    @Override
    public void pring() {
        System.out.println("motian");
    }
}
