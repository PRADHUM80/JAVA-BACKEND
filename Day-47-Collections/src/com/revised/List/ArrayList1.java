package com.revised.List;

import java.util.ArrayList;

public class ArrayList1 {
/**
 * 1. ArrayList--
 * 
 * Order
 * Multiple Null 
 * Duplicate Value 
 * Allowed All
 * 
 */
	public static void main(String[] args)
	{
//		Create a Container Which Will Hold SomeThing(Objects)...
		ArrayList<String> learners = new ArrayList<String>();
//		<E> --> Which Types of DataTypes
		
//		Storing the Data.. Using add--> Methods..
		learners.add(null);
		learners.add("Pradhum");
		learners.add("Ankit");
		learners.add("Sahwaj");
		learners.add("Pradhum");
		learners.add(null);
		learners.add("Sahwaj");
		
//		read The Data From Container/ArrayList.
		System.out.println(learners);
//		OutPut --> [null, Pradhum, Ankit, Sahwaj, Pradhum, null, Sahwaj]
	}

}
