package org.example;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
public class Move extends Action {
    private Door door;

    public Move(Dungeon dungeon, Door door) {
        super(dungeon);
        this.door = door;
    }
    public void execute() {
        if (door.getGuard() == null) {
            dungeon.setCurrentChamber(door.getOtherChamber(dungeon.getCurrentChamber()));
            System.out.println("You moved to the next chamber, the door was ungaurded.");
        }
    }
    public String toString() {
        return "Move through the door to the next chamber";
    }
}