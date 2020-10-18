import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test_6236 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1;
		int n, m;
		try {
			input1 =  br.readLine().split(" ");
			n = Integer.parseInt(input1[0]);
			m = Integer.parseInt(input1[1]);
			for(int i = 0 ; i < n ; i++) {
				String tmp = br.readLine();
				arr.add(Integer.parseInt(tmp));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
