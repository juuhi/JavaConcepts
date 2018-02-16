package com.marlabs.collections.examples;

import java.util.*;

public class SecondSmallestElementExample
{
	public static int getSecondSmallestElement(int inputArray[])
	{
	//eliminate duplicate
	//sort
	//get second smallest element
	SortedSet<Integer> intElementSet = new TreeSet<Integer>();
	for (int i :inputArray) //For each loop JDK 1.5 version updation
	{
		intElementSet.add(i);
	}
	System.out.println(intElementSet);
	Object object[] = intElementSet.toArray();
	return (Integer)object[1];
	}
public static void main(String[] args)
{
	System.out.println("I am From Main Method");
	int inputArray[]= {10,23,10,45,56,67,76,56,34,10,107};
	int secondSmallest = getSecondSmallestElement(inputArray);
	System.out.println("Output:" +secondSmallest);
	System.out.println("End of Main Method");
}
}