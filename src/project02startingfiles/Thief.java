/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S550715
 */
public class Thief extends Player {

    public Thief(int health, int score) {
        super(health, score);
    }

    @Override
    public String getSpecialMove() {
        return "Sneak By";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Thief Special' move is ' Sneak By' ");

    }

    @Override
    public String toString() {
        return "Thief" + super.toString();
    }

}
