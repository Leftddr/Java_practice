import java.util.Scanner;

public class test_1073 {
	static String[] input1;
	static String[] input2;
	static StringBuilder sb = new StringBuilder("");
	static int[] cri;
	static int result = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		input1 = new String[num];
		input2 = new String[num];
		cri = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			input1[i] = sc.nextLine();
			sb.append(input1[i]);
			sb.reverse();
			input2[i] = sb.toString();
			sb.delete(0, sb.length());
			sb.setLength(0);
		}
		
			for(int j = 0 ; j < num ; j++) {
				if(cri[j] == 1) continue;
				
				if(sb.length() > 0 && sb.charAt(sb.length() - 1) == input1[j].charAt(0)){
					cri[j] = 1;
					sb.append(input1[j]);
					dfs(num);
					sb.delete(sb.length() - 2, sb.length());
					cri[j] = 0;
				}
				else if(sb.length() <= 0) {
					cri[j] = 1;
					sb.append(input1[j]);
					dfs(num);
					sb.delete(sb.length() - 2, sb.length());
					cri[j] = 0;
				}
				if(sb.length() > 0 && sb.charAt(sb.length() - 1) == input2[j].charAt(0)){
					cri[j] = 1;
					sb.append(input2[j]);
					dfs(num);
					sb.delete(sb.length() - 2, sb.length());
					cri[j] = 0;
				}
				else if(sb.length() <= 0) {
					cri[j] = 1;
					sb.append(input2[j]);
					dfs(num);
					sb.delete(sb.length() - 2, sb.length());
					cri[j] = 0;
				}
			}
		System.out.println(result);
	}
	
	public static void dfs(int num) {
		if(sb.length() >= 4) {
			if(sb.charAt(0) == sb.charAt(sb.length() - 1)) {
				result++;
				System.out.println(sb.toString());
			}
		}
		for(int j = 0 ; j < num ; j++) {
			if(cri[j] == 1) continue;
			if(sb.length() > 0 && sb.charAt(sb.length() - 1) == input1[j].charAt(0)) {
				cri[j] = 1;
				sb.append(input1[j]);
				dfs(num);
				sb.delete(sb.length() - 2, sb.length());
				cri[j] = 0;
			}
			if(sb.length() > 0 && sb.charAt(sb.length() - 1) == input2[j].charAt(0)) {
				cri[j] = 1;
				sb.append(input2[j]);
				dfs(num);
				sb.delete(sb.length() - 2, sb.length());
				cri[j] = 0;
			}
		}
	}

}
