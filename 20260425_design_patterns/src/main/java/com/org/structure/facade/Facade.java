package com.org.structure.facade;

import com.org.structure.facade.external.ExternalService;
import com.org.structure.facade.external.ExternalServiceImpl1;
import com.org.structure.facade.external.ExternalServiceImpl2;

// 门面类
public class Facade {

    private ExternalService service1;
    private ExternalService service2;

    public Facade() {
        service1 = new ExternalServiceImpl1();
        service2 = new ExternalServiceImpl2();
    }

    public void doSomething1() {
        service1.doSomething();
    }

    public void doSomething2() {
        service2.doSomething();
    }

}
