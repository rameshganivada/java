import java.util.Scanner;

public class sub {
	
	static int substract(int x,int y)
	{
		int res;
		res = x - y;
		return res;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1:");
        int num1;
        num1 = sc.nextInt();
        
        System.out.println("enter the num2:");
        int num2;
        num2 = sc.nextInt();
        
        int result = substract(num1,num2);
        System.out.println("substraction of two num is "+result);
	}

}
