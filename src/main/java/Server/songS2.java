package Server;

import org.springframework.stereotype.Component;

@Component(value = "song3")
public class songS2 implements ImpServer.Song {
    @Override
    public void pring() {
        System.out.println("gong");
    }
}
