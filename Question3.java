package SaturdayLabAssignment;
//Q 3 Write a java application that read content of one file and store it to another file 

import java.io.*;

public class Question3 {

	public static void main(String[] args) {
		File f1 = new File("file1.txt");
		File f2 = new File("file2.txt");
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f2);
			int ch;
			
			while((ch=fr.read()) != -1) {
				fw.write(ch);
			}
			
			System.out.println("File Written.");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			fr.close();
			fw.close();
		}catch(Exception e) {}

	}

}
