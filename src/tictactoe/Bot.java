/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author asmir465
 */
public class Bot extends GameHelper{

    int firstPosition;
    int nextMove;
    boolean isAvailable = true;
    char sign;
    
    public Bot(){
        newGame();
    }
   
    public void getSign(){
        sign = super.botSign;
    }
    
    public void firstMove(){
        int position = (int) (Math.random() * 9);
        nextMove = position;
    }
    
    
    public void move(){
            while(isAvailable){
            int pos = (int) (Math.random() *9);
            if(charList.get(pos) ==  '\u0000'){
                nextMove = pos;
                isAvailable = false;
            }
            }
        }
    
   
}
