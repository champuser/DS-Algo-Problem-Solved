package com.company;

public class StackArray {
    int top=-1;
    int max =1000;
    int stack[] = new int[max]; // creating stack arraay with size max

    boolean isFull(){
        if(top== (max-1)){
            return true;
        }
        return false;
    }
    boolean push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        stack[++top] = data;
        return true;
    }


    boolean isEmpty(){
       return (top<0);
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;

        }
        int data = stack[top];
        top --;
        return data;
    }
}
