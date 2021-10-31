public class Stack{
    private int top;
    private int arr[];
    private int capacity;

    Stack(int size){
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int element){
        if (isFull()){
            System.out.println("Stackoverflow error \n");
            System.exit(1);
        }
        arr[++top] = element;
        System.out.println(element+ " pushed to stack \n");
    }

    public int pop(){
      if(isEmpty()){
          System.out.println("Stack is already empty \n");
          System.exit(1);
      }
      return arr[top--];
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public boolean isEmpty()  {
        return top == -1;
    }

    public int size(){
        return top + 1;
        }

    public void printStack(){
        for(int i  = 0; i <= top; i++){
            if(i == 0)
                System.out.println("Top is " + top + "\n");
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        Stack stack  = new Stack(10);
        stack.push(100);
        stack.push(1);
        stack.push(43);
        stack.push(9);
        stack.push(11);

        stack.printStack();
        System.out.println("\n");

        System.out.println(stack.pop() + "\n");

        stack.printStack();
    }
}