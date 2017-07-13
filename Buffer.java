package threadsExamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer {
	public static void main(String args[])  {
		BufferedReader fileread=null;
	BufferedWriter filewrite=null;
		
			try {
				
				fileread=new BufferedReader(new FileReader("D://inputFilebuffer.txt"));
				filewrite=new BufferedWriter(new FileWriter("D://oututFilebuffer.txt"));
				
				String str=null;
				while((str=fileread.readLine())!=null) {
					filewrite.write(str);
					System.out.println(str);
				}
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch ( IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}	
	}

