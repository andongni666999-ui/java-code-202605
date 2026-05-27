package com.org.action.stock;

// 一个具体的订阅者实现
public class Investor implements Subscriber {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    // 股票代号，新价格
    @Override
    public void onStockPriceChanged(String stockSymbol, double newPrice) {
        System.out.println(name + " 收到股票 " + stockSymbol + " 价格变化通知，新价格：" + newPrice);
    }
}
