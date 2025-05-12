package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
class DoorTest {

    @Test
    void connectNoGuard() {
        Chamber chamber1 = new Chamber();
        Chamber chamber2 = new Chamber();
        Door.connect(chamber1, chamber2);
        Door expected = chamber1.getDoors().get(0);
        Door actual = chamber2.getDoors().get(0);
        assertEquals(expected, actual);
    }

    @Test
    void connectWithGuard() {
        Chamber chamber1 = new Chamber();
        Chamber chamber2 = new Chamber();
        Monster monster = new Monster("Goblin", 1, 0, 1);
        Door.connect(chamber1, chamber2);
        Door expected = chamber1.getDoors().get(0);
        Door actual = chamber2.getDoors().get(0);
        assertEquals(expected, actual);
    }

    @Test
    void getOtherChamber1() {
        Chamber chamber1 = new Chamber();
        Chamber expected = new Chamber();
        Monster monster = new Monster("Goblin", 1, 0, 1);
        Door door = new Door(chamber1, expected, monster);
        Chamber actual = door.getOtherChamber(chamber1);
        assertEquals(expected, actual);
    }
    @Test
    void getOtherChamber2() {
        Chamber expected = new Chamber();
        Chamber chamber2 = new Chamber();
        Monster monster = new Monster("Goblin", 1, 0, 1);
        Door door = new Door(expected, chamber2, monster);
        Chamber actual = door.getOtherChamber(chamber2);
        assertSame(expected, actual);
    }

    @Test
    void getGuard() {
        Chamber chamber1 = new Chamber();
        Chamber chamber2 = new Chamber();
        Monster expected = new Monster("Goblin", 1, 0, 1);
        Door door = new Door(chamber1, chamber2, expected);
        Monster actual = door.getGuard();
        assertEquals(expected, actual);
    }

    @Test
    void defeatGuard() {
        Chamber chamber1 = new Chamber();
        Chamber chamber2 = new Chamber();
        Monster monster = new Monster("Goblin", 0, 0, 0);
        Door door = new Door(chamber1, chamber2, monster);
        door.defeatGuard();
        assertNull(door.getGuard());
    }
}