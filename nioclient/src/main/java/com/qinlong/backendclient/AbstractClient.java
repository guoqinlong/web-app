package com.qinlong.backendclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AbstractClient {

    private CloseableHttpAsyncClient httpClient;

    public AbstractClient() {
        httpClient = HttpAsyncClients.createDefault();
        httpClient.start();
    }

    protected HttpResponse get(String url) throws IOException, ExecutionException, InterruptedException {
        HttpGet request = new HttpGet(url);
        Future future = httpClient.execute(request, null);
        HttpResponse response = (HttpResponse) future.get();
        return response;
    }
}
