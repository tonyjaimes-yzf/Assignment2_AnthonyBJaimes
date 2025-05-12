package org.example;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
public class Door {
    private Chamber chamber1;
    private Chamber chamber2;
    private Monster guard;

    public Door(Chamber chamber1, Chamber chamber2, Monster guard) {
        this.chamber1 = chamber1;
        this.chamber2 = chamber2;
        this.guard = guard;
    }

    public static void connect(Chamber chamber1, Chamber chamber2) {
        Door door = new Door(chamber1, chamber2, null);
        chamber1.addDoor(door);
        chamber2.addDoor(door);
    }

    public static void connect(Chamber chamber1, Chamber chamber2, Monster guard) {
        Door door= new Door(chamber1, chamber2, guard);
        chamber1.addDoor(door);
        chamber2.addDoor(door);
    }

    public Chamber getOtherChamber(Chamber current) {
        if (current == chamber1) {
            return chamber2;
        } else {
            return chamber1;
        }
    }
    public Monster getGuard() {
        return guard;
    }
    public void defeatGuard() {
        this.guard = null;
    }
}