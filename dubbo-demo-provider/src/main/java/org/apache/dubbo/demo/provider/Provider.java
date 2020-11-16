package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author lixinli
 * @date 2020/11/15 21:00
 */
public class Provider {
    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:/yonyou/ideaProject/yuncai/dubbo-demo/dubbo-demo-provider/src/main/resources/provider.xml");
        context.start();
        System.out.println("Provider started.");
        DemoService demoService = (DemoService)context.getBean("providerService");
        System.out.println(demoService.sayHello("hea"));
        System.in.read(); // press any key to exit
    }
}
