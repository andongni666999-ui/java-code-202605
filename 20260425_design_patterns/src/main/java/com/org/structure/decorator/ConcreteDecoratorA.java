package com.org.structure.decorator;

// 具体的装饰器类，继承抽象装饰器类，并实现增强逻辑。
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    // 先调用被装饰对象的同名方法，然后添加新的行为。
    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorA is adding new behavior...");
    }

}
