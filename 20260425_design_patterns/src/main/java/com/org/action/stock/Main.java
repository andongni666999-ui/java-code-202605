package com.org.action.stock;

public class Main {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Investor investor1 = new Investor("投资者A");
        Investor investor2 = new Investor("投资者B");

        // 订阅股票价格变化事件
        eventBus.subscribe("AAPL", investor1);
        eventBus.subscribe("AAPL", investor2);

        Stock stock = new Stock();
        stock.stockPriceChanged(21.5);
        eventBus.publish("AAPL", 22.2);

        // 取消订阅股票价格变化事件
        eventBus.unsubscribe("AAPL", investor1);

        // 再次发布股票价格变化事件
        stock.stockPriceChanged(21.5);
    }
}
