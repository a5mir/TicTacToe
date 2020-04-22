package tictactoe;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
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
    JPanel p00 = new JPanel();
    JPanel p01 = new JPanel();
    JPanel p02 = new JPanel();
    JPanel p10 = new JPanel();
    JPanel p11 = new JPanel();
    JPanel p12 = new JPanel();
    JPanel p20 = new JPanel();
    JPanel p21 = new JPanel();
    JPanel p22 = new JPanel();
    JLabel playerLabel = new JLabel("Player 1");
    JButton restartButton = new JButton();
    JButton statistics = new JButton();
    JLabel sign = new JLabel();
    GridBagLayout gbLayout = new GridBagLayout();
//    JLabel result = new JLabel("test");

    public GameFrame() {
        initComponents();
    }

    private void initComponents() {

        this.add(gamePanel);
        this.add(statisticPanel);

        gamePanel.add(p00);
        gamePanel.add(p01);
        gamePanel.add(p02);
        gamePanel.add(p10);
        gamePanel.add(p11);
        gamePanel.add(p12);
        gamePanel.add(p20);
        gamePanel.add(p21);
        gamePanel.add(p22);

        gamePanel.setSize(304, 304);
        gamePanel.setLayout(new GridLayout(3, 3, 2, 2));
        p00.setBackground(Color.gray);
        p01.setBackground(Color.gray);
        p02.setBackground(Color.gray);
        p10.setBackground(Color.gray);
        p11.setBackground(Color.gray);
        p12.setBackground(Color.gray);
        p20.setBackground(Color.gray);
        p21.setBackground(Color.gray);
        p22.setBackground(Color.gray);

        gamePanel.setBackground(Color.white);

        statisticPanel.setLayout(null);
        statisticPanel.setSize(304, 50);
        statisticPanel.setBackground(Color.yellow);
        statisticPanel.setLocation(0, 304);

        statisticPanel.add(playerLabel);
        statisticPanel.add(restartButton);
//        statisticPanel.add(result);
//        statisticPanel.add(statistics);

        playerLabel.setSize(80, 10);
        playerLabel.setLocation(5, 5);
//        result.setLocation(100,20);
//
//        p00.setLayout(new GridLayout());

        p02.setLayout(gbLayout);
        p02.add(sign);
        p10.setLayout(gbLayout);
        p10.add(sign);
        p11.setLayout(gbLayout);
        p11.add(sign);
        p12.setLayout(gbLayout);
        p12.add(sign);
        p20.setLayout(gbLayout);
        p20.add(sign);
        p21.setLayout(gbLayout);
        p21.add(sign);
        p22.setLayout(gbLayout);
        p22.add(sign);

        this.setLayout(null);
        this.setTitle("Tic-Tac-Toe");
//        this.setLocationRelativeTo(null);
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 400);

        p00.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                p00.setLayout(gbLayout);
                p00.add(sign);
                sign.setText("<html><font color ='blue' size=20>X</font></html>");
            }
        });

        p01.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                p01.setLayout(gbLayout);
                p01.add(sign);
                sign.setText("<html><font color ='blue' size=20>X</font></html>");
            }
        });

        p02.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                sign.setText("<html><font color ='blue' size=20>X</font></html>");
            }
        });

        p10.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                sign.setText("<html><font color ='blue' size=20>X</font></html>");
            }
        });

        p11.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                sign.setText("<html><font color ='blue' size=20>X</font></html>");
            }
        });

        p12.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                sign.setText("<html><font color ='blue' size=20>X</font></html>");
            }
        });

        p20.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                sign.setText("<html><font color ='blue' size=20>X</font></html>");
            }
        });

        p21.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                sign.setText("<html><font color ='blue' size=20>X</font></html>");
            }
        });

        p22.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                sign.setText("<html><font color ='blue' size=20>X</font></html>");
            }
        });

    }

}
