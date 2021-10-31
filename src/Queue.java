public class Queue{
    private int[] elements;
    private int size;
    private int front;
    private int rear;

    Queue(int capacity){
        size = capacity;
        front = -1;
        rear = -1;
        elements = new int[size];
    }

    private boolean isFull(){
        return rear == size-1 && front == 0;
    }

    private boolean isEmpty(){
        return front == -1;
    }

    private void enQueue(int element){
        if(isFull()) System.out.println("Queue is already full");
        else{
            if(front == -1)
                front = 0;
            elements[++rear] = element;
        }

    }

    private int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is empty");
           return -1;
        }
        else{
            element = elements[front];
            if(front >= rear){
                rear = -1;
                front = -1;
            }
            else {
                front++;
            }
            System.out.println(element + " has been dequeued\n");
            return element;
        }
    }

    private void display(){
        if(isEmpty()){System.out.println("Queue is empty");}
        else{
            System.out.println("Front index is " + front + "\n");
            System.out.print("Queue is: \n\n");
            for(int i = front; i <= rear; i ++)
                System.out.println(elements[i] + " ");
            System.out.println("\nRear index is " + rear + "\n");
        }
    }


    public static void main(String[] args){
       Queue q = new Queue(5);
       q.enQueue(1);
       q.enQueue(2);
       q.enQueue(3);
       q.enQueue(4);
       q.enQueue(5);

       q.display();

       q.deQueue();

       q.display();



    }



}