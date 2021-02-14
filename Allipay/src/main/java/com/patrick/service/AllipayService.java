package com.patrick.service;

/**
 * @author patrick
 * @date 2021/2/14 11:59 上午
 * @Des 阿里支付
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class AllipayService implements PayService {
    public AllipayService() {
        System.out.println("阿里支付");
    }

    @Override
    public void pay() {
        System.out.println("阿里支付");
    }
}
