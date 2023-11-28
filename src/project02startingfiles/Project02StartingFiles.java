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
    //Import the scanner & random for all methods
    private static final Scanner input = new Scanner(System.in);
    private static final Random rand = new Random();

    //universal predefined character health and scores
    private static Wizard wiz = new Wizard();
    private static Knight kni = new Knight();
    private static Healer heal = new Healer();
    private static Thief thef = new Thief();

    public static void main(String[] args) {

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
    public static void  Playerstatus(String character){
        if (character.equals("w")){
          System.out.println("Wizard Status:\nHealth: " + wiz.getHealth() + "\nScore: " + wiz.getScore());  
        }
        else if (character.equals("k")){
          System.out.println("Knight Status:\nHealth: " + kni.getHealth()+"\nScore: " + kni.getScore());
        }
        else if(character.equals("h")){
            System.out.println("Helaer Status:\nHealth: " +heal.getHealth()+"\nScore: " + heal.getScore());
        }
        else if (character.equals("t")){
            System.out.println("Theif Status:\nHealth: "+thef.getHealth()+"\nScore: " +thef.getScore());
        }
    }
 
    //A method that generates whether the player has a benign scene or a attack scenario
    public static void scearioScene() {
        int typeOfScene = rand.nextInt(5);

        if (typeOfScene == 0) {
            //initiate attack scenario method
        } else {
            runBenignScenes();
        }
    }

    //A method that has the benign scenes in it.
    public static void runBenignScenes() {
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
        wiz.setScore(wiz.getScore() + 1);
        kni.setScore(kni.getScore() + 1);
        heal.setScore(heal.getScore() + 1);
        thef.setScore(thef.getScore() + 1);
    }

    //Method that has the attack scenarios
    public static void attackScenario() {
        String[] foes = {"zombie", "bandit", "lobbyist"};
        String typeOfFoe = foes[rand.nextInt(foes.length)];
        System.out.println("Oh no! You are being attacked by a " + typeOfFoe + "!\nHow would you like to handle this?");
        System.out.print("\n{s}Special Move || {r}Run!\n>>");
        String choice = input.next().toLowerCase();

        if (choice.equals("s")) {
            if () {
                
            }
        }
    }
}
