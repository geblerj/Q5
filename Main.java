//Write a Java program to enqueue 10 items into a Queue data structure and swap the Queue's first half with the second half.


import java.util.Queue;
import java.util.LinkedList;

class Main {
	
  public static void enqueue(Queue<Integer> queue){
  	for(int i=0;i<10;i++){
  		queue.add(i);
  	}
  }
  
  public static Queue<Integer> swapHalves(Queue<Integer> queue){
  	Queue<Integer> firstHalf = new LinkedList<Integer>();
  	for(int i=0;i<5;i++){
  		firstHalf.add(queue.poll());
  	}
  	for(int i=0;i<5;i++){
  		queue.add(firstHalf.poll());
  	}
  	return queue;
  }
  
  public static void main(String[] args) {
    Queue<Integer> myQueue = new LinkedList<Integer>();
    enqueue(myQueue);
    System.out.println(myQueue);
    myQueue = swapHalves(myQueue);
    System.out.println(myQueue);
  }
  
}
