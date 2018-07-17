package com.example.connorsedwick.projectazathoth;

/**
 * Created by Connor Sedwick on 2/9/2018.
 */

public class Encounter extends Card {
    private static int victoryPoints = 0;

    public static void setVictoryPoints(int victoryPoints) {
        Encounter.victoryPoints = victoryPoints;
    }

    public static int getVictoryPoints() {
        return victoryPoints;
    }
}
