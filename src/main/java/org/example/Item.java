package org.example;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
public class Item {

    private final String name;
    private final int strength;
    private final int craft;

    /**
     *
     * @param name
     * @param strength
     * @param craft
     */
    public Item(String name, int strength, int craft) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;

    }

    /**
     *
     * @return item name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return item strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     *
     * @return item craft
     */
    public int getCraft() {
        return craft;
    }
}