import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: hanwei
 * Date: 13-10-24
 * Time: 下午10:12
 * To change this template use File | Settings | File Templates.
 */
public class TestMian {
    public static void main(String[] args){
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("appContext.xml");
        context.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
