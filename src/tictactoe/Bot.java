/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;

/**
 *
 * @author asmir465
 */
public class Bot extends GameHelper {

    int firstPosition;
    int nextMove;
    ArrayList<Integer> posArray = new ArrayList<>();
    boolean isAvailable;
    char sign = 'O';
    
    public void move(){
        if()
    }
    

    public void makeMove() {
        if (firstPlay() == 1) {
            firstPosition = (int) (Math.random() * 9);
            sign = 'X';
            nextMove = firstPosition;
        } else {
                firstPosition = (int) (Math.random() * 9);
                if(posArray.indexOf(firstPosition) != -1){
                   nextMove = firstPosition;
            }
        }
    }

}
