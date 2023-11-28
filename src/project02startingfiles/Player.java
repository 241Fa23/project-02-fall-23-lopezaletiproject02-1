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

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }
     public String toString() {
        return "Health: " + health + "\nScore: " + score;
}
     
    public abstract String getSpecialMove();

    public abstract void useSpecialMove();
}
