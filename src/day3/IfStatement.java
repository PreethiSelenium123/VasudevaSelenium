package day3;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) 
	{
		/*if (condition)
		{
			Statements;//if block
		}else
		{
			Statements;//else block
		}*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n%2==0)
		{
			System.out.println("Even");
		}else
		{
			System.out.println("odd");
		}

	}

}
