package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
class FightTest {

    @Test
    void testDeafeatMonster() {
        Warrior player = new Warrior("Ronaldo");
        Chamber currentChamber = new Chamber();
        Dungeon dungeon = new Dungeon(player, currentChamber, new Chamber());
        Monster goblin = new Monster("Goblin", 0, 0, 1);
        Fight fight = new Fight(dungeon, goblin);
        fight.execute();
        assertFalse(fight.dungeon.isFinished());
    }
    @Test
    void testDefeatPlayer() {
        Wizard player = new Wizard("Gandalf");
        Chamber currentChamber = new Chamber();
        Dungeon dungeon = new Dungeon(player, currentChamber, new Chamber());
        Monster goblin = new Monster("Goblin", 999, 0, 999);
        Fight fight = new Fight(dungeon, goblin);
        fight.execute();
        assertTrue(fight.dungeon.isFinished());
    }
}