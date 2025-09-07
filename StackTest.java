
import java.util.Scanner;

interface Stackinterface {
    void push(int item);
    void pop();
    void peek();
    void displayStack();
}
class Stack implements Stackinterface{
    private int[] stack;
    private int top;
    private int size;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // ---- Stack Methods ----
    public void push(int item) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = item;
            System.out.println(item + " Element pushed");
        }
    }

    public void pop() {
    	if(top==-1)
    	{
    		System.out.println("Empty stack");
    	}
    	else
    	{
    		int item;
    		item=stack[top];
    		top--;
    		System.out.println("Popped element is:"+item);
    	}
    }   
    public void peek() {
    	if(top==-1)
    	{
    		System.out.println("Empty stack");
    	}
    	else
    	{
    		System.out.println("Peeked element is: "+stack[top]);
    	}
    } 

    public void displayStack() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackTest {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int size,i;
    	System.out.print("Enter size of stack: ");
        size = sc.nextInt();

    	Stack sq=new Stack(size);
        System.out.print("Enter "+size+" elemnts");
        for(i=0;i<size;i++)
        {
        int n = sc.nextInt();
        sq.push(n);
        }
        sq.pop();
        sq.peek();
        sq.displayStack();

    }
}
