package parameter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//import example2.Batter

public class example1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		example2 ex2 = new example2(1,2);
		example3 ex3 = new example3(ex2);
		
		File exFolder = new File("C:\\Users\\lg\\Desktop");
		File file1 = new File("C:\\Users\\lg\\Desktop\\test.txt");
		try {
			file1.createNewFile();
			System.out.println("test.txt created");
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			FileWriter fw = new FileWriter("C:\\Users\\lg\\Desktop\\test.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("File input / output is so easy");
			bw.close();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(exFolder.isDirectory());
		System.out.println(exFolder.isFile());
		File[] fileList = exFolder.listFiles();
		
		for(int i=0;i < fileList.length;i++) {
			System.out.println(fileList[i].getName() + " " + fileList[i].length() + "bytes");
		}
		
		ArrayList<String []> examResult = new ArrayList<String []>();
		String[] header = {"name", "85", "90", "100"};
		String[] p1 = {"bongwon", "85", "60", "85"};
		examResult.add(header);
		examResult.add(p1);
		
		for(int i=0;i<examResult.size();i++) {
			System.out.println(examResult.get(i)[0]);
		}
		examResult.clear();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		int value = 0;
		for(int i=0; i < 1000;i++) {
			value = (int)(5000*Math.random());
			a.add(value);
		}
		Integer[] arr = a.toArray(new Integer[1000]);
		for(int k : arr) {System.out.print(k + " ");}
		System.out.println();
		Arrays.sort(arr);
		System.out.println(arr.length);
		for(int i = 0 ; i<arr.length;i++) {
			System.out.print(125);
		}

	}

}
