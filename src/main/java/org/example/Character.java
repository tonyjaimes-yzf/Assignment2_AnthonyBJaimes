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

    public Character(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public String getCharName() {
        return name;
    }
    public int getCharStrength() {
        return strength;
    }

    public int getCharCraft() {
        return craft;
    }

    public int getCharHealth() {
        return health;
    }
    public void addItem(Item item) {
        inventory.add(item);
        this.strength += item.getStrength();
        this.craft += item.getCraft();
    }

    public void reduceHealth(int amount) {
        health = Math.max(0, health - amount);
    }
}