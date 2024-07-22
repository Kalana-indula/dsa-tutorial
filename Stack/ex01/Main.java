package Stack.ex01;

import java.util.Stack;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        //Creating a stack of type string
        Stack<String> stackOfBooks=new Stack<>();

        //checking if the stack is empty
        System.out.println(stackOfBooks.empty());

        //Adding data into stack (pushing)
        stackOfBooks.push("The book thief");
        stackOfBooks.push("Hidden Oasis");
        stackOfBooks.push("Maze runner");

        //printing the stack
        System.out.println(stackOfBooks);
        
        //Checking the data availability of stack
        System.out.println(stackOfBooks.empty());

        //Add some other data into stack
        stackOfBooks.push("book 1");
        stackOfBooks.push("new book2");

        //printing stack
        System.out.println(stackOfBooks);

        //popping out 
        stackOfBooks.pop();

        //stack after a pop
        System.out.println(stackOfBooks);

        //popping out
        stackOfBooks.pop();
        System.out.println(stackOfBooks);

        //getting the topmost element
        String bookAtTheTop=stackOfBooks.peek();

        System.out.println(bookAtTheTop);
    }
}