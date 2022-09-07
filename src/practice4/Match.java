package practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JFrame {
    private int x = 0;
    private int y = 0;
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel label1 = new JLabel("Result: " + x + " X " + y);

    JLabel label2 = new JLabel("Last Scorer: N/A");


    JLabel label3 = new JLabel("Winner: DRAW");

    JPanel[] pnl = new JPanel[6];
    Match(){
        super("Match");
        setLayout(new GridLayout(2, 3));
        setSize(500,200);

        for (int i = 0; i < 6; ++i) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[0].add(button1);
        pnl[1].add(label1);
        pnl[2].add(button2);
        pnl[3].add(label2);
        //add(label_t);
        pnl[5].add(label3);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x++;
                label1.setText("Result: " + x + " X " + y);
                label2.setText("Last Scorer: Milan");
                if (x > y){
                    label3.setText("Winner: Milan");
                }else if (x == y){
                    label3.setText("Winner: DRAW");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y++;
                label1.setText("Result: " + x + " X " + y);
                label2.setText("Last Scorer: Real Madrid");
                if (x < y){
                    label3.setText("Winner: Real Madrid");
                }else if (x == y){
                    label3.setText("Winner: DRAW");
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Match();
    }
}
