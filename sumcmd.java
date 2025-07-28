//  Write a program to add two numbers passed via command-line
public class sumcmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,res;
		n1 = Integer.parseInt(args[0]);
		// Integer.parseInt - a method that convert the string into int
		n2 = Integer.parseInt(args[1]);
		
		res = n1 + n2;
		System.out.println("sum of two num is:"+res);
	}

}
