package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTOTwoFiles
{

	void writeTwoDestinations()
	{
		String sourseFileName = "s1.txt";
		String destinationFileName1="destination1.txt";//replace with the first dest. file
		String destinationFileName2="destination2.txt"; // replace with thw 2nd dest. file
		
		try
		{
			// open the  source file for reading
			FileInputStream  sourceFile = new FileInputStream(sourseFileName);
			
			//open the first destination for writing
			FileOutputStream destinationfile1 =new FileOutputStream(destinationFileName1);
			
			//open the first destination for writing
			FileOutputStream destinationfile2 =new FileOutputStream(destinationFileName2);
			
			//create a buffer to hold data
			byte[] buffer =new byte[1024];
			int byteRead;
			
			//read from the source file and write to the first destination file
			
			while ( (byteRead =  sourceFile.read(buffer)) !=-1)
			{
				destinationfile1.write(buffer,0, byteRead);
				destinationfile2.write(buffer,0, byteRead);
				
			}
			
		//	close the file
			sourceFile.close();
			destinationfile1.close();
			destinationfile2.close();
			
			System.out.println("Data copied to Two destination file successfully");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 CopyTOTwoFiles copy= new  CopyTOTwoFiles();
		 copy.writeTwoDestinations();
	}

}
