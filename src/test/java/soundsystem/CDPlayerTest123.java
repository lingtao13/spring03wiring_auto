package soundsystem;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class CDPlayerTest123 {

    @Test
    public void testplay() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
    }
}