package com.patrick.service;

/**
 * @author patrick
 * @date 2021/2/14 11:58 上午
 * @Des 微信支付
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class WxPayService implements PayService{

    public WxPayService() {
        System.out.println("微信支付");
    }

    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
