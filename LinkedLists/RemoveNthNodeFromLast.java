/*-- Removing the Node number B from the end of the List!! --*/
 
public class Test {
    Node removeNthFromLast(Node A, int B) {
        
        if(A.next==null)
            return null;
        
        int count = 0;
        Node n = A;
        Node AA = A;
        
        //We are just traversing here, not changing anything!
        while(n!=null){
            n = n.next;
            count++; 
        }
        
        int x = count-B;
        
        if(x==0)
            return AA.next; 
        
        for(int i=1; i<x; i++){
            AA = AA.next; 
        }
        
        
        if(AA.next.next!=null)
            AA.next = AA.next.next;
        
        else
            AA.next = null; 
        
        
        return A; 
        
    }
}
