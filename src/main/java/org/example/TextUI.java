package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
public class TextUI {
    public void play(Dungeon d) {
        while (!d.isFinished()) {
            print(d);
            Action a = ask(d);
            a.execute();
        }
    }
    private void print(Dungeon d) {
        Chamber r = d.getCurrentChamber();
        StringBuilder s = new StringBuilder();

        s.append("You are in a chamber with " + r.getDoors().size() + " doors\n");
        s.append("There are " + r.getItems().size() + " items in the chamber\n");
        //TODO: print for each door which monster is there, how strong it is, how skilled in craft, and how healthy
        for (int i = 0; i < r.getDoors().size(); i++) {
            Door door = r.getDoors().get(i);
            if (door.getGuard() != null) {
                Monster guard = door.getGuard();
                s.append("Door " + (i + 1) + " is guarded by a " + guard.getCharName() + " (Strength Level: " + guard.getCharStrength()
                        + ", Craft Level: " + guard.getCharCraft() + ", Health Level: " + guard.getCharHealth() + ")\n");
            } else {
                s.append("Door " +(i + 1)+" is unguarded.\n");
            }
        }
        System.out.println(s.toString());
    }
    private Action ask(Dungeon d) {
        StringBuilder s = new StringBuilder();
        s.append("Here are your options:\n");

        List<Action> actions = d.getActions();
        for (int i = 0; i < actions.size(); i++) {
            Action a = actions.get(i);
            s.append("\t"+i + ": " + a.toString() + "\n");
        }

        System.out.println(s.toString());

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            int command = Integer.parseInt(reader.readLine());
            if (command >= 0 && command < actions.size()) {
                return actions.get(command);
            } else {
                System.out.println("Invalid input. Please Try Again.");
                return ask(d);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please Try Again.");
            return ask(d);
        } catch (IOException e) {
            return new PrintError(d, e);
        }
    }
}