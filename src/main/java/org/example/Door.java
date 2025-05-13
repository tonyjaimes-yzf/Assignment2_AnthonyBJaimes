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

    /**
     *
     * @param chamber1
     * @param chamber2
     * @param guard
     */
    public Door(Chamber chamber1, Chamber chamber2, Monster guard) {
        this.chamber1 = chamber1;
        this.chamber2 = chamber2;
        this.guard = guard;
    }

    /**
     *
     * @param chamber1
     * @param chamber2
     */
    public static void connect(Chamber chamber1, Chamber chamber2) {
        Door door = new Door(chamber1, chamber2, null);
        chamber1.addDoor(door);
        chamber2.addDoor(door);
    }

    /**
     *
     * @param chamber1
     * @param chamber2
     * @param guard
     */
    public static void connect(Chamber chamber1, Chamber chamber2, Monster guard) {
        Door door= new Door(chamber1, chamber2, guard);
        chamber1.addDoor(door);
        chamber2.addDoor(door);
    }

    /**
     *
     * @param current
     * @returns chamber 2 if current chamber is chamber1
     * else it returns chamber 1
     */
    public Chamber getOtherChamber(Chamber current) {
        if (current == chamber1) {
            return chamber2;
        } else {
            return chamber1;
        }
    }

    /**
     *
     * @return Monster guard
     */
    public Monster getGuard() {
        return guard;
    }

    public void defeatGuard() {
        this.guard = null;
    }
}