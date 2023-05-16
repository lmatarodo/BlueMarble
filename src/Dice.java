import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Dice extends JLabel {
    private ImageIcon[] diceImages;
    private Random random;

    public Dice() {
        random = new Random();
        diceImages = new ImageIcon[6];
        for (int i = 0; i < 6; i++) {
            diceImages[i] = new ImageIcon("dice" + (i + 1) + ".png");
        }
        
        for (int i = 0; i < 6; i++) {
            Image image = diceImages[i].getImage();
            Image resizedImage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            diceImages[i] = new ImageIcon(resizedImage);
        }
    }

    public void roll() {
        int diceValue = random.nextInt(6) + 1;
        setIcon(diceImages[diceValue - 1]);
    }
}