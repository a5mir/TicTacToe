package tictactoe;

import java.util.Arrays;

/**
 *
 * @author asmir465
 */
public class TicTacToe {

    public char sign;
    public int position;
    public char[] array = new char[9];
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
        array[position] = sign;
    }
    
   
    
    public void newGame(){
        sign = '\u0000';
        Arrays.fill(array, '\u0000');
        isFinished=false;
    }
    
    

    public void declareWinner() {
        int isFull = 0;
        for (char arrays : array) {
            if (arrays != '\u0000') {
                isFull++;
            }
        }
        if (array[0] == array[1] && array[1] == array[2] && array[0] != '\u0000') {
            if (array[0] == 'X') {
                status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (array[3] == array[4] && array[4] == array[5] && array[3] != '\u0000') {
            if (array[3] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (array[6] == array[7] && array[7] == array[8] && array[6] != '\u0000') {
            if (array[6] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (array[0] == array[3] && array[3] == array[6] && array[0] != '\u0000') {
            if (array[0] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (array[1] == array[4] && array[4] == array[7] && array[1] != '\u0000') {
            if (array[1] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (array[2] == array[5] && array[5] == array[8] && array[2] != '\u0000') {
            if (array[2] == 'X') {
                 status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (array[0] == array[4] && array[4] == array[8] && array[0] != '\u0000') {
            if (array[0] == 'X') {
                status = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                status = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (array[2] == array[4] && array[4] == array[6] && array[2] != '\u0000') {
            if (array[2] == 'X') {
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
