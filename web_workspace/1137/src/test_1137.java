import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test_1137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char[][] map = {
			{'#', '#', '#', '#', '#', '#', '#', '#'},
			{'#', '.', '.', '.', '.', '.', '.', '#'},
			{'#', '.', 'Y', '.', '.', '.', '.', '#'},
			{'#', '.', 'F', '.', '#', '.', '.', '#'},
			{'#', '.', '.', '.', 'X', '.', '.', '#'},
			{'#', '.', '.', '.', '#', '.', '.', '#'},
			{'#', '.', '.', '.', '.', '.', '.', '#'},
			{'#', '#', '#', '#', '#', '#', '#', '#'}
		};
		
		int[][] min_pos = new int[2][2];
		int[][] target_pos = new int[1][2];
		
		for(int i = 0 ; i < map.length; i++) {
			for(int j = 0 ; j < map[i].length ; j++) {
				if(map[i][j] == 'Y') {
					min_pos[0][0] = i;
					min_pos[0][1] = j;
				}
				else if(map[i][j] == 'F') {
					min_pos[1][0] = i;
					min_pos[1][1] = j;
				}
				else if(map[i][j] == 'X') {
					target_pos[0][0] = i;
					target_pos[0][1] = j;
				}
			}
		}
		
		Queue<int[][]> q = new LinkedList<int[][]>();
		Queue<Integer> pos = new LinkedList<Integer>();
		
		q.offer(min_pos);
		pos.offer(0);
		
		int final_cost = 0;
		
		while(!q.isEmpty()) {
			int[][] temp = q.poll();
			int temp_pos = pos.poll();
			
			if(temp[0][0] == target_pos[0][0] && temp[0][1] == target_pos[0][1]) {final_cost = temp_pos; break;}
			
			if(temp_pos < input.length() && input.charAt(temp_pos) == 'S') {
				if(temp[1][0] + 1 < map.length && temp[0][0] + 1 < map.length && map[temp[1][0] + 1][temp[1][1]] != 'X') {
					if(map[temp[1][0] + 1][temp[1][1]] == '.') 
						temp[1][0] += 1;
					if(map[temp[0][0] + 1][temp[0][1]] == '.') 
						temp[0][0] += 1;
					q.offer(temp);
					pos.offer(temp_pos + 1);
					if(map[temp[1][0]][temp[1][1]] == '.')
						temp[1][0] -= 1;
					if(map[temp[0][0]][temp[0][1]] == '.')
						temp[0][0] -= 1;
				}
			}
			else if(temp_pos < input.length() && input.charAt(temp_pos) == 'N') {
				if(temp[1][0] - 1 >= 0 && temp[0][0] - 1 >= 0 && map[temp[1][0] - 1][temp[1][1]] != 'X') {
					if(map[temp[1][0] - 1][temp[1][1]] == '.') 
						temp[1][0] -= 1;
					if(map[temp[0][0] - 1][temp[0][1]] == '.') 
						temp[0][0] -= 1;
					q.offer(temp);
					pos.offer(temp_pos + 1);
					if(map[temp[1][0]][temp[1][1]] == '.')
						temp[1][0] += 1;
					if(map[temp[0][0]][temp[0][1]] == '.')
						temp[0][0] += 1;
				}
			}
			else if(temp_pos < input.length() && input.charAt(temp_pos) == 'E') {
				if(temp[1][1] + 1 < map.length && temp[0][1] + 1 < map.length && map[temp[1][0]][temp[1][1] + 1] != 'X') {
					if(map[temp[1][0]][temp[1][1] + 1] == '.') 
						temp[1][1] += 1;
					if(map[temp[0][0]][temp[0][1] + 1] == '.') 
						temp[0][1] += 1;
					q.offer(temp);
					pos.offer(temp_pos + 1);
					if(map[temp[1][0]][temp[1][1]] == '.')
						temp[1][1] -= 1;
					if(map[temp[0][0]][temp[0][1]] == '.')
						temp[0][1] -= 1;
				}
			}
			else if(temp_pos < input.length() && input.charAt(temp_pos) == 'W') {
				if(temp[1][1] - 1 >= 0 && temp[0][1] - 1 >= 0 && map[temp[1][0]][temp[1][1] - 1] != 'X') {
					if(map[temp[1][0]][temp[1][1] - 1] == '.') 
						temp[1][1] -= 1;
					if(map[temp[0][0] + 1][temp[0][1]] == '.') 
						temp[0][1] -= 1;
					q.offer(temp);
					pos.offer(temp_pos + 1);
					if(map[temp[1][0]][temp[1][1]] == '.')
						temp[1][1] += 1;
					if(map[temp[0][0]][temp[0][1]] == '.')
						temp[0][1] += 1;
				}
			}
			
			q.offer(temp);
			pos.offer(temp_pos + 1);
		}
		
		System.out.println(final_cost);
	}

}
