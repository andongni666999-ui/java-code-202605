package com.org.structure.proxy.virtualProxy;

public class LargeImage  implements Image {
    private final String imageUrl;

    public LargeImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadImageFromNetwork();
    }

    private void loadImageFromNetwork() {
        System.out.println("Loading image from network: " + imageUrl);
        // 真实的图像加载逻辑...
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageUrl);
    }

}
