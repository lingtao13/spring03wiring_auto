package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2020/3/23 14:56
 **/
@Component
public class SgtPeppers implements CompactDiskone {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
