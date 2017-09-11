/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    int totalNumOfNodes = 0;
    Node node = head;
    
    while(node.next != null){
        node = node.next;
        totalNumOfNodes++;
    }
    
    int diff = totalNumOfNodes - n;
    
    while(diff != 0){
        head = head.next;
        diff--;
    }
    
    return head.data;
}
