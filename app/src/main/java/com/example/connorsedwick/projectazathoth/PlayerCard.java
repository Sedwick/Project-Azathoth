package com.example.connorsedwick.projectazathoth;

/**
 * Created by Connor Sedwick on 2/9/2018.
 */

public class PlayerCard extends Card {
    private static int cost = 0;
    private static int level = 0;
    private static int classType = 0;
    private static int agilityBonus = 0;
    private static int willpowerBonus = 0;
    private static int intelligenceBonus = 0;
    private static int combatBonus = 0;
    private static int wildcardBonus = 0;
    private static String description = "";


    /******************************************
     * Set the stat bonus of card
     ******************************************/
    public static void setAgilityBonus(int agilityBonus) {
        PlayerCard.agilityBonus = agilityBonus;
    }

    public static void setWillpowerBonus(int willpowerBonus) {
        PlayerCard.willpowerBonus = willpowerBonus;
    }

    public static void setIntelligenceBonus(int intelligenceBonus) {
        PlayerCard.intelligenceBonus = intelligenceBonus;
    }

    public static void setCombatBonus(int combatBonus) {
        PlayerCard.combatBonus = combatBonus;
    }

    public static void setWildcardBonus(int wildcardBonus) {
        PlayerCard.wildcardBonus = wildcardBonus;
    }

    /******************************************
     * Set the PlayerCard description of card
     ******************************************/
    public static void setDescription(String description) {
        PlayerCard.description = description;
    }

    /******************************************
     * Get the stat bonus of card
     ******************************************/
    public static int getAgilityBonus() {
        return agilityBonus;
    }

    public static int getWillpowerBonus() {
        return willpowerBonus;
    }

    public static int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    public static int getCombatBonus() {
        return combatBonus;
    }

    public static int getWildcardBonus() {
        return wildcardBonus;
    }

    /******************************************
     * Get the PlayerCard description of card
     ******************************************/
    public static String getDescription() {
        return description;
    }

    /******************************************
     * Set the cost, class, and level of card
     ******************************************/
    public static void setCost(int cost) {
        PlayerCard.cost = cost;
    }

    public static void setLevel(int level) {
        PlayerCard.level = level;
    }

    /*****************************
     *  Set the class type with an int value.
     *
     *  Guardian =  0
     *  Seeker =    1
     *  Mystic =    2
     *  Survivor =  3
     *  Rogue =     4
     *  Neutral =   5
     *
     * @param classType
     *****************************/

    public static void setClassType(String classType) {
        int classID = 0;

        switch (classType) {
            case "Guardian":    classID = 0;
                break;
            case "Seeker":      classID = 1;
                break;
            case "Mystic":      classID = 2;
                break;
            case "Survivor":    classID = 3;
                break;
            case "Rogue":       classID = 4;
                break;
            case "Neutral":     classID = 5;
                break;
        }

        PlayerCard.classType = classID;
    }

    /******************************************
     * Get the cost, class, and level of card
     ******************************************/

    public static int getCost() {
        return cost;
    }

    public static int getLevel() {
        return level;
    }

    public static int getClassType() {
        return classType;
    }


    public void playCard(){}
    public void commitCard(){}
}
