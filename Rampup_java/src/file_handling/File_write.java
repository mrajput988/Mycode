package file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_write {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\Admin\\Desktop\\singh.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		System.out.println("Please enter string");
		for(int i=0;i<5;i++)
		{
			Scanner s = new Scanner(System.in);
			String a= s.nextLine();  // nextLine usedfoe string 
			bw.write(a);
			bw.newLine();  // used for new line
			
		}

		bw.close();
	}

}
