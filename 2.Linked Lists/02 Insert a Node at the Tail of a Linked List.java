/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {

    Node n = new Node();
    n.data = data;
    n.next = null;
    
    if(head == null){
        head = n;
    }else{
        Node x = head;
        while(x.next != null){
            x = x.next;
        }
        x.next = n;
    }
    
    return head;   
  
}
