package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_read_chracter_by_char {

	public static void main(String[] args) throws IOException 
	{
    
		File f= new File("C:\\Users\\Admin\\Desktop\\manoj.txt");  // File is used for connection establishment.
		FileReader fr = new FileReader(f);  // FileReader used for read character by character file from the file.
		int a;
		while((a=fr.read())!=-1)   // read while character value not =-1.
		{
			System.out.print((char)a); // Explicit conversation and print value by default print asci values.
		}

		

	}

}
