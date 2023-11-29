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
    private static Player wiz = new Wizard(10, 0);
    private static Player kni = new Knight(10, 0);
    private static Player heal = new Healer(10, 0);
    private static Player thef = new Thief(10, 0);

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
        String choice;

        do {
            if (character.equals("w")) {
                if (wiz.getHealth() <= 0) {
                    break;
                }
            }
            if (character.equals("k")) {
                if (kni.getHealth() <= 0) {
                    break;
                }
            }
            if (character.equals("h")) {
                if (heal.getHealth() <= 0) {
                    break;
                }
            }
            if (character.equals("t")) {
                if (thef.getHealth() <= 0) {
                    break;
                }
            }
            System.out.println("What  would you like to do?");
            System.out.print("{?}Status Report? || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit\n>>");
            choice = input.nextLine();
            switch (choice) {
                case "?":
                    playerStatus(character);
                    break;
                case "n":
                case "s":
                case "e":
                case "w":
                    scenarioScene(character, choice);
                    break;
                case "q":
                    break;
                default:
                    System.out.println("Cannot do that, please type one of the options listed.");

            }

        } while (!choice.equals("q"));
        System.out.println("**********************\n**********************\nThe game has come to an end! Your final stats: ");
        playerStatus(character);
        System.out.println("Thanks for playing!");
    }
    //Begin methods here

    //A method that prints out the players status report
    public static void playerStatus(String character) {
        if (character.equals("w")) {
            System.out.println("Wizard Status:\nHealth: " + wiz.getHealth() + "\nScore: " + wiz.getScore() + "\nThe Wizard's special move is '" + wiz.getSpecialMove() + "'");
        } else if (character.equals("k")) {
            System.out.println("Knight Status:\nHealth: " + kni.getHealth() + "\nScore: " + kni.getScore() + "\nThe Knight's special move is '" + kni.getSpecialMove() + "'");
        } else if (character.equals("h")) {
            System.out.println("Healer Status:\nHealth: " + heal.getHealth() + "\nScore: " + heal.getScore() + "\nThe Healer's special move is '" + heal.getSpecialMove() + "'");
        } else if (character.equals("t")) {
            System.out.println("Thief Status:\nHealth: " + thef.getHealth() + "\nScore: " + thef.getScore() + "\nThe Thief's speicial move is '" + thef.getSpecialMove() + "'");
        }
    }

    //A method that generates whether the player has a benign scene or a attack scenario
    public static void scenarioScene(String character, String choice) {
        int typeOfScene = rand.nextInt(5);

        if (typeOfScene == 0) {
            attackScenario(character);
            input.nextLine();
        } else {
            switch (choice) {
                case "n":
                case "s":
                case "e":
                case "w":
                    runBenignScenes();
            }
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
    public static void attackScenario(String character) {
        String[] foes = {"zombie", "bandit", "lobbyist"};
        String typeOfFoe = foes[rand.nextInt(foes.length)];
        System.out.println("Oh no! You are being attacked by a " + typeOfFoe + "!\nHow would you like to handle this?");
        int num = 0;
        while (num == 0) {
            System.out.print("\n{s}Special Move || {r}Run!\n>>");
            String choice = input.next().toLowerCase();

            if (choice.equals("s")) {
                System.out.println("Prepare for battle!\nPress any letter then ENTER to continue...");
                input.next();
                System.out.println("**********************");
                if (character.equals("w")) {
                    System.out.println("The Wizard casts a spell!");
                    int chance = rand.nextInt(10);
                    if (chance < 7) {
                        System.out.println("Player wins! Increase score by 2 points!");
                        wiz.setScore(wiz.getScore() + 2);
                    } else {
                        System.out.println("Oh no! You've lost 1 health point.");
                        wiz.setHealth(wiz.getHealth() - 1);
                        if (wiz.getHealth() <= 0) {
                            System.out.println("Health is too low. Game over");
                        }
                    }
                    playerStatus(character);
                } else if (character.equals("k")) {
                    System.out.println("The Knight draws their sword!");
                    int chance = rand.nextInt(10);
                    if (chance < 7) {
                        System.out.println("Player wins! Increase score by 2 points!");
                        kni.setScore(kni.getScore() + 2);
                    } else {
                        System.out.println("Oh no! You've lost 1 health point.");
                        kni.setHealth(kni.getHealth() - 1);
                        if (kni.getHealth() <= 0) {
                            System.out.println("Health is too low. Game over");
                        }
                    }
                    playerStatus(character);
                } else if (character.equals("h")) {
                    System.out.println("The Healer uses sleeping powder!");
                    int chance = rand.nextInt(10);
                    if (chance < 7) {
                        System.out.println("Player wins! Increase score by 2 points!");
                        heal.setScore(heal.getScore() + 2);
                    } else {
                        System.out.println("Oh no! You've lost 1 health point.");
                        heal.setHealth(heal.getHealth() - 1);
                        if (heal.getHealth() <= 0) {
                            System.out.println("Health is too low. Game over");
                        }
                    }
                    playerStatus(character);
                } else if (character.equals("t")) {
                    System.out.println("The Thief attempts to sneak by...");
                    int chance = rand.nextInt(10);
                    if (chance < 7) {
                        System.out.println("Player wins! Increase score by 2 points!");
                        thef.setScore(thef.getScore() + 2);
                    } else {
                        System.out.println("Oh no! You've lost 1 health point.");
                        thef.setHealth(thef.getHealth() - 1);
                        if (thef.getHealth() <= 0) {
                            System.out.println("Health is too low. Game over");
                        }
                    }
                    playerStatus(character);
                }
                num += 1;
            } else if (choice.equals("r")) {
                if (rand.nextDouble() < 0.5) {
                    System.out.println("You ran away successfully!");
                    if (character.equals("w")) {
                        wiz.setScore(wiz.getScore() + 1);
                    } else if (character.equals("k")) {
                        kni.setScore(kni.getScore() + 1);
                    } else if (character.equals("h")) {
                        heal.setScore(heal.getScore() + 1);
                    } else if (character.equals("t")) {
                        thef.setScore(thef.getScore() + 1);
                    }
                } else {
                    System.out.println("Running failed...");
                    if (character.equals("w")) {
                        wiz.setHealth(wiz.getHealth() - 1);
                        if (wiz.getHealth() <= 0) {
                            System.out.println("Health is too low. Game over");
                        }
                    } else if (character.equals("k")) {
                        kni.setHealth(kni.getHealth() - 1);
                        if (kni.getHealth() <= 0) {
                            System.out.println("Health is too low. Game over");
                        }
                    } else if (character.equals("h")) {
                        heal.setHealth(heal.getHealth() - 1);
                        if (heal.getHealth() <= 0) {
                            System.out.println("Health is too low. Game over");
                        }
                    } else if (character.equals("t")) {
                        thef.setHealth(thef.getHealth() - 1);
                        if (thef.getHealth() <= 0) {
                            System.out.println("Health is too low. Game over");
                        }
                    }
                }
                num += 1;
            } else {
                System.out.println("Please enter either use special power or run.");
            }
        }

    }
}
