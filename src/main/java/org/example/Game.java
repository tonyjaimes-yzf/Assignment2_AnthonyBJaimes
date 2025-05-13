package org.example;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
public class Game {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // initialize some chambers
        Chamber[] chambers = new Chamber[] {
                new Chamber(),
                new Chamber(new Axe()),
                new Chamber(new Shield()),
                new Chamber(new Sword()),
                new Chamber(new Enchanted())
        };

        // connect the chambers with doors
        Door.connect(chambers[0], chambers[1]);
        Door.connect(chambers[1], chambers[2], new Monster("Goblin", 1, 0, 3));
        Door.connect(chambers[2], chambers[3], new Monster("Spider", 3, 0, 5));
        Door.connect(chambers[3], chambers[4]);

        Character player = new Wizard("Gandalf");
        System.out.println("Character Name: " + player.getCharName());
        System.out.println("Stats: Strength: " + player.getCharStrength() + ", Craft: " + player.getCharCraft() + ", Health: " + player.getCharHealth()+"\n");
        // initialize the dungeon with player, entry chamber, and goal chamber
        Dungeon d = new Dungeon(player, chambers[0], chambers[4]);

        TextUI ui = new TextUI();
        ui.play(d);
    }
}