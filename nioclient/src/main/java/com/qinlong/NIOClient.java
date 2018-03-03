package com.qinlong;

import com.qinlong.backendclient.BinanceClient;

public class NIOClient {
    public static void main(String[] args) throws Exception {
        BinanceClient client  = new BinanceClient();
        System.out.println(client.getExchangeInfo().getRateLimits()[1]);
    }
}
