package com.java.tutorials;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListAsCollection {
	public static void main(String[] args) {
		//List is an interface and List is an extension of the Collection interface
		//ArrayList is a Class which extends AbstractList and implements List Interface
		List<Integer> list= new ArrayList();
		
		//Stack class extends Vector class
		List<Integer> stackList = new Stack();
		
		//Vector class implements a growable array of objects and implements List , cloneable and Serializable interfaces, Vector is synchronized.
		List<Integer> vectorList = new Vector();
		
		//public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
		List<Integer> linkedList = new LinkedList();
		list.add(1);
		stackList.add(2);
		vectorList.add(3);
		linkedList.add(4);
		System.out.println("ArrayList :" + list);
		System.out.println("Stack :"+stackList);
		System.out.println("VectorList :"+vectorList);
		System.out.println("LinkedList :"+linkedList);
	}
}
