/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
<<<<<<< Updated upstream
 * @author s550715
 */
public class Wizard extends Player {

    @Override
    public String getSpecialMove() {
        return "Cast a Spell";
    }
     
    @Override
    public void useSpecialMove(){
        System.out.println("wizard  special's move is ' Cast  Spell '");
    }
    @Override
    public String toString (){
        return "wizard"+super.toString();

}
}
