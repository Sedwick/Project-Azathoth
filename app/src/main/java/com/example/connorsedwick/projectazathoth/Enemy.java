package com.example.connorsedwick.projectazathoth;

import java.util.ArrayDeque;

/**
 * Created by Connor Sedwick on 2/9/2018.
 */

public class Enemy extends Encounter {
    private static int hitpoints = 0;
    private static int combatLevel = 0;
    private static int agilityLevel = 0;
    private static int damageHorror = 0;
    private static int damagePhysical = 0;
    private static int prey = 0;
    private static ArrayDeque<String> attributes;

    /*********************************************************************
     * Set functions for monster traits
     *********************************************************************/

    //Set enemy Hitpoints
    public static void setHitpoints(int hitpoints) {
        Enemy.hitpoints = hitpoints;
    }

    //Set Agility level of enemy
    public static void setAgilityLevel(int agilityLevel) {
        Enemy.agilityLevel = agilityLevel;
    }

    //Set Combat level of enemy
    public static void setCombatLevel(int combatLevel) {
        Enemy.combatLevel = combatLevel;
    }

    //Set Horror output of enemy
    public static void setDamageHorror(int damageHorror) {
        Enemy.damageHorror = damageHorror;
    }

    //Set Physical damage of enemy
    public static void setDamagePhysical(int damagePhysical) {
        Enemy.damagePhysical = damagePhysical;
    }

    /************************
     * Set enemy's prey value. Set null if there is no prey value.
     *
     * Lowest
     *  willpower =     0
     *  intellect =     1
     *  combat =        2
     *  agility =       3
     *  cards =         4
     *
     * Highest
     *  willpower =     5
     *  intellect =     6
     *  combat =        7
     *  agility =       8
     *  cards =         9
     ************************/
    public static void setPrey(int prey) {
        Enemy.prey = prey;
    }

    /************************
     * Set enemy's attribute value. Set null if there is no attribute value.
     *
     *  Hunter
     *  Massive
     *  Humanoid
     *  Ghoul
     *  Cultist
     *  Monster
     *  Ancient One
     *  Nightgaunt
     *  Byakhee
     *  Elite
     *  ...
     ************************/
    public static void setAttributes(String attributes) {
        Enemy.attributes.push(attributes);
    }

    /*********************************************************************
     * Get functions for monster traits
     *********************************************************************/

    //Get Hitpoints of enemy
    public static int getHitpoints() {
        return hitpoints;
    }

    //Get combat level of enemy
    public static int getCombatLevel() {
        return combatLevel;
    }

    //Get Agility level of enemy
    public static int getAgilityLevel() {
        return agilityLevel;
    }

    //Get Horror output of enemy
    public static int getDamageHorror() {
        return damageHorror;
    }

    //Get Physical damage of enemy
    public static int getDamagePhysical() {
        return damagePhysical;
    }

    //Get prey value of enemy
    public static int getPrey() {
        return prey;
    }

    //Get attributes of enemy
    public static ArrayDeque<String> getAttributes() {
        return attributes;
    }
}
