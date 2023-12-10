import java.util.Stack;
// import java.util.*;
public class Stack{
    public static void main(String args[]){
   
    Stack<String> animal= new Stack<>();


        animal.push("Lion");
        animal.push("Tiger");
        animal.push("Dog");
        animal.push("Horse");

        System.out.println(animal);

        // animal.pop(2);
       

        animal.pop();
        System.out.println(animal.peek());
    }
}