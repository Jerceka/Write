package jerceka.workhard.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
	public void here() throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your file name :");
		String fileName = input.nextLine();
		System.out.println("enter what u want to text");
		String text = input.nextLine();
		System.out.println("enter which postion u will put it");
		long place = input.nextLong();
		write(fileName,text);
//		writeToPosition(fileName, text, place);
	}
	public static void make(String fileName,String text) 
	  throws IOException {
	    FileWriter fileWriter = new FileWriter(fileName);
	    PrintWriter printWriter = new PrintWriter(fileWriter);
	    printWriter.print(text);
	    printWriter.close();
	
	}
	public void write(String fileName,String text) 
	  throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
	    writer.append("\n");
	    writer.append(text);
	     
	    writer.close();
	}
	private void writeToPosition(String filename,String data, long position) 
			  throws IOException {
	    RandomAccessFile writer = new RandomAccessFile(filename, "rw");
	    writer.seek(position);
	    writer.writeUTF(data);
	    writer.close();
	}
}
