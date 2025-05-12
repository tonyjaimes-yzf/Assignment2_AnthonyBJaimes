package org.example;
import java.util.ArrayList;
import java.util.List;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
public class Dungeon {
    private Character player;
    private Chamber endChamber;
    private Chamber currentChamber;
    public Dungeon(Character player, Chamber currentChamber, Chamber goalChamber) {
        this.player = player;
        this.endChamber = goalChamber;
        this.currentChamber = currentChamber;
    }
    public boolean isFinished() {
        return currentChamber == endChamber
                || player.getCharHealth() <= 0;
    }
    public Chamber getCurrentChamber() {
        return currentChamber;
    }

    public void setCurrentChamber(Chamber chamber) {
        this.currentChamber = chamber;
    }

    public List<Action> getActions() {
        List<Action> actions = new ArrayList<>();
        for (Door door : currentChamber.getDoors()) {
            if (door.getGuard() != null) {
                actions.add(new Fight(this, door.getGuard()));
            } else {
                actions.add(new Move(this, door));
            }
        }
        for (Item item : currentChamber.getItems()) {
            actions.add(new Pick(this, item));
        }
        return actions;
    }
    public Character getPlayer() {
        return player;
    }
}