import java.util.Scanner;

public class test_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cri_num = sc.nextInt();
		int num = 1;
		while(true) {
			if(num >= cri_num) break;
			cri_num -= num;
			num++;
		}
		
		int num1 = 1, num2 = num;
		while(cri_num != 0) {
			cri_num--;
			num1++; num2--;
		}
		num1--; num2++;
		System.out.println(num1 + "/" + num2);
	}

}
