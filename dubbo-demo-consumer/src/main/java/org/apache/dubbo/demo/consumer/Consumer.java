package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author lixinli
 * @date 2020/11/15 20:57
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
//        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:/yonyou/ideaProject/yuncai/dubbo-demo/dubbo-demo-consumer/src/main/resources/consumer.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("dubbo");
        // Display the call result
        System.out.println(hello);
    }
}
