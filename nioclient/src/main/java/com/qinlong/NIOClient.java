package com.qinlong;


import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import java.util.concurrent.Future;

public class NIOClient {
    public static void main(String[] args) throws Exception {
        final CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
        httpclient.start();
        try {
            final HttpGet request = new HttpGet("http://www.apache.org/");
            final Future future = httpclient.execute(request, null);
            final HttpResponse response = (HttpResponse) future.get();
            System.out.println("Response: " + response.getStatusLine());
            System.out.println("Shutting down");
        } finally {
            httpclient.close();
        }
        System.out.println("Done");
    }
}
