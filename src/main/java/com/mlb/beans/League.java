package com.mlb.beans;

import java.io.Serializable;
import java.util.List;

/**
 * League Bean
 */

public class League implements Serializable {
    private long id;
    private String leagueName;
    private String division;
    private List<Team> teams;

    public League() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

}
