package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
class CharacterTest {

    @Test
    void getCharName() {
        Character Wizard = new Wizard("Gandalf");
        assertEquals("Gandalf", Wizard.getCharName());
    }

    @Test
    void getCharStrength() {
        Character Wizard = new Wizard("Gandalf");
        assertEquals(1, Wizard.getCharStrength());
    }

    @Test
    void getCharCraft() {
        Character Wizard = new Wizard("Gandalf");
        assertEquals(4, Wizard.getCharCraft());
    }

    @Test
    void getCharHealth() {
        Character Wizard = new Wizard("Gandalf");
        assertEquals(3, Wizard.getCharHealth());
    }

    @Test
    void reduceHealth() {
        Character Wizard = new Wizard("Gandalf");
        Wizard.reduceHealth(2);
        assertEquals(1, Wizard.getCharHealth());
    }

}