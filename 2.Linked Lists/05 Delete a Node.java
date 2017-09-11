/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  if(head == null){
      return head;
  }else if(position == 0){
      return head.next;
  }else{
      int count = 1;
      Node n = head;
      while(count <= position - 1){
          n = n.next;
          count++;
      }
      if(n.next != null){
        n.next = n.next.next;    
      }else{
          n.next = null;
      }
      
      return head;
  }

}

