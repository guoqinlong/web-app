package com.qinlong;

import org.apache.http.HttpConnection;
import org.apache.http.impl.nio.DefaultNHttpClientConnection;
import org.apache.http.nio.NHttpClientConnection;

public class NIOClient {
    public static void main(String[] args) {
        String host = "www.baidu.com";
        int port = 80;

        NHttpClientConnection connection = new DefaultNHttpClientConnection();
    }
}
