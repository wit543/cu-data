package y2014;

/**
 * Created by WIT on 27-Feb-16.
 */
public class LinkedListItr{
     ListNode current; //currently interested position
     LinkedListItr( ListNode theNode )
     {
         current = theNode;
     }
    /**
    * See whether current pass the end of the list.
    * @return true if current is null.
    */
    public boolean isPastEnd(){return false;}
    /**
    * @return item in current, or -1 if current is not in
    * the list.
    */
    public int retrieve(){return 0;}
    /**
    * move current to its next position. Nothing is done
    * if current is null.
    */
    public void advance( {}
}
