package y2014;

/**
 * Created by WIT on 27-Feb-16.
 */
public class LinkedList {
    ListNode header;

    public LinkedList() {
        this.header = new ListNode(-1,null);
    }
    public boolean isEmpty(){return header.next==null;}
    public  void makeEmpty(){header.next=null}
    public LinkedListItr zeroth(){return null;}
    public LinkedListItr first(){return null;}
    public void insert(int x, LinkedListItr p){}
    public LinkedListItr find(int x){return null;}
    public void remove(int x){}
    public int removeFirst(){return 0;}

    /**
     * Problem 4 a
     * @param itr
     * @return
     */
    public LinkedListItr remove(LinkedListItr itr){
        LinkedListItr self = first();
        while (self.isPastEnd()){
            if(itr.current.next.element==self.retrieve()){
                self.current.element=-1;
                return self;
            }
            self.advance();
        }
        return new LinkedListItr(header);
    }

    /**
     * Problem 4 b
     */
    public void reverse(){
        LinkedListItr self = first();
        zeroth().current.next=null;
        while(!self.isPastEnd()){
            ListNode temp = self.current;
            self.advance();
            temp.next=first().current;
            zeroth().current.next=temp;

        }
    }
}
