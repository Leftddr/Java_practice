import java.util.Scanner;

public class test_16169 {
	
	static int[][] arr;
	static int row;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		arr=new int[row][2];
		sc.nextLine();
		String input;
		int max=-99999;
		for(int i=0;i<row;i++) {
			input=sc.nextLine();
			arr[i][0]=Integer.parseInt(input.split(" ")[0]);
			arr[i][1]=Integer.parseInt(input.split(" ")[1]);
			if(arr[i][0]>max){max=arr[i][0];}
		}
		int sum=0;
		for(int i=1;i<=max;i++) {
			for(int j=0;j<row;j++) {
				if(arr[j][0]==i) {
					sum+=arr[j][1];
					//System.out.println(arr[j][1]);
					for(int k=0;k<row;k++) {
						if(arr[k][0]==i+1) {
							sum+=Math.pow(k-j,2);
							System.out.println(Math.pow(k-j, 2));
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

}
