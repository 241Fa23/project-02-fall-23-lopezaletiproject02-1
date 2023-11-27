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

    public String getSpecialMove() {
        return "Cast a Spell";
    }
     
    public void useSpecialMove(){
        System.out.println("wizard uses special moves Cast a Spell");
    }
    public String toString (){
        return "wizard"+super.toString();

}
}
