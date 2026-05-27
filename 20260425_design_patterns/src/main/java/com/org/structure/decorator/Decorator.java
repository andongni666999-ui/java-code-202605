package com.org.structure.decorator;


// 抽象装饰器类，继承基类，并将被装饰对象作为属性。
public abstract class Decorator implements Component {

    // 组合的形式进行装设
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

}
