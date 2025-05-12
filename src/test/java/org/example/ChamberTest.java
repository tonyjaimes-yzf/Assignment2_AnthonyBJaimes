package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
class ChamberTest {

    @Test
    void getDoors() {
        Chamber chamber = new Chamber();
        List<Door> actual = chamber.getDoors();
        List<Door> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void getItems() {
        Chamber chamber = new Chamber();
        List<Item> actual = chamber.getItems();
        List<Item> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void addDoor() {
        Chamber chamber = new Chamber();
        Chamber chamber1 = new Chamber();
        Chamber chamber2 = new Chamber();
        Monster monster = new Monster("Goblin", 999, 0, 999);
        Door door = new Door(chamber1, chamber2, monster);
        chamber.addDoor(door);
        List<Door> doors = chamber.getDoors();
        int expected = 1;
        int actual = doors.size();
        assertEquals(expected, actual);
    }
}