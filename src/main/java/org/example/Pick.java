package org.example;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
public class Pick extends Action {
    private Item item;

    /**
     *
     * @param dungeon
     * @param item
     */
    public Pick(Dungeon dungeon, Item item) {
        super(dungeon);
        this.item = item ;
    }

    /**
     * Main logic for picking up an item
     */
    public void execute() {
        dungeon.getPlayer().addItem(item);
        Character player = dungeon.getPlayer();
        dungeon.getCurrentChamber().getItems().remove(item);
        System.out.println("You got a new item!  ");
        System.out.println("Item: " + item.getName());
        System.out.println("Your Item Added: Strength: " + item.getStrength() + ", Craft: " + item.getCraft());
        System.out.println("Character Stats: Strength: " + player.getCharStrength() + ", Craft: " + player.getCharCraft() + ", Health: " + player.getCharHealth()+"\n");
    }

    /**
     *
     * @return text to pick up an item
     */
    public String toString() {
        return "Pick up a " + item.getName();
    }
}