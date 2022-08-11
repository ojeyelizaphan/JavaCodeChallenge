import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryTwo {
    public static void printStack(Stack<Integer> stack){
        // If stack is empty
        if (stack.empty())
            return;

        // Extract top of the stack
        int x = stack.peek();

        // Pop the top element
        stack.pop();

        // Print the current top
        // of the stack i.e., x
        System.out.print(x);

        // Proceed to print
        // remaining stack
        printStack(stack);

        // Push the element back
        stack.push(x);
    }

    public static void convertToBinary(int N){
        Stack<Integer> binaryStack = new Stack<Integer>();

        while(N>0){
            binaryStack.push(N%2);
            N = N/2;
        }

        printStack(binaryStack);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int N = scanner.nextInt();
        // Function call
        convertToBinary(N);

    }
}
