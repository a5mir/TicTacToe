package tictactoe;

import java.util.ArrayList;

/**
 *
 * @author a5mir
 */
public class GameHelper {

    int firstMove; //store number 0 or 1, that will help decide who will play first
    char playerSign; // it can be X or O, who plays first get X
    char botSign;
    ArrayList<Integer> fieldsList = new ArrayList<>(); //store numbers of used fields (0-8)
    char[] signArray = new char[9]; //on every position store is it X or O        
    String gameStatus;
    boolean isFinished = false;

    //consturctor
    public GameHelper() {
    }

    public void declareFirstMove() {
        firstMove = (int) (Math.random() * 2);
    }

    public void setSign() {
        declareFirstMove();
        if (firstMove == 0) {
            playerSign = 'X';
            botSign = 'O';
        } else {
            playerSign = 'O';
            botSign = 'X';
        }
    }

    public void freeFields(int fields) {
        fieldsList.add(fields);
    }

    public void chooseField(char sign, int position) {
        signArray[position] = sign;
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
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[3] == signArray[4] && signArray[4] == signArray[5] && signArray[3] != '\u0000') {
            if (signArray[3] == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[6] == signArray[7] && signArray[7] == signArray[8] && signArray[6] != '\u0000') {
            if (signArray[6] == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[0] == signArray[3] && signArray[3] == signArray[6] && signArray[0] != '\u0000') {
            if (signArray[0] == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[1] == signArray[4] && signArray[4] == signArray[7] && signArray[1] != '\u0000') {
            if (signArray[1] == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[2] == signArray[5] && signArray[5] == signArray[8] && signArray[2] != '\u0000') {
            if (signArray[2] == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[0] == signArray[4] && signArray[4] == signArray[8] && signArray[0] != '\u0000') {
            if (signArray[0] == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (signArray[2] == signArray[4] && signArray[4] == signArray[6] && signArray[2] != '\u0000') {
            if (signArray[2] == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (isFull == 9) {
            gameStatus = "<html><font color='black' size=5>Tie</font></html>";
            isFinished = true;
        }
    }

}
