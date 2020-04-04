package soundsystem;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class CDPlayerTest {

    @Test
    public void play() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
    }
}