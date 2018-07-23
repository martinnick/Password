import javax.swing.*;

import java.awt.HeadlessException;
import java.awt.event.*;
import java.io.IOException;


public class PasswordKeeper
{

	public static void main(String[] args) 
	{
		
		class PkWindow extends JFrame
		{	
			
			private JPanel panel;
			private JLabel messageLabel;
			private JTextField passNumField;
			private JLabel messageLabelOne;
			private JTextField passTextField;
			private JButton storePassButton;
			private int numPasswords;
			
			private final int WINDOW_WIDTH = 640;
			private final int WINDOW_HEIGHT = 480;
			
			
			public PkWindow()
			{
				
											
				setTitle("PasswordKeeper");
				setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				
				buildPanel();
				
				add(panel);
				
				
			}
			
			private void buildPanel()
			{
				
				messageLabel = new JLabel("Please enter the number of Passwords to be stored.");
				passNumField = new JTextField(2);
				messageLabelOne = new JLabel("Please enter new password to store.");
				passTextField = new JTextField(10);
				storePassButton = new JButton("Store Password");
				
				storePassButton.addActionListener(new storePassListener());
				
				panel = new JPanel();
				
				panel.add(messageLabel);
				panel.add(passNumField);
				panel.add(messageLabelOne);
				panel.add(passTextField);
				panel.add(storePassButton);
				
				
			}
			
			class storePassListener implements ActionListener
			{
				public void actionPerformed(ActionEvent e)
				{
					
					String words;
					
					PasswordData test = new PasswordData();
					words = passTextField.getText();
					try {
						test.setPassword(words);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					numPasswords = Integer.parseInt(passNumField.getText());
								
					passTextField.setText("");
						
				
					
					PasswordData testing = new PasswordData();
					try {
						JOptionPane.showMessageDialog(null, testing.getPassword());
					} catch (HeadlessException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}
		}
		
				new PkWindow();
	}
		
}
