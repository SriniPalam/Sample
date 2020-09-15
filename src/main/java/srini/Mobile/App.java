package srini.Mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //====================================
       // Iphone s6 = new Iphone();
       // s6.config();
        
        //===========================
        
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Iphone x = factory.getBean(Iphone.class);
        x.config();
    }
}
