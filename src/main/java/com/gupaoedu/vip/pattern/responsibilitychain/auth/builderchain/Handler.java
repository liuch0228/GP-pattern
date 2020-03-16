package com.gupaoedu.vip.pattern.responsibilitychain.auth.builderchain;

import com.gupaoedu.vip.pattern.responsibilitychain.auth.Member;

public abstract class Handler<T> {
    protected Handler<T> nextHandler;
    private void next(Handler<T> handler) {  //这里由protected改为private,不对外暴露
        this.nextHandler = handler;
    }

    // 抽象方法，每个具体的handler处理一种验证
    public abstract void doHandler(Member member);

    protected static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> add(Handler<T> handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            // 设置当前handler的下一个过滤器节点
            this.tail.next(handler);
            // 将过滤器链的tail移动到刚添加的新过滤链节点，也就是add方法的入参
            this.tail = handler;
            return this;
        }

        public Handler<T> build() {
            return this.head; // 返回过滤器链的头部节点
        }
    }

}
