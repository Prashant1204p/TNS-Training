package com.daythreelooping;

public class Looping {
	public static void main(String[] args)
	{
		int beg =31;
		int end =49;
		for(int i=beg;i<=end;i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("-----------------");
		}
	}

}
