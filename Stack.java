package y2014;

/**
 * Created by WIT on 27-Feb-16.
 */
public class Stack {
    public Stack(){}
    public boolean isEmpty(){}
    public void push(int x){}
    public void pop(){}
    public int topAndPop(){return 0;}
    public int top(){return 0;}
    /**
     * Problem 3
     * O(n^2)
     */
    public void addNoDuplicate(Stack s2){
        Stack s3 = new Stack();
        Stack s4 = new Stack();
        Stack s5 = new Stack();
        while (!s2.isEmpty()){
            boolean isAdded = false;
            while (!s3.isEmpty()){
                if(s2.top()==s3.top()){
                    isAdded=true;
                    break;;
                }
                s4.push(s3.topAndPop());
            }
            while (!s4.isEmpty()){
                s3.push(s4.topAndPop());
            }
            if(!isAdded){
                push(s2.topAndPop());
            }
            else{
                s5.push(s2.topAndPop());
            }
        }
        while (!s5.isEmpty()){
            s4.push(s5.topAndPop());
        }
        while (!s4.isEmpty()){
            s2.push(s4.topAndPop());
        }
    }
}
