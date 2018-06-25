import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
  Node next = null;
  int data;

  Node(int d) {
    data = d;
  }
}

class MainApp {

  public static void main(String args[]) {

    Node first = new Node(10);
    LinkList l1 = new LinkList();

    // create link list
    Node head = l1.createList(first);

    // Insert to tail
    l1.insertToTail(head, 60);

    // Delete head node from link LinkList
    l1.deleteNode(head, 10);

    // Delete middle node
    l1.deleteNode(head, 30);

    // Delete node not present in LinkList.
    l1.deleteNode(head, 100);

    // Delete node without head node given.



  }

}

// ######################## Linklist helper method class #####################################

class LinkList {

  public static void printLinkedList(Node head) {

    Node current = head;

    while(current.next != null) {
      System.out.print(" " + current.data + "->");
      current = current.next;
    }
    System.out.print(" " + current.data);
    System.out.println("");
  }

  public static Node createList(Node head) {
      System.out.println("Creating new list...");
      // Node first = new Node(10);
      Node current = head;
      Node second = new Node(20);
      Node third = new Node(30);
      Node fourth = new Node(40);
      Node fifth = new Node(50);
      //Node head = first;
      head.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;
      fifth.next = null;
      printLinkedList(current);
      return current;
  }

  public static void insertToTail(Node head, int data) {
      System.out.println("Inserting to tail of existing list...");
      Node current = head;

      while(current.next != null) {
        current = current.next;
      }
      Node newNode = new Node(data);
      current.next = newNode;
      newNode.next = null;
      printLinkedList(head);

  }

  public static void deleteNode(Node head, int data) {
      System.out.println("Deleting " + data + " from existing list...");
      Node current = head;
      // deleting head
      if (current.data == data) {
        head = head.next;
        printLinkedList(head);
        return;
      }

      while(current.next != null) {
        if (current.next.data != data) {
          current = current.next;
        } else {
          current.next = current.next.next;
          printLinkedList(head);
          return;
        }
      }
      throw new RuntimeException("No data found for deletion...");
  }
}
