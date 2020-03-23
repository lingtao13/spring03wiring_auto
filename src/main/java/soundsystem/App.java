package soundsystem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lingtao on 2020/3/22 23:31
 **/
@ComponentScan
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        logger.info("nothing");
    }
}
