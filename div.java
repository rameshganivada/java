import java.util.Scanner;

public class div {
	static int division(int x,int y)
	{
		int res= x / y;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1;
		num1 = sc.nextInt();
		
		System.out.println("enter num2:");
		int num2;
		num2 = sc.nextInt();
		
		int result = division(num1,num2);
		System.out.println("division of two num's : "+result);

	}

}
