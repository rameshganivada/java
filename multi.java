
import java.util.Scanner;

public class multi {
	static int multiple(int x,int y)
	{
		int res = x * y;
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter num1:");
		int num1;
		num1 = sc.nextInt();
		
		System.out.println("enter num2:");
		int num2;
		num2 = sc.nextInt();
		int result;
		result = multiple(num1,num2);
		System.out.println("multiple of two num is :"+ result);
		

	}

}
