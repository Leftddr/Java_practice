import java.util.Scanner;

public class test_16173 {
	static int [][]arr;
	static int num;
	static int target=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.nextLine();
		
		arr=new int[num][num];
		
		String input;
		for(int i=0;i<num;i++) {
			input=sc.nextLine();
			for(int j=0;j<num;j++) {
				arr[i][j]=Integer.parseInt(input.split(" ")[j]);
			}
		}
		
		dfs(0,0);
		if(target==1) {System.out.println("HaruHaru");}
		else {System.out.println("Heim");}
		
	}
	public static void dfs(int x,int y) {
		if(x>=num || y>=num) {return;}
		System.out.println(x+" "+y+ " "+num);
		if(x==num-1 && y==num-1) {target=1;return;}
		int jump=arr[x][y];
		dfs(x+jump,y);
		dfs(x,y+jump);
	}

}
