import com.ofpay.test.DemoProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: hanwei
 * Date: 13-10-24
 * Time: 下午10:44
 * To change this template use File | Settings | File Templates.
 */
public class TestComsumer {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"appContext.xml"});
        context.start();

        DemoProvider demoProvider = (DemoProvider)context.getBean("demoProvider"); // 获取远程服务代理
        String hello = demoProvider.doTest(); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
    }
}
