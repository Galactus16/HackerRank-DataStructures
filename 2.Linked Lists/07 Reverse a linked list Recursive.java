/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    //if null list or last Node in list
    if(head == null || head.next == null){
        return head;
    }
    //Recursive call
    Node n = Reverse(head.next);
    //Swap the list - make nextNode.next = currNode
    head.next.next = head;
    //make currNode.next = null
    head.next = null;
    //Return NextNode
    return n;
}
