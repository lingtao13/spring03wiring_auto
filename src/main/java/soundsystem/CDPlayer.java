package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lingtao on 2020/3/22 23:28
 **/
@Component
public class CDPlayer {


    private CompactDisk cd;


    public CDPlayer() {
        super();
        System.out.println("CDPlayer无参构造函数");
    }

    @Autowired
    public CDPlayer(CompactDisk cd) {
        this.cd = cd;
        System.out.println("CDPlayer有参构造函数");
    }

    public void play(){
        cd.play();
    }
}
