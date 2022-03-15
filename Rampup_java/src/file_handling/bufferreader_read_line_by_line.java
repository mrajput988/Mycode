package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferreader_read_line_by_line {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\Admin\\Desktop\\manoj.txt");  // File is used for connection establishment.
		FileReader fr = new FileReader(f);                         // FileReader used for read character by character file from the file.
		BufferedReader br= new BufferedReader(fr);                 // BufferedReader is used to read line by line
		String a;
		while((a=br.readLine())!=null)                              // read while character value not =-1.
		{
			System.out.println(a);                                  // Explicit conversation and print value by default print asci values.
		}


	}

}
