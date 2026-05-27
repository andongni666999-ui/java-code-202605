package com.org.structure.adapter.object;

import com.org.structure.adapter.classType.Target;

// 适配器
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
