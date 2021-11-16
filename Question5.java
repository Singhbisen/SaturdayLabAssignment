package SaturdayLabAssignment;
//Q 5 Write a java application that keep read and printing  character  from console till user presses 'q'.
import java.io.*;

public class Question5 {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
       char ch;
       
       System.out.println("Enter a character (press 'q' to exit): ");
		
		do {
			ch = (char) b.read();
			System.out.println(ch);
			
		}while(ch != 'q');

	}

}