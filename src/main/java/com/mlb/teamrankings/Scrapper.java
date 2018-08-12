package com.mlb.teamrankings;

import org.jsoup.*;
import org.jsoup.nodes.Document;

public interface Scrapper {

    /**
     * Get Document from a given URL
     *
     * @param url
     * @return Document
     */
    public Document getPageFromURL(String url) throws Exception;

}
