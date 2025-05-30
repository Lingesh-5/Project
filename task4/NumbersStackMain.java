import java.util.Stack;
public class NumbersStackMain {
    public static void main(String[] args) {
        
        Stack<Integer> numbers = new Stack<>();
        
        //Method call
        pushElement(5,numbers);
        pushElement(6,numbers);
        popElement(numbers);
        isStackEmpty(numbers);
        
    }
    //Method to push element onto th stack
    public static void pushElement(int num, Stack<Integer> numbers) {
        numbers.add(num);
        System.out.println(numbers);
    }
    //Method to pop element from the stack
    public static void popElement(Stack<Integer> numbers) {
        numbers.pop();
        System.out.println(numbers);
    }
    //Method to check whether the stack is empty
    public static void isStackEmpty(Stack<Integer> numbers) {
        if(numbers.isEmpty()){
            System.out.println("Stack is empty");
        }else {
            System.out.println("Stack is not empty");
        }
        
    }
}