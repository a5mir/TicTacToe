package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author a5mir
 */
public class GameHelper {

    public int firstMove; //store number 0 or 1, that will help decide who will play first
    public char playerSign; // it can be X or O, who plays first get X
    public char botSign;
    public ArrayList<Integer> fieldsList = new ArrayList<>(); //store numbers of used fields (0-8)
    public ArrayList<Character> charList = new ArrayList<>();
//    public char[] signArray = new char[9]; //on every position store is it X or O        
    public String gameStatus;
    public boolean isFinished = false;

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

    public void chooseField(char sign, int pos) {
       charList.add(pos, sign);
    }

    public void newGame() {
        setSign();
        for(int i = 0; i< 9; i++){
        charList.add(i, '\u0000');
        }
        System.out.println(charList.get(8));
        isFinished = false;
        gameStatus = "";
    }

    public void declareWinner() {
        if (charList.get(0) == charList.get(1) && charList.get(1) == charList.get(2) && charList.get(0) != '\u0000') {
            if (charList.get(0) == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (charList.get(3) ==charList.get(4) && charList.get(4) == charList.get(5) && charList.get(3) != '\u0000') {
            if (charList.get(3) == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (charList.get(6) == charList.get(7) && charList.get(7) == charList.get(8) && charList.get(6) != '\u0000') {
            if (charList.get(6) == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (charList.get(0) == charList.get(3) && charList.get(3) == charList.get(6) && charList.get(0) != '\u0000') {
            if (charList.get(0) == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (charList.get(1) == charList.get(4) && charList.get(4) == charList.get(7) && charList.get(1) != '\u0000') {
            if (charList.get(1) == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (charList.get(2) == charList.get(5) && charList.get(5) == charList.get(8) && charList.get(2) != '\u0000') {
            if (charList.get(2) == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (charList.get(0) == charList.get(4) && charList.get(4) == charList.get(8) && charList.get(0) != '\u0000') {
            if (charList.get(0) == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (charList.get(2) == charList.get(4) && charList.get(4) == charList.get(6) && charList.get(2) != '\u0000') {
            if (charList.get(2) == 'X') {
                gameStatus = "<html><font color='red' size=5>Player1 wins</font></html>";
            } else {
                gameStatus = "<html><font color='blue' size=5>Player2 wins</font></html>";
            }
            isFinished = true;
        } else if (charList.size() == 9) {
            gameStatus = "<html><font color='black' size=5>Tie</font></html>";
            isFinished = true;
        }
    }

}
