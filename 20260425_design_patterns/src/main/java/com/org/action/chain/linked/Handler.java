package com.org.action.chain.linked;

// 处理器
public abstract class Handler {

    protected Handler next = null;

    public void setSuccessor(Handler successor) {
        this.next = successor;
    }

    public abstract void handle();

}
