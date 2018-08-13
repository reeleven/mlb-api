package com.mlb.beans;

import java.io.Serializable;

public class Page implements Serializable {

    private String url;

    public Page() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
