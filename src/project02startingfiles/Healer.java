/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S561831
 */
public class Healer extends Player{
    
    @Override
    public String getSpecialMove(){
        return "Use Sleeping Powder";
    }
    @Override
    public void useSpecialMove(){
        System.out.println("Healer special' move is 'sleeping Powder' ");
      
    }
    @Override
    public String toString() {
        return "Healer"+super.toString();
    }
    

    
}
