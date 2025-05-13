package org.example;

import java.util.ArrayList;
import java.util.List;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------

/**
 * Chamber inside of dungeon.
 * Has doors
 * Has items
 */
public class Chamber {
    private List<Door> doors;
    private List<Item> items;


    public Chamber() {
        this.doors = new ArrayList<>();
        this.items = new ArrayList<>();
    }
    public Chamber(Item item) {
        this();
        this.items.add(item);
    }

    public List<Door> getDoors() {
        return doors;
    }
    public List<Item> getItems() {
        return items;
    }
    public void addDoor(Door door) {
        doors.add(door);
    }
}