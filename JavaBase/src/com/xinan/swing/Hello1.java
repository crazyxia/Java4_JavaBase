package com.xinan.swing;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Hello1 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hello1 frame = new Hello1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hello1() {
		setBounds(100, 100, 450, 300);

	}

}
