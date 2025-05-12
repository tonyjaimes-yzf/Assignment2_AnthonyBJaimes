package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
class DungeonTest {

    @Test
    void isFinished() {
        Wizard player = new Wizard("Gandalf");
        Dungeon dungeon = new Dungeon(player,null, null);
        boolean actual = dungeon.isFinished();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentChamber() {
        Wizard player = new Wizard("Gandalf");
        Chamber expected = new Chamber();
        Dungeon dungeon = new Dungeon(player, expected, new Chamber());
        Chamber actual = dungeon.getCurrentChamber();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChamber() {
        Wizard player = new Wizard("Gandalf");
        Chamber currentChamber = new Chamber();
        Dungeon dungeon = new Dungeon(player, currentChamber, new Chamber());
        Chamber expected = new Chamber();
        dungeon.setCurrentChamber(expected);
        Chamber actual = dungeon.getCurrentChamber();

        assertEquals(expected, actual);
    }

    @Test
    void getActions() {
        Wizard player = new Wizard("Gandalf");
        Chamber currentChamber = new Chamber();
        Dungeon dungeon = new Dungeon(player, currentChamber, new Chamber());
        assertNotNull(dungeon.getActions());
    }

    @Test
    void getPlayer() {
        Warrior player = new Warrior("Gandolf");
        Chamber currentChamber = new Chamber();
        Dungeon dungeon = new Dungeon(player, currentChamber, new Chamber());
        assertSame(player, dungeon.getPlayer());
    }
}