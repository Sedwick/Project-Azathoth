package com.example.connorsedwick.projectazathoth;

import java.util.ArrayDeque;

/**
 * Created by Connor Sedwick on 2/9/2018.
 */

public class Asset extends PlayerCard {
    private static ArrayDeque<String> attributes;
    private static int unlimitedUse = 0;
    private static int charges = 0;
    private static int slotID = 0;
    private static int assetAction_agilityBonus = 0;
    private static int assetAction_willpowerBonus = 0;
    private static int assetAction_intelligenceBonus = 0;
    private static int assetAction_combatBonus = 0;
    private static int assetAction_wildcardBonus = 0;

    /******************************************
     * Set the unlimited use of card's action
     * flag.
     *  0 = finite
     *  1 = infinite
     ******************************************/
    public static void setUnlimitedUse(int unlimitedUse) {
        Asset.unlimitedUse = unlimitedUse;
    }

    /******************************************
     * Get the unlimited use of card's action
     * flag.
     *  0 = finite
     *  1 = infinite
     ******************************************/
    public static int getUnlimitedUse() {
        return unlimitedUse;
    }

    /******************************************
     * Set the charges of card's action
     ******************************************/
    public static void setCharges(int charges) {
        Asset.charges = charges;
    }

    /******************************************
     * Get the charges of card's action
     ******************************************/
    public static int getCharges() {
        return charges;
    }

    /******************************************
     * Set the item slot ID
     *  0 = no slot used
     *  1 = 1x hand
     *  2 = 2x hand
     *  3 = accessory
     *  4 = body
     *  5 = ally
     *  6 = 1x arcane
     *  7 = 2x arcane
     ******************************************/
    public static void setSlotID(int slotID) {
        Asset.slotID = slotID;
    }

    /******************************************
     * Get the item slot ID
     ******************************************/
    public static int getSlotID() {
        return slotID;
    }

    /******************************************
     * Set the stat bonus of card's action
     ******************************************/
    public static void setAssetAction_agilityBonus(int assetAction_agilityBonus) {
        Asset.assetAction_agilityBonus = assetAction_agilityBonus;
    }

    public static void setAssetAction_willpowerBonus(int assetAction_willpowerBonus) {
        Asset.assetAction_willpowerBonus = assetAction_willpowerBonus;
    }

    public static void setAssetAction_intelligenceBonus(int assetAction_intelligenceBonus) {
        Asset.assetAction_intelligenceBonus = assetAction_intelligenceBonus;
    }

    public static void setAssetAction_combatBonus(int assetAction_combatBonus) {
        Asset.assetAction_combatBonus = assetAction_combatBonus;
    }

    public static void setAssetAction_wildcardBonus(int assetAction_wildcardBonus) {
        Asset.assetAction_wildcardBonus = assetAction_wildcardBonus;
    }

    /******************************************
     * Get the stat bonus of card's action
     ******************************************/
    public static int getAssetAction_agilityBonus() {
        return assetAction_agilityBonus;
    }

    public static int getAssetAction_willpowerBonus() {
        return assetAction_willpowerBonus;
    }

    public static int getAssetAction_intelligenceBonus() {
        return assetAction_intelligenceBonus;
    }

    public static int getAssetAction_combatBonus() {
        return assetAction_combatBonus;
    }

    public static int getAssetAction_wildcardBonus() {
        return assetAction_wildcardBonus;
    }
}

