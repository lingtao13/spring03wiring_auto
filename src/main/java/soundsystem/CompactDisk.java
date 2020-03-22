package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by lingtao on 2020/3/22 23:25
 **/

@Component
public class CompactDisk {

    public CompactDisk() {
        super();
        System.out.println("CompactDisk无参构造函数");
    }

    public void play(){
        System.out.println("正在播放音乐");
    }

}
