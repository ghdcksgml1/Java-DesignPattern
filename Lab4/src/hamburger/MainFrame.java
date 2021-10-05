package hamburger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    JButton[] buttons = new JButton[9];
    Hamburger hamburger = new EmptyHamburger(); // default

    public MainFrame(){
        JPanel displayPanel = new JPanel(new BorderLayout());
        displayPanel.add(hamburger);
        buttons[0] = new JButton("BeefPatty");
        buttons[0].addActionListener(this);
        buttons[1] = new JButton("ChickenPatty");
        buttons[1].addActionListener(this);
        buttons[2] = new JButton("ShrimpPatty");
        buttons[2].addActionListener(this);
        buttons[3] = new JButton("Cheese");
        buttons[3].addActionListener(this);
        buttons[4] = new JButton("Lettuce");
        buttons[4].addActionListener(this);
        buttons[5] = new JButton("Tomato");
        buttons[5].addActionListener(this);
        buttons[6] = new JButton("Onion");
        buttons[6].addActionListener(this);
        buttons[7] = new JButton("Start Stack Burger");
        buttons[7].addActionListener(this);
        buttons[8] = new JButton("Finish");
        buttons[8].addActionListener(this);


        JPanel buttonPanel = new JPanel(new GridLayout(3,1));
        buttonPanel.setBackground(Color.gray);
        for(int i=0;i<9;i++){
            buttonPanel.add(buttons[i]);
        }

        this.add(displayPanel);
        this.add(buttonPanel);
        setSize(700,800);
        setTitle("Hamburger");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args){
        new MainFrame();
    }


}
