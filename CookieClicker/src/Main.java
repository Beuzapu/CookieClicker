import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Main implements ActionListener, MouseListener{
	
	JFrame frame;
	JLabel GameNameLabel, ScoreLabel, CookieIMGLabel;
	JButton ClickBtn;
	 
	int score = 0; // Variable to keep track of the score
	
	// new font for text
	Font myFont = new Font("Ink Free", Font.BOLD,30);
	
	// Font for ScoreLabel
	Font ScoreFont = new Font("Ink Free", Font.BOLD, 50);
	//Frame Icon
	ImageIcon image = new ImageIcon("Cookie.png");
	ImageIcon Cookie = new ImageIcon("Cookie.png");
	
	
	
	
	
	
	
	Main(){
		// Game Label
		GameNameLabel = new JLabel("COOKIE CLICKER");
		GameNameLabel.setBounds(200,50,275,70);
		GameNameLabel.setFont(myFont);
		
		
		// Cookie Image for clicking
		 CookieIMGLabel = new JLabel();
		 CookieIMGLabel.setVisible(true);
		//Setting image Size
		Image Cookie1 = Cookie.getImage();
		Image newCookie = Cookie1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		Cookie = new ImageIcon(newCookie);
		CookieIMGLabel.setIcon(Cookie);
		CookieIMGLabel.setBounds(225,225,200,200);
		
		 // Add mouse listener to CookieIMGLabel
        CookieIMGLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                score++; // Increment score by 1
                ScoreLabel.setText(String.valueOf(score)); // Update ScoreLabel
            }
        });
		
		// ScoreLabel
		ScoreLabel = new JLabel("0");
		ScoreLabel.setBounds(300,130,100,60);
		ScoreLabel.setFont(ScoreFont);
		
		// Click Button
		ClickBtn = new JButton("Click");
		ClickBtn.setBounds(250,500,150,50);
		ClickBtn.setFocusable(false);
		ClickBtn.setBackground(Color.WHITE);
		ClickBtn.addActionListener(this);
		
		
		
		//Main frame
		frame = new JFrame("Cookie Clicker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,700);
		frame.getContentPane().setBackground(Color.GRAY);
		
		// Adding Components to frames
		frame.add(GameNameLabel);
		frame.add(ScoreLabel);
		frame.add(CookieIMGLabel);
		frame.add(ClickBtn);
		
		
		
		frame.setLayout(null);
		frame.setIconImage(image.getImage());
		frame.setVisible(true);
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		Main main = new Main();
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ClickBtn) {
			 score++; // Increment score by 1
	            ScoreLabel.setText(String.valueOf(score)); // Update ScoreLabel
		}
		
		 
		
	}





	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
