package com.org.structure.proxy.virtualProxy;

public class VirtualImageProxy  implements Image {
    private final String imageUrl;
    private LargeImage largeImage;

    public VirtualImageProxy(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        if (largeImage == null) {
            largeImage = new LargeImage(imageUrl);
        }
        largeImage.display();
    }

}
