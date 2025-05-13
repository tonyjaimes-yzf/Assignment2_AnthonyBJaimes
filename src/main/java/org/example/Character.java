package org.example;
import java.util.ArrayList;
import java.util.List;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------

public abstract class Character {
    private final String name;
    private int strength;
    private int craft;
    private int health;
    private final List<Item> inventory;

    /**
     *
     * @param name
     * @param strength
     * @param craft
     * @param health
     */
    public Character(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    /**
     *
     * @return character name
     */
    public String getCharName() {
        return name;
    }

    /**
     *
     * @return character strength
     */
    public int getCharStrength() {
        return strength;
    }

    /**
     *
     * @return character craft
     */
    public int getCharCraft() {
        return craft;
    }

    /**
     *
     * @return character health
     */
    public int getCharHealth() {
        return health;
    }

    /**
     *
     * @param item
     */
    public void addItem(Item item) {
        inventory.add(item);
        this.strength += item.getStrength();
        this.craft += item.getCraft();
    }

    /**
     *
     * @param amount
     */
    public void reduceHealth(int amount) {
        health = Math.max(0, health - amount);
    }
}