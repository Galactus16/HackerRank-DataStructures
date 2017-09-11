/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Stack s = new Stack();
    
    if(head != null){
        Node n = head;
        while(n.next != null){
            s.push(n.data);
            n = n.next;
        }
        s.push(n.data);
        
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
