package com.patrick;

import com.patrick.service.PayService;

import java.util.ServiceLoader;

/**
 * @author patricks
 * @date 2021/2/14 12:09 下午
 * @Des 测试
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class MainLoad {
    public static void main(String[] args) {
        ServiceLoader<PayService> loader = ServiceLoader.load(PayService.class);
        loader.forEach(payService -> {
            payService.pay();
        });
    }
}
