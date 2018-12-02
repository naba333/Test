package com.absi.ex.gittest;

public class Citizen
{
	private String name = "XXX";
	private String job = "worker";
	private int age = 1;

	public Citizen(String n, String j, int a)
	{
		name = n;
		job = j;
		age = a;
	}

	public introduce()
	{
		System.out.println("Hi, i'm " + name + " " + age + " yers old and i'm " + job + ".");
	}
}