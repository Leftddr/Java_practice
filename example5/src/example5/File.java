package example5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class File {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fw;
		BufferedReader bw;

		fw=new FileReader("C:\\Users\\lg\\Desktop\\example.txt");
		bw=new BufferedReader(fw);
		
		ArrayList<String> info=new ArrayList<String>();
		String temp;
		while((temp=bw.readLine())!=null) {
			 info.add(temp);
			 System.out.println(temp.charAt(0));
			 
		}
		int length=0;
		for(String k:info) {
			length+=k.length();
		}
		System.out.println("length=" +length+"\n");
		fw.close();
		bw.close();
	}

}
