package com.mlb.interfaces;

import com.mlb.beans.Page;
import org.jsoup.nodes.Document;

public interface Scrapper {

    /**
     * Get Document from a given URL
     *
     * @param page
     * @return Document
     */
    Document getPageFromURL(Page page) throws Exception;

}
