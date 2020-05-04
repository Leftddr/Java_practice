import java.util.ArrayList;

public class test_14927 {
	static int[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 1}};
	static ArrayList<int[][]> list =  new ArrayList<int[][]>();
	static int row = 3;
	static int col = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list.add(arr);
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				if(arr[i][j] == 1) {
					if(check(i, j)) return;
				}
			}
		}
		System.out.println(complete());
	}
	
	public static boolean check(int x, int y) {
		int temp1 = -1;
		if(x - 1 >= 0) temp1 = arr[x - 1][y];
		
		if(temp1 == -1 && x + 1 < row) temp1 = arr[x + 1][y];
		else if(x + 1 < row) {
			if(temp1 != arr[x + 1][y]) {return true;}
		}
		
		if(temp1 == -1 && y - 1 >= 0) temp1 = arr[x][y - 1];
		else if(y - 1 >= 0) {
			if(temp1 != arr[x][y - 1]) {return true;}
		}
		
		if(temp1 == -1 && y + 1 < col) temp1 = arr[x][y + 1];
		else if(y + 1 < col) {
			if(temp1 != arr[x][y + 1]) {return true;}
		}
		
		return false;
	}
	
	public static int complete() {
		int cnt = 1;
		while(true) {
			int cri = 0;
			int [][]temp = list.get(0);
			for(int i = 0 ; i < row ; i++) {
				for(int j = 0 ; j < col ; j++) {
					if(temp[i][j] == 1) {
						int[][] temp2 = temp;
						if(i - 1 >= 0) {
							if(temp[i - 1][j] == 0) {temp[i - 1][j] = 1;}
							else {temp[i - 1][j] = 0;}
						}if(i + 1 < row) {
							if(temp[i + 1][j] == 0) {temp[i + 1][j] = 1;}
							else {temp[i + 1][j] = 0;}
						}if(j - 1 >= 0) {
							if(temp[i][j - 1] == 0) {temp[i][j - 1] = 1;}
							else {temp[i][j - 1] = 0;}
						}if(j + 1 < col) {
							if(temp[i][j + 1] == 0) {temp[i][j + 1] = 1;}
							else {temp[i][j + 1] = 0;}
						}
						temp[i][j] = 0;
						cri = check2(temp);
						if(cri == 1) {return cnt;}
						list.add(temp);
						temp = temp2;
					}
				}
			}
			list.remove(0);
			cnt++;
		}
	}
	
	public static int check2(int[][] map) {
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				if(map[i][j] == 1) {return 0;}
			}
		}
		return 1;
	}

}

