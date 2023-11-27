/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s550715
 */
public abstract class Player {

    private int health;
    private int score;

    public Player(int health, int score) {
        this.health = health;
        this.score = score;
    }

    public Player() {
        this.health = 10;
        this.score = 0;
    }

    public abstract String getSpecialMove();
            

    public abstract void useSpecialMove();

}
