package org.example;
//------------------------------------------------------
// Assignment 2
// Written by: Anthony Jaimes ID: 2018391
// For SES350 Section 602 – Spring 2025
//--------------------------------------------------------
public class PrintError extends Action {
    private Exception exception;

    public PrintError(Dungeon dungeon, Exception exception) {
        super(dungeon);
        this.exception = exception;
    }
    public void execute() {
        System.out.println("The following error Occured: " + exception.getMessage());
    }
}