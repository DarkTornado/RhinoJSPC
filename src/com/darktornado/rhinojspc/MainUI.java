package com.darktornado.rhinojspc;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class MainUI {

    public static void main(String[] args) {
    	new MainUI().onCreate();
    }
    
    private JMenuBar createTitleBar(final JTextArea input, final JTextArea output) {
        JMenuBar title = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenuItem item11 = new JMenuItem("Exit");
        item11.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        menu1.add(item11);
        title.add(menu1);

        JMenu menu2 = new JMenu("Run");
        JMenuItem item21 = new JMenuItem("Run Source");
        item21.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String src = input.getText();
        		System.out.println(src);
        	}
        });
        menu2.add(item21);
        title.add(menu2);

        return title;
    	
    }
    
    private void onCreate() {
        JFrame window = new JFrame("JS Executor via Rhino");
        window.setLayout(new GridLayout(1, 2, 10, 10));

        JTextArea input = new JTextArea();
        input.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        window.add(input);
        JTextArea output = new JTextArea();
        output.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        window.add(output);

        JMenuBar title = createTitleBar(input, output);
        window.setJMenuBar(title);
        
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setVisible(true);
    }
    

}