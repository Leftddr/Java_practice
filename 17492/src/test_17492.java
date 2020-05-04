import java.util.Scanner;

public class test_17492 {
	static int[][] map;
	static int row;
	static int final_result = 0;
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		sc.nextLine();
		
		map = new int[row][row];
		
		for(int i = 0 ; i < row ; i++) {
			String[] input = sc.nextLine().split(" ");
			for(int j = 0 ; j < input.length; j++) {
				map[i][j] = Integer.parseInt(input[j]);
				if(map[i][j] == 2) {count++;}
			}
		}
		while(true) {
			int cri = 0;
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < row ; j++) {
				if(map[i][j] == 2) {
					for(int k = j + 1 ; k < row ; k++) {
						if(map[i][k] == 1) {break;}
						if(map[i][k] == 2) {
							if(k + 1 < row && map[i][k + 1] == 0) {map[i][k] = 0; map[i][k + 1] = 2; count--; cri = 1; break;}
						}
					}
					for(int k = i + 1 ; k < row ; k++) {
						if(map[k][j] == 1) {break;}
						if(map[k][j] == 2) {
							if(k + 1 < row && map[k + 1][j] == 0) {map[k][j] = 0; map[k + 1][j] = 2; count--; cri = 1; break;}
						}
					}
					for(int k = i + 1 ; k < row ; k++) {
						if(map[k][k] == 1) {break;}
						if(map[k][k] == 2) {
							if(k + 1 < row && map[k + 1][k + 1] == 0) {map[k][k] = 0; map[k + 1][k + 1] = 2; count--; cri = 1; break;}
						}
					}
				}
			}
		}
		if(cri == 0) {break;}
	}
		if(count == 1) {System.out.println("Possible");}
		else {System.out.println("ImPossible");}
	}
}
