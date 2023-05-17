package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Board {
    private JPanel boardPanel;
    private JFrame frame;
    private Dice dice;

    public Board() {
        frame = new JFrame("Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        boardPanel = new JPanel(new GridBagLayout()) {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("board.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        dice = new Dice();

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(100, 0, 0, 0); 
        boardPanel.add(dice, gbc);

        JButton rollButton = new JButton("ì£¼ì‚¬?œ„ êµ´ë¦¬ê¸?");
        rollButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dice.roll();
            }
        });

        gbc.gridy = 2;
        gbc.insets = new Insets(10, 0, 0, 0); 
        boardPanel.add(rollButton, gbc);

        frame.add(boardPanel, BorderLayout.CENTER);
        frame.setPreferredSize(new Dimension(1000, 1000));
    }

    public void displayBoard() {
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Board board = new Board();
            board.displayBoard();
        });
    }
}

