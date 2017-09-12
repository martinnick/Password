import javax.swing.*;


public class PasswordKeeper 
{

	public static void main(String[] args) 
	{
		
		PasswordData update = new PasswordData();
		
		 		 
		 String words = (String)JOptionPane.showInputDialog(null, "Give me what I need!");
		
				update.setPassword(words);
		
				
		JOptionPane.showMessageDialog(null, update.getPassword());
					
		
	}

}
