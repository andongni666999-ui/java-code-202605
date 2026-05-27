package com.org.structure.proxy.virtualProxy;

public class Client {

    public static void main(String[] args) {
        Image virtualImageProxy = new VirtualImageProxy("https://example.com/large-image.jpg");

        System.out.println("Image will not be loaded until it is displayed.");

        // 调用 display() 方法时，才会创建并加载大型图片
        virtualImageProxy.display();
    }

}
