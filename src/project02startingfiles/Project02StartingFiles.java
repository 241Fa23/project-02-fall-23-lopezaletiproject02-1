/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;

import java.util.*;

/**
 *
 * @author
 */
public class Project02StartingFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //predefined character health and scores
        Wizard wiz = new Wizard();
        Knight kni = new Knight();
        Healer heal = new Healer();
        Thief thef = new Thief();

        //Import the scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to JavaQuest!\nStay alive and increase your score!");
        System.out.print("Choose a character...\n{k}Knight || {h}Healer || {w}Wizard || {t}Thief \n>>");
        String character = input.nextLine();

        if (character.equals("k")) {
            System.out.println("Welcome, Knight!");
        }
        if (character.equals("h")) {
            System.out.println("Welcome, Healer!");
        }
        if (character.equals("w")) {
            System.out.println("Welcome, Wizard!");
        }
        if (character.equals("t")) {

            System.out.println("Welcome, Thief!");
        }

        System.out.println("What  would you like to do?");
        System.out.print("{?}Status Report? || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit\n>>");
        String choice = input.nextLine();

        BenignScenes();
        while (choice != "q") {
            switch (choice) {
                case "?":
                    //System.out.println(FUTURE STATUS METHOD);
                    break;
                case "n":

            }
            System.out.println("What  would you like to do?");
            System.out.print("{?}Status Report? || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit\n>>");
            choice = input.nextLine();

        }
        if (choice == "q") {
            System.out.println("**********************\n**********************\nThe game has come to an end! Your final stats: ");
            //call player status method
            System.out.println("Thanks for playing!");
        }

    }
    //Begin methods here

    //A method that prints out the players status report
    //A method that generates whether the player has a benign scene or a attack scenario
    //A method that has the benign scenes in it.
    public static void BenignScenes() {
        System.out.println("**********************");
        Random rand = new Random();
        int option = rand.nextInt(1, 4);
        switch (option) {
            case 1:
                System.out.println("Nothing here...\n**********************");
                break;

            case 2:
                System.out.println("Nice trees around here...\n**********************");
                break;

            case 3:
                System.out.println("Interesting cottage...\n**********************");
                break;

            case 4:
                System.out.println("Potty break...\n**********************");
                break;

        }
    }
}
