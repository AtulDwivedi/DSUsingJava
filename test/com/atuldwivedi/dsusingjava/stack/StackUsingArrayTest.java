package com.atuldwivedi.dsusingjava.stack;

import com.atuldwivedi.dsandalgo.stack.StackUsingArray;

public class StackUsingArrayTest {
	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		
		//true
		System.out.println(stack.empty());
		
		System.out.println("Added: "+stack.push("Dwivedi"));
		System.out.println("Added: "+stack.push("Atul"));
		System.out.println("Added: "+stack.push("Anuj"));
		
		System.out.println("Removed: "+stack.pop());
		
		System.out.println("Added: "+stack.push("Amar"));
		
		System.out.println(stack.peek());
		
		//false
		System.out.println(stack.empty());
		
		System.out.println(stack.search("Dwivedi"));
	}
}
