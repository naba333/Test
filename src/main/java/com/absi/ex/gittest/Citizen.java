package com.absi.ex.gittest;

public class Citizen
{
	private String name = "XXX";
	private int age = 1;

	public Citizen(String n, int a)
	{
		name = n;
		age = a;
	}

	public introduce()
	{
		System.out.println("Hi, i'm " + name + " " + age + " yers old.");
	}
}