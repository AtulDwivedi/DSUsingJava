package com.atuldwivedi.dsusingjava.stack;

import java.util.Stack;

public class StackInJava {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		//true
		System.out.println(stack.empty());
		
		stack.push("Dwivedi");
		stack.push("Atul");
		stack.push("Anuj");
		stack.push("Amar");
		
		//false
		System.out.println(stack.empty());
		
		//1
		System.out.println(stack.search("Amar"));
		//4
		System.out.println(stack.search("Dwivedi"));
		
		//Amar
		System.out.println(stack.peek());
		
		//Amar
		System.out.println(stack.pop());
		
		//3
		System.out.println(stack.search("Dwivedi"));
		
	}

}
