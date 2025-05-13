package org.example;
import java.util.Random;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
public class Fight extends Action {
    private final Monster monster;

    /**
     *
     * @param dungeon
     * @param monster
     */
    public Fight(Dungeon dungeon, Monster monster) {
        super(dungeon);
        this.monster = monster;
    }

    /**
     * The main logic for the combat mechanism
     */
    public void execute() {
        Character player = dungeon.getPlayer();
        Random rand = new Random();
        System.out.println("You must defeat the Monster before going through!");
        System.out.println("Fighting a " + monster.getCharName() + "!");

        while (player.getCharHealth() > 0 && monster.getCharHealth() > 0) {
            int playersTurn = rand.nextInt(6) + 1;
            int playersLevel = player.getCharStrength() + playersTurn;
            System.out.println("Player rolled a: " + playersTurn);
            System.out.println("Total Power: " + playersLevel);
            int monstersTurn = rand.nextInt(6) + 1;
            int monstersLevel = monster.getCharStrength() + monstersTurn;
            System.out.println("Monster rolled a: " + monstersTurn);
            System.out.println("Total Power: " + monstersLevel);

            if (playersLevel > monstersLevel) {
                monster.reduceHealth(playersLevel - monstersLevel);
                System.out.println("You hit the Monster, Monster health: " + monster.getCharHealth());
            } else {
                player.reduceHealth(monstersLevel - playersLevel);
                System.out.println("You got hit, Your health: " + player.getCharHealth());
            }
        }
        if (monster.getCharHealth() <= 0) {
            System.out.println("You killed the monster!");
            dungeon.getCurrentChamber()
                    .getDoors()
                    .stream()
                    .filter(door -> door.getGuard() == monster)
                    .findFirst()
                    .ifPresent(Door::defeatGuard);
        } else {
            System.out.println("You Died!");
        }
    }

    /**
     *
     * @return text to see what monster can be fought
     */
    public String toString() {
        return "Fight " + monster.getCharName();
    }
}