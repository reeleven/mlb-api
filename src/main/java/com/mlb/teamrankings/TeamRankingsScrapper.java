package com.mlb.teamrankings;

import com.mlb.interfaces.Scrapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class TeamRankingsScrapper implements Scrapper {

    public Document getPageFromURL(String url) throws Exception{
        return Jsoup.connect(url).get();
    }

}
