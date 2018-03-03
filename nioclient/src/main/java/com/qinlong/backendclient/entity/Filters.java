package com.qinlong.backendclient.entity;

public class Filters
{
    private String maxPrice;

    private String filterType;

    private String tickSize;

    private String minPrice;

    public String getMaxPrice ()
    {
        return maxPrice;
    }

    public void setMaxPrice (String maxPrice)
    {
        this.maxPrice = maxPrice;
    }

    public String getFilterType ()
    {
        return filterType;
    }

    public void setFilterType (String filterType)
    {
        this.filterType = filterType;
    }

    public String getTickSize ()
    {
        return tickSize;
    }

    public void setTickSize (String tickSize)
    {
        this.tickSize = tickSize;
    }

    public String getMinPrice ()
    {
        return minPrice;
    }

    public void setMinPrice (String minPrice)
    {
        this.minPrice = minPrice;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [maxPrice = "+maxPrice+", filterType = "+filterType+", tickSize = "+tickSize+", minPrice = "+minPrice+"]";
    }
}
