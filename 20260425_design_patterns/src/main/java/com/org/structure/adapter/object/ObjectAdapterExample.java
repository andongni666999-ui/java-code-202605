package com.org.structure.adapter.object;

public class ObjectAdapterExample {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ObjectAdapter target = new ObjectAdapter(adaptee);
        target.request();
    }


}
