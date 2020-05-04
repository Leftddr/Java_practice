package study1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scan2 = new Scanner(input);
		scan2.useDelimiter("/");
		while(scan2.hasNext()) {
			System.out.println(scan2.next());
		}
		try {
			wr.write(input);
		}
		catch (IOException ex){
			System.out.println(ex.toString());
		}
		scan2.close();
	}
}
