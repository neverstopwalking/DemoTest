package consumer;

import interfaces.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhouzhongjian
 * @date 2019-07-24 19:57
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-dubbo-consumer.xml");
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.printHello());


    }
}
