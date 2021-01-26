package com.company;

public class StackMain {

    public static void main(String[] args) {
	// write your code here
        StackArray stackArray = new StackArray();
        stackArray.push(1);
       stackArray.push(2);

        stackArray.push(3);
        int data = stackArray.pop();
        System.out.println("Element popped!" + " " + data);
        data = stackArray.pop();
        System.out.println("Element popped!" + " " + data);
        data = stackArray.pop();
        System.out.println("Element popped!" + " " + data);
        data = stackArray.pop();
        System.out.println("Element popped!" + " " + data);
        data = stackArray.pop();
        System.out.println("Element popped!" + " " + data);

    }

}
