package serivce.impl;

import serivce.intf.IHelloService;

/**
 * @author xinjian.ye
 * @date 2019/1/7
 */
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHi(String name) {
        return "Hi, " + name;
    }
}
