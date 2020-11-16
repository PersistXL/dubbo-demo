package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService;

/**
 * @author lixinli
 * @date 2020/11/15 20:52
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
