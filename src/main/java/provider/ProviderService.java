package provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhouzhongjian
 * @date 2019-07-24 19:57
 */
public class ProviderService {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-dubbo-provider.xml");
        context.start();
        System.in.read();
    }


}
