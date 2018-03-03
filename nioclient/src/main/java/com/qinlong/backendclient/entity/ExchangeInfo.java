package com.qinlong.backendclient.entity;

/**
 * Generated from http://pojo.sodhanalibrary.com/
 */
public class ExchangeInfo
{
    private String timezone;

    private Symbols[] symbols;

    private String serverTime;

    private RateLimits[] rateLimits;

    private String[] exchangeFilters;

    public String getTimezone ()
    {
        return timezone;
    }

    public void setTimezone (String timezone)
    {
        this.timezone = timezone;
    }

    public Symbols[] getSymbols ()
    {
        return symbols;
    }

    public void setSymbols (Symbols[] symbols)
    {
        this.symbols = symbols;
    }

    public String getServerTime ()
    {
        return serverTime;
    }

    public void setServerTime (String serverTime)
    {
        this.serverTime = serverTime;
    }

    public RateLimits[] getRateLimits ()
    {
        return rateLimits;
    }

    public void setRateLimits (RateLimits[] rateLimits)
    {
        this.rateLimits = rateLimits;
    }

    public String[] getExchangeFilters ()
    {
        return exchangeFilters;
    }

    public void setExchangeFilters (String[] exchangeFilters)
    {
        this.exchangeFilters = exchangeFilters;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timezone = "+timezone+", symbols = "+symbols+", serverTime = "+serverTime+", rateLimits = "+rateLimits+", exchangeFilters = "+exchangeFilters+"]";
    }
}
