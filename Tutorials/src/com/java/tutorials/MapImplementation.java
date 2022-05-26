package com.java.tutorials;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Program to implement Map Interface.
public class MapImplementation {

	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<>();
		Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
		Map<String,Integer> treeMap = new TreeMap<>();
		hashMap.put("Suvrat", 1);
		hashMap.put("Aman", 2);
		hashMap.put("Abid", 3);
		hashMap.put("Siddhant", 4);
		hashMap.put("Harshit", 5);
		hashMap.put("Gaurav", 6);
		hashMap.put("Pankaj", 7);
		hashMap.put("Rajesh", 8);
		hashMap.put("Yusuf", 9);
		hashMap.put("Vikrant", 10);
		hashMap.put("Mohit", 11);
		hashMap.put("Raghu", 12);
		linkedHashMap.put("Suvrat", 1);
		linkedHashMap.put("Aman", 2);
		linkedHashMap.put("Abid", 3);
		linkedHashMap.put("Siddhant", 4);
		linkedHashMap.put("Harshit", 5);
		linkedHashMap.put("Gaurav", 6);
		linkedHashMap.put("Pankaj", 7);
		linkedHashMap.put("Rajesh", 8);
		linkedHashMap.put("Yusuf", 9);
		linkedHashMap.put("Vikrant", 10);
		linkedHashMap.put("Mohit", 11);
		linkedHashMap.put("Raghu", 12);
		treeMap.put("Suvrat", 1);
		treeMap.put("Aman", 2);
		treeMap.put("Abid", 3);
		treeMap.put("Siddhant", 4);
		treeMap.put("Harshit", 5);
		treeMap.put("Gaurav", 6);
		treeMap.put("Pankaj", 7);
		treeMap.put("Rajesh", 8);
		treeMap.put("Yusuf", 9);
		treeMap.put("Vikrant", 10);
		treeMap.put("Mohit", 11);
		treeMap.put("Raghu", 12);
		
		//Iteration using forEach loop
		System.out.println("Iteration using forEach loop");
		System.out.println("Iterating HashMap using forEach loop");
		hashMap.forEach((k,v) -> System.out.println("Key "+k +" Value "+ v));
		System.out.println("Iterating LinkedHashMap using forEach loop");
		linkedHashMap.forEach((k,v) -> System.out.println("Key "+k +" Value "+ v));
		System.out.println("Iterating TreeMap using forEach loop");
		treeMap.forEach((k,v) -> System.out.println("Key "+k +" Value "+ v));
		
		//Iteration using Iterator 
		System.out.println("Iteration using Iterator interface");
		
		Iterator<Map.Entry<String, Integer>> itr = hashMap.entrySet().iterator();
		Iterator<Map.Entry<String, Integer>> itr1 = linkedHashMap.entrySet().iterator();
		Iterator<Map.Entry<String, Integer>> itr2 = linkedHashMap.entrySet().iterator();
		System.out.println("Iterating HashMap using Iterator Interface");
        while(itr.hasNext())
        {
             Map.Entry<String, Integer> entry = itr.next();
             System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("Iterating LinkedHashMap using Iterator Interface");
        while(itr1.hasNext())
        {
             Map.Entry<String, Integer> entry = itr1.next();
             System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("Iterating TreeMap using Iterator Interface");
        while(itr2.hasNext())
        {
             Map.Entry<String, Integer> entry = itr2.next();
             System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        
        //Iterating using Map.entrySet()
        System.out.println("Iterating using Map.entrySet()");
        System.out.println("Iterating HashMap Using Map.entrySet()");
        for (Map.Entry<String,Integer> entry : hashMap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
        
        System.out.println("Iterating LinkedHashMap Using Map.entrySet()");
        for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
        
        System.out.println("Iterating TreeMap Using Map.entrySet()");
        for (Map.Entry<String,Integer> entry : treeMap.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        
        //Using compute() function to change the value of specific key
        hashMap.compute("Suvrat", (k, v) -> ++v);
        System.out.println( hashMap.get("Suvrat"));	
        
        //Using keySet() function to print all the keys of the given HashMap.
        System.out.println(hashMap.keySet());
	}

}
