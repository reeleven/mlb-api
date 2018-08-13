package com.mlb.teamrankings;

import com.mlb.interfaces.Scrapper;
import com.mlb.beans.Page;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class TeamRankingsScrapper implements Scrapper {

    public Document getPageFromURL(Page page) throws Exception{
        return Jsoup.connect(page.getUrl()).get();
    }

}
