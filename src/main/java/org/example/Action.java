package org.example;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------

public abstract class Action {
    protected Dungeon dungeon;

    /**
     *
     * @param dungeon
     * dictates executable action
     */
    public Action(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
    public abstract void execute();
}