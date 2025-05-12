package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
class MoveTest {

    @Test
    void moveNotFinished() {
        Wizard player = new Wizard("Gandalf");
        Chamber currentChamber = new Chamber();
        Dungeon dungeon = new Dungeon(player, currentChamber, new Chamber());
        assertFalse(dungeon.isFinished());
    }

}