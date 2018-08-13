package com.mlb.beans;

import java.io.Serializable;

/**
 * Page Bean
 */

public class Page implements Serializable {
    private long id;
    private String url;

    public Page() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
