package com.mlb.beans;

import java.io.Serializable;
import java.util.List;

/**
 * LineUp Bean
 */

public class LineUp implements Serializable {
    private long id;
    private List<Player> players;
    private Team team;

    public LineUp() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
