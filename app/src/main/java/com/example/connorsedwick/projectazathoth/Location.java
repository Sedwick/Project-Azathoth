package com.example.connorsedwick.projectazathoth;

import java.util.ArrayDeque;

/**
 * Created by Connor Sedwick on 2/9/2018.
 */

public class Location extends Card {
    private ArrayDeque enemies;
    private ArrayDeque players;
    private ArrayDeque connectingLocations;
    private int shroud = 0;
    private int clues = 0;
    private int perInvestigator = 0;
    private String description = "";

    /*********************************************************************
     * Set functions for location description, enemies, players,
     * connecting locations, shroud value, clue value, and whether the
     * clues are per investigator at the location.
     *********************************************************************/
    public void setEnemies(ArrayDeque enemies) {
        this.enemies = enemies;
    }

    public void setPlayers(ArrayDeque players) {
        this.players = players;
    }

    public void setConnectingLocations(ArrayDeque connectingLocations) {
        this.connectingLocations = connectingLocations;
    }

    public void setShroud(int shroud) {
        this.shroud = shroud;
    }

    public void setClues(int clues) {
        this.clues = clues;
    }

    public void setPerInvestigator(int perInvestigator) {
        this.perInvestigator = perInvestigator;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*********************************************************************
     * Get functions for location description, enemies, players,
     * connecting locations, shroud value, clue value, and whether the
     * clues are per investigator at the location.
     *********************************************************************/
    public ArrayDeque getEnemies() {
        return enemies;
    }

    public ArrayDeque getPlayers() {
        return players;
    }

    public ArrayDeque getConnectingLocations() {
        return connectingLocations;
    }

    public int getShroud() {
        return shroud;
    }

    public int getClues() {
        return clues;
    }

    public int getPerInvestigator() {
        return perInvestigator;
    }

    public String getDescription() {
        return description;
    }
}
