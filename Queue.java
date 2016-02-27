package y2014;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by WIT on 27-Feb-16.
 */
public class Queue {

    public int size() {
        return 0;
    }
    public boolean isEmpty() {
        return false;
    }
    public void  enqueue(int x){}
    public int dequue(){return 0;}
    public int front(){return 0;}

    /**
     * Problem 1
     * @param x
     */
    public void moveToFront(int x){
        int count =size() ;
        Queue otherQueue = new Queue();
        while (!isEmpty()){
            if(this.front()==x){
                dequue();
            }
            otherQueue.enqueue(dequue());
        }
        enqueue(x);
        while (!otherQueue.isEmpty()){
            enqueue(otherQueue.dequue());
        }
    }

    /**
     * Problem 2
     */
    public void reverseQueue(){
        Stack stack = new Stack();
        while (!isEmpty()){
            stack.push(dequue());
        }
        while (!stack.isEmpty()){
            enqueue(stack.topAndPop());
        }
    }
}
