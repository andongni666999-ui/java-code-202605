package com.org.action.chain.array;

import com.org.action.chain.linked.Handler;

import java.util.ArrayList;
import java.util.List;

// 使用链表实现
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
