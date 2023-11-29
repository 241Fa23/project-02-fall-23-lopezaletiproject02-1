/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S561831
 */
public class Knight extends Player {

    public Knight(int health, int score) {
        super(health, score);
    }

    public String getSpecialMove() {
        return "Slash with Sword";
    }

    public void useSpecialMove() {
        System.out.println("Knight Special movie is 'slashed with your sword' ");

    }

    public String toString() {
        return "Knight" + super.toString();
    }

}
