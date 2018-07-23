import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class PasswordData 
{
	
	private String password;
	private String descript;
				
		public PasswordData() 
		{
			
		}
		
		public String getPassword() throws IOException
		{
			
			FileInputStream fstream = new FileInputStream("Password.dat");
			
			DataInputStream inputFile = new DataInputStream(fstream);
			
			password = "clown";
			password = inputFile.readUTF(); 
			inputFile.close();
			return password;
		}	
		
		public String getDescript() 
		{
			return descript;
		}

		public void setPassword(String password) throws IOException
		{
			FileOutputStream fstream = new FileOutputStream("Password.dat", true);
			
			DataOutputStream outputFile = new DataOutputStream(fstream);
			
			this.password = password;
			
			outputFile.writeUTF(password);
			
			outputFile.close();
		}
		
		public void setDescript(String descript) 
		{
			this.descript = descript;
		}
		
	
	
	
	}

