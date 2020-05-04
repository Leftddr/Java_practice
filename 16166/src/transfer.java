import java.util.Scanner;

public class transfer {

	static int min_distance=99999;
	static int target;
	static int [][]cri;
	static int [][]arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int [][]map=new int[num][10];
		
		int max=-99;
		
		init(map,num);
		sc.nextLine();
		for(int i=0;i<num;i++) {
			String str=sc.nextLine();
			for(int j=0;j<10;j++) {
				if(j<str.length() && str.charAt(j)==' ') {continue;}
				else if(j<str.length() && str.charAt(j)!=' '){
					map[i][j]=str.charAt(j)-'0';
					if(max<str.charAt(j)-'0') {max=str.charAt(j)-'0';}
					continue;
				}
			}
		}
		arr=new int[max+1][max+1];

		for(int i=0;i<max+1;i++) {
			for(int j=0;j<max+1;j++) {
				arr[i][j]=0;
			}
		}
		
		for(int i=0;i<num;i++) {
			for(int j=1;j<10;j++) {
				if(map[i][j]==-1) {continue;}
				arr[map[i][0]][map[i][j]]=1;
			}
		}
		target=sc.nextInt();
		
		
	}
	
	public static void init(int[][]map,int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<10;j++) {
				map[i][j]=-1;
			}
		}
	}
	
}
