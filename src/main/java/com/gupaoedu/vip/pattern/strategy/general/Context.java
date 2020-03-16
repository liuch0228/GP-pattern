package com.gupaoedu.vip.pattern.strategy.general;


/**
 * 策略模式上下文，持有策略接口(静态代理)
 * 根据用户传入的具体策略，调用具体策略的具体算法，这里传入的是接口，而不是实现
 */
public class Context {
  private IStrategy strategy;
  public Context(IStrategy strategy){
      this.strategy = strategy;
  }

  public void algorithim(){
      this.strategy.algorithim();
  }
}
