package com.absi.ex.gittest;
import com.absi.ex.gittest.Citizen;

public class GitTest
{
	public static void main(String args[])
	{
		System.out.println("Hello!");
		Citizen c1 = new Citizen("Bob", "driver", 23);
		c1.introduce();
		System.out.println("I can't say what is my job now.");
	}
}