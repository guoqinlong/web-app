package com.qinlong.backendclient;

import com.google.gson.Gson;
import com.qinlong.backendclient.entity.ExchangeInfo;
import org.apache.http.HttpResponse;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;

public class BinanceClient extends AbstractClient {

    private final static String baseUrl = "https://api.binance.com";

    private final static String exchangeInfoUrl = "/api/v1/exchangeInfo";

    private Gson gson;

    public BinanceClient() {
        gson = new Gson();
    }

    public ExchangeInfo getExchangeInfo() throws InterruptedException, ExecutionException, IOException {
        String url = baseUrl + exchangeInfoUrl;
        HttpResponse response = get(url);
        ExchangeInfo exchangeInfo = gson.fromJson(new InputStreamReader(response.getEntity().getContent()), ExchangeInfo.class);
        return exchangeInfo;
    }
}
