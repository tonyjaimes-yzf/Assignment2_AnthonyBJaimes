package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
class PickTest {

    @Test
    void strengthAfterPick() {
        Character player = new Wizard("Gandalf");
        Item Axe = new Axe();
        Chamber chamber = new Chamber(Axe);
        Dungeon dungeon = new Dungeon(player, chamber, chamber);
        Pick pick = new Pick(dungeon, Axe);
        pick.execute();
        int expected = 6;
        int actual = player.getCharStrength();
        assertEquals(expected, actual);
    }
    @Test
    void CraftAfterPick() {
        Character player = new Wizard("Gandalf");
        Item Axe = new Axe();
        Chamber chamber = new Chamber(Axe);
        Dungeon dungeon = new Dungeon(player, chamber, chamber);
        Pick pick = new Pick(dungeon, Axe);
        pick.execute();
        int expected = 4;
        int actual = player.getCharCraft();
        assertEquals(expected, actual);
    }
}