package com.org.structure.bridgePattern;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    // 请记住这里的方法名字不同，他们不需要实现相同的接口，他可以独立变化
    @Override
    void operation() {
        implementor.operationImpl();
    }

}
