package com.org.action.stock;


// 用于表示订阅者（投资者）
public interface Subscriber {

    void onStockPriceChanged(String stockSymbol, double newPrice);

}
