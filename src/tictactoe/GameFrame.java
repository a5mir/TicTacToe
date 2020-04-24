package tictactoe;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author asmir465
 */
public class GameFrame extends JFrame {

    JPanel gamePanel = new JPanel();
    JPanel statisticPanel = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    JPanel p6 = new JPanel();
    JPanel p7 = new JPanel();
    JPanel p8 = new JPanel();
    JPanel p9 = new JPanel();

    JLabel p1Label = new JLabel();
    JLabel p2Label = new JLabel();
    JLabel p3Label = new JLabel();
    JLabel p4Label = new JLabel();
    JLabel p5Label = new JLabel();
    JLabel p6Label = new JLabel();
    JLabel p7Label = new JLabel();
    JLabel p8Label = new JLabel();
    JLabel p9Label = new JLabel();

    JLabel outcomeLabel = new JLabel("");
    JButton newGameButton = new JButton("New Game");

    GridBagLayout gbLayout = new GridBagLayout();
    
    
    GameHelper game = new GameHelper();
    Bot bot = new Bot();
//    Bot bot;
    

    public GameFrame() {
        initComponents();
    }

    private void initComponents() {
        game.newGame();
//        bot = new Bot(game.botSign);
        this.add(gamePanel);
        this.add(statisticPanel);

        gamePanel.add(p1);
        gamePanel.add(p2);
        gamePanel.add(p3);
        gamePanel.add(p4);
        gamePanel.add(p5);
        gamePanel.add(p6);
        gamePanel.add(p7);
        gamePanel.add(p8);
        gamePanel.add(p9);

        gamePanel.setSize(304, 304);
        gamePanel.setLayout(new GridLayout(3, 3, 2, 2));
        p1.setBackground(Color.gray);
        p2.setBackground(Color.gray);
        p3.setBackground(Color.gray);
        p4.setBackground(Color.gray);
        p5.setBackground(Color.gray);
        p6.setBackground(Color.gray);
        p7.setBackground(Color.gray);
        p8.setBackground(Color.gray);
        p9.setBackground(Color.gray);

        gamePanel.setBackground(Color.white);

        statisticPanel.setLayout(null);
        statisticPanel.setSize(304, 50);
        statisticPanel.setBackground(Color.gray);
        statisticPanel.setLocation(0, 306);

        statisticPanel.add(outcomeLabel);
        statisticPanel.add(newGameButton);

        outcomeLabel.setSize(150, 20);
        outcomeLabel.setLocation(5, 12);
        newGameButton.setSize(120, 30);
        newGameButton.setLocation(160, 7);

        p1.setLayout(gbLayout);
        p1.add(p1Label);
        p2.setLayout(gbLayout);
        p2.add(p2Label);
        p3.setLayout(gbLayout);
        p3.add(p3Label);
        p4.setLayout(gbLayout);
        p4.add(p4Label);
        p5.setLayout(gbLayout);
        p5.add(p5Label);
        p6.setLayout(gbLayout);
        p6.add(p6Label);
        p7.setLayout(gbLayout);
        p7.add(p7Label);
        p8.setLayout(gbLayout);
        p8.add(p8Label);
        p9.setLayout(gbLayout);
        p9.add(p9Label);

        this.setLayout(null);
        this.setTitle("Tic-Tac-Toe");
//        this.setLocationRelativeTo(null);
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(304, 390);
        this.setResizable(false);

        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (p1Label.getText().isEmpty() && !game.isFinished) {
                    p1MouseReleased(evt);
                }
            }
        });
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (p2Label.getText().isEmpty()) {
                    p2MouseReleased(evt);
                }
            }
        });
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (p3Label.getText().isEmpty() && !game.isFinished) {
                    p3MouseReleased(evt);
                }
            }
        });
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (p4Label.getText().isEmpty() && !game.isFinished) {
                    p4MouseReleased(evt);
                }
            }
        });
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (p5Label.getText().isEmpty() && !game.isFinished) {
                    p5MouseReleased(evt);
                }
            }
        });
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (p6Label.getText().isEmpty() && !game.isFinished) {
                    p6MouseReleased(evt);
                }
            }
        });
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (p7Label.getText().isEmpty() && !game.isFinished) {
                    p7MouseReleased(evt);
                }
            }
        });
        p8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (p8Label.getText().isEmpty() && !game.isFinished) {
                    p8MouseReleased(evt);
                }
            }
        });
        p9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (p9Label.getText().isEmpty() && !game.isFinished) {
                    p9MouseReleased(evt);
                }
            }
        });

        newGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newGameButtonReleased(evt);
            }
        });

    }

    private void mouseHelper() {

    }

    private void p1MouseReleased(java.awt.event.MouseEvent evt) {

        char tempChar = game.playerSign;
        if (tempChar == 'X') {
            p1Label.setText("<html><font color='red' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        } else {
            p1Label.setText("<html><font color='blue' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        }
        
        game.chooseField(tempChar, 0);
        game.declareWinner();
        outcomeLabel.setText(game.gameStatus);
        bot.move();
        botMove();
//        botMove();

    }

    private void p2MouseReleased(java.awt.event.MouseEvent evt) {

        char tempChar = game.playerSign;
        if (tempChar == 'X') {
            p2Label.setText("<html><font color='red' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        } else {
            p2Label.setText("<html><font color='blue' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        }
        
        game.chooseField(tempChar, 1);
        game.declareWinner();
        outcomeLabel.setText(game.gameStatus);
        bot.move();
        botMove();
//        botMove();
    }

    private void p3MouseReleased(java.awt.event.MouseEvent evt) {
        char tempChar = game.playerSign;
        if (tempChar == 'X') {
            p3Label.setText("<html><font color='red' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        } else {
            p3Label.setText("<html><font color='blue' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        }
     
        game.chooseField(tempChar, 2);
        game.declareWinner();
        outcomeLabel.setText(game.gameStatus);
        bot.move();
        botMove();
//        botMove();
    }

    private void p4MouseReleased(java.awt.event.MouseEvent evt) {
        char tempChar = game.playerSign;
        if (tempChar == 'X') {
            p4Label.setText("<html><font color='red' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        } else {
            p4Label.setText("<html><font color='blue' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        }
       
        game.chooseField(tempChar, 3);
        game.declareWinner();
        outcomeLabel.setText(game.gameStatus);
        bot.move();
        botMove();
//        botMove();
    }

    private void p5MouseReleased(java.awt.event.MouseEvent evt) {
        char tempChar = game.playerSign;
        if (tempChar == 'X') {
            p5Label.setText("<html><font color='red' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        } else {
            p5Label.setText("<html><font color='blue' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        }
       
        game.chooseField(tempChar, 4);
        game.declareWinner();
        outcomeLabel.setText(game.gameStatus);
        bot.move();
        botMove();
//        botMove();
    }

    private void p6MouseReleased(java.awt.event.MouseEvent evt) {
        char tempChar = game.playerSign;
        if (tempChar == 'X') {
            p6Label.setText("<html><font color='red' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        } else {
            p6Label.setText("<html><font color='blue' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        }
     
        game.chooseField(tempChar, 5);
        game.declareWinner();
        outcomeLabel.setText(game.gameStatus);
        bot.move();
        botMove();
//        botMove();
    }

    private void p7MouseReleased(java.awt.event.MouseEvent evt) {
       char tempChar = game.playerSign;
        if (tempChar == 'X') {
            p7Label.setText("<html><font color='red' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        } else {
            p7Label.setText("<html><font color='blue' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        }
      
        game.chooseField(tempChar, 6);
        game.declareWinner();
        outcomeLabel.setText(game.gameStatus);
        bot.move();
        botMove();
//        botMove();
    }

    private void p8MouseReleased(java.awt.event.MouseEvent evt) {
        char tempChar = game.playerSign;
        if (tempChar == 'X') {
            p8Label.setText("<html><font color='red' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        } else {
            p8Label.setText("<html><font color='blue' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        }
      
        game.chooseField(tempChar, 7);
        game.declareWinner();
        outcomeLabel.setText(game.gameStatus);
        bot.move();
        botMove();
//        botMove();
    }

    private void p9MouseReleased(java.awt.event.MouseEvent evt) {
       char tempChar = game.playerSign;
        if (tempChar == 'X') {
            p9Label.setText("<html><font color='red' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        } else {
            p9Label.setText("<html><font color='blue' size=15>" + String.valueOf(game.playerSign) + "</font></html>");
        }
   
        game.chooseField(tempChar, 8);
        game.declareWinner();
        outcomeLabel.setText(game.gameStatus);
        bot.move();
        botMove();
//        botMove();
    }

    private void botMove() {
        switch (bot.nextMove) {
            case 0:
                p1Label.setText("<html><font color='black' size=15>" + bot.sign + "</font></html>");
                System.out.println("1");
                break;
            case 1:
                p2Label.setText("<html><font color='black' size=15>" + bot.sign + "</font></html>");
                System.out.println("2");
                break;
            case 2:
                p3Label.setText("<html><font color='black' size=15>" + bot.sign + "</font></html>");
                System.out.println("3");
                break;
            case 3:
                p4Label.setText("<html><font color='black' size=15>" + bot.sign + "</font></html>");
                System.out.println("4");
                break;
            case 4:
                p5Label.setText("<html><font color='black' size=15>" + bot.sign + "</font></html>");
                System.out.println("5");
                break;
            case 5:
                p6Label.setText("<html><font color='black' size=15>" + bot.sign + "</font></html>");
                System.out.println("6");
                break;
            case 6:
                p7Label.setText("<html><font color='black' size=15>" + bot.sign + "</font></html>");
                System.out.println("7");
                break;
            case 7:
                p8Label.setText("<html><font color='black' size=15>" + bot.sign + "</font></html>");
                System.out.println("8");
                break;
            case 8:
                p9Label.setText("<html><font color='black' size=15>" + bot.sign + "</font></html>");
                System.out.println("9");
                break;
            default: 
                System.out.println("DEFAULT");
                break;
        }

    }

    private void newGameButtonReleased(java.awt.event.MouseEvent evt) {
        game.newGame();
        bot.sign = game.botSign;
        if(bot.sign == 'X'){
            bot.firstMove();
            botMove();
        }
        p1Label.setText("");
        p2Label.setText("");
        p3Label.setText("");
        p4Label.setText("");
        p5Label.setText("");
        p6Label.setText("");
        p7Label.setText("");
        p8Label.setText("");
        p9Label.setText("");
        outcomeLabel.setText("");
    }

}
