package tictactoe;

import java.util.Arrays;

/**
 *
 * @author asmir465
 */
public class TicTacToe extends GameHelper {

    public char sign;
    public int position;
    public char[] signArray = new char[9];
    boolean isFinished = false;
    String status;

    public TicTacToe() {
    }

    public void setCorrectSign() {
        if (sign == 'X') {
            sign = 'O';
        } else {
            sign = 'X';
        }
    }

    public void registerSign(int position) {
        signArray[position] = sign;
    }
    
   
    
    public void newGame(){
        sign = '\u0000';
        Arrays.fill(signArray, '\u0000');
        isFinished=false;
    }
    
    

    public void declareWinner() {
        int isFull = 0;
        for (char arrays : signArray) {
            if (arrays != '\u0000') {
                isFull++;
            }
        }
        if (signArray[0] == signArray[1] && signArray[1] == signArray[2] && signArray[0] != '\u0000') {
            if (signArray[0] == 'X') {
                status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[3] == signArray[4] && signArray[4] == signArray[5] && signArray[3] != '\u0000') {
            if (signArray[3] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[6] == signArray[7] && signArray[7] == signArray[8] && signArray[6] != '\u0000') {
            if (signArray[6] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[0] == signArray[3] && signArray[3] == signArray[6] && signArray[0] != '\u0000') {
            if (signArray[0] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[1] == signArray[4] && signArray[4] == signArray[7] && signArray[1] != '\u0000') {
            if (signArray[1] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[2] == signArray[5] && signArray[5] == signArray[8] && signArray[2] != '\u0000') {
            if (signArray[2] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[0] == signArray[4] && signArray[4] == signArray[8] && signArray[0] != '\u0000') {
            if (signArray[0] == 'X') {
                status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[2] == signArray[4] && signArray[4] == signArray[6] && signArray[2] != '\u0000') {
            if (signArray[2] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (isFull == 9) {
            status ="<html><font color='black' size=5>Tie</font></html>";
            isFinished = true;
        }
    }

}
