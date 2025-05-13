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

    /**
     *
     * @param player
     * @param currentChamber
     * @param goalChamber
     */
    public Dungeon(Character player, Chamber currentChamber, Chamber goalChamber) {
        this.player = player;
        this.endChamber = goalChamber;
        this.currentChamber = currentChamber;
    }

    /**
     *
     * @return checks to see if the game is finished
     */
    public boolean isFinished() {
        return currentChamber == endChamber
                || player.getCharHealth() <= 0;
    }

    /**
     *
     * @return current chamber being played
     */
    public Chamber getCurrentChamber() {
        return currentChamber;
    }

    /**
     *
     * @param chamber
     */
    public void setCurrentChamber(Chamber chamber) {
        this.currentChamber = chamber;
    }

    /**
     *
     * @return the actions at play
     */
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

    /**
     *
     * @return player
     */
    public Character getPlayer() {
        return player;
    }
}