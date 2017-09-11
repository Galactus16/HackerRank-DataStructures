/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    Node n = new Node();
    n.data = data;
    
    if(head == null || position == 0){    
        n.next = head;
        head = n;
    }else{
        position--;
        Node tempNode = head;
        while(position > 0){
            tempNode = tempNode.next;
            position--;
        }
        n.next = tempNode.next;
        tempNode.next = n;
    }
    return head;
}
