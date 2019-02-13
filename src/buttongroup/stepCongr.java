/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttongroup;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author SYVY
 */
public class stepCongr extends javax.swing.JFrame {

    void display() {
        JFrame f = new JFrame("ВІТАЮ!!!");
        String s = "Ви пройшли навчання на тренажері методом Ленда та Дойга для цілочислового програмування";
        MarqueePanel mp = new MarqueePanel(s, 135);
        f.add(mp);
        f.pack();
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        mp.start();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stepCongr().display();
            }
        });
    }
}

class MarqueePanel extends JPanel implements ActionListener {

    public static final int Rate = 15;
    final Timer t = new Timer(1000 / Rate, this);
    final JLabel l = new JLabel();
    final String s;
    final int n;
    int index;
    
    public MarqueePanel(String s, int n) {
        if (s == null || n < 1) {
            throw new IllegalArgumentException("Null String or n < 1");
        }
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(' ');
        }
        this.s = sb + s + sb;
        this.n = n;
        l.setFont(new Font("Serif,", Font.BOLD, 36));
        l.setText(sb.toString());
        this.add(l);
    }
    
    public void start() {
        t.start();
    }

    public void stop() {
        t.stop();
    }
    
    public void actionPerformed(ActionEvent e) {
        index++;
        if (index > s.length() - n) {
            index = 0;
        }
        l.setText(s.substring(index, index + n));
    }
    
}
