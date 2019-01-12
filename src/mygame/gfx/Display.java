package mygame.gfx;

import javax.swing.*;
import java.awt.*;

public class Display {
    private int width;
    private int height;
    private String title;

    private JFrame frame;
    private Canvas canvas;

    public Display(String title, int width, int height){

        this.width = width;
        this.height = height;
        this.title = title;

        createWindow();

    }

    private void createWindow(){

        this.frame = new JFrame(title);
        Dimension d = new Dimension(width, height);
        frame.setSize(d);
        frame.setMaximumSize(d);
        frame.setMinimumSize(d);
        frame.setPreferredSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        this.canvas = new Canvas();
        canvas.setMinimumSize(d);
        canvas.setMaximumSize(d);
        canvas.setPreferredSize(d);

        frame.add(canvas);
        frame.pack();



    }


}
