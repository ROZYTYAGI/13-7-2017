package threadsExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByte {
public static void main(String args[])  {
	FileInputStream fileinputstream=null;
	FileOutputStream fileoutputstream=null;
	
		try {
			
			fileinputstream=new FileInputStream("D://inputFile.txt");
			fileoutputstream=new FileOutputStream("D://outputStream.txt");
			int c=0;
			try {
				while((c=fileinputstream.read())!=-1) {
					fileoutputstream.write(c);;
					System.out.println((char)c);
			/*	while(fileinputstream.read()!=-1) {
				fileoutputstream.write(fileinputstream.read());	
				System.out.println(fileinputstream.read());
				System.out.println((char)fileinputstream.read());*/
				
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fileinputstream!=null) {
				try {
					fileinputstream.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(fileoutputstream!=null) {
				try {
					fileoutputstream.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				
			}
		}
		}
}
}
		
			
		
	
	 


