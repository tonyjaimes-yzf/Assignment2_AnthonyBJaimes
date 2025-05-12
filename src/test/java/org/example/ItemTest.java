package org.example;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
class ItemTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Item Axe = new Axe();
        assertEquals("Axe", Axe.getName());
    }
    @org.junit.jupiter.api.Test
    void getStrength() {
        Item Axe = new Axe();
        assertEquals(5, Axe.getStrength());
    }
    @org.junit.jupiter.api.Test
    void getCraft() {
        Item Axe = new Axe();
        assertEquals(0, Axe.getCraft());
    }
}