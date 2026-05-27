package com.org.structure.adapter.classType;

// 适配器
// 使用继承来实现适配的能力
public class ClassAdapter extends Adaptee implements Target{


    @Override
    public void request() {
        super.specificRequest();
    }
}
