package com.mlb.beans;

import java.io.Serializable;

/**
 * Player Bean
 */

public class Player implements Serializable {
    private long id;
    private String name;
    private PlayerStats playerStats;
    private Team team;
    private String position;
    private int battingPosition;

    public Player() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBattingPosition() {
        return battingPosition;
    }

    public void setBattingPosition(int battingPosition) {
        this.battingPosition = battingPosition;
    }

}
