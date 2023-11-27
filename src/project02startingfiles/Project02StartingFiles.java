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
        Knifhg //Import the scanner for user input
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

            System.out.println("Welcome, Theif!");
        }

        System.out.println("What  would you like to do?");
        System.out.print("{?}Status Report? || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit\n>>");
        String choice = input.nextLine();

        while (choice != "q") {
            Random rand = new Random();
            int option = rand.nextInt(1, 4);
            switch (option) {
                case 1:
                    System.out.println("**********************\nNothing here...\n**********************");
            }
            switch (option) {
                case 2:
                    System.out.println("**********************\nNice trees around here...\n**********************");
            }
            switch (option) {
                case 3:
                    System.out.println("**********************\nInteresting cottage...\n**********************");
            }
            switch (option) {
                case 4:
                    System.out.println("**********************\nPotty break...\n**********************");

            }
            System.out.println("What  would you like to do?");
            System.out.print("{?}Status Report? || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit\n>>");
            choice = input.nextLine();
        }

    }
}
