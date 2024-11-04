public class Array{
    static int arr[];
    static int size;
    static int rear = -1;
    static int front = -1;

    Array(int n){
        arr = new int[n];
        this.size = n;
    }
    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    //full
    public static boolean isFull(){
        return (rear + 1) % size == front;
    }
    //add
    public static void add(int data){
        if(isFull()){
            System.out.println("Queue is full. Cannot add " + data);
            return;
        }
        rear++;
        arr[rear] = data;
    }
    //remove
    public static int remove(int data){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot remove " + data);
            return -1;
        }
        int temp = arr[0];
        for(int i = 0; i < rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        // System.out.println(temp + " removed from the queue");
        return temp;
    }
    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot peek");
            return -1;
        }
        return arr[0];
    }
    //main
    public static void main(String[] args){
        Array queue = new Array(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Peek: " + queue.peek());
        queue.remove(10);
        System.out.println("peek : " + queue.peek());
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove(queue.peek());
        }

    }
}