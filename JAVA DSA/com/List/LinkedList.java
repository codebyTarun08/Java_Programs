package com.List;
public class Node{
    int data;
    public Node next;
    
    public Node(int data){
     this.data=data;
     this.next=null;
    }
 }

public class LinkedList {
    public Node head;
    public int size;

    public LinkedList(){
        this.size=0;
    }
    
    public void addFirst(int x){
        Node newNode=new Node(x);
        size++;
        if(head==null){
          head=newNode;
          return;
        }
        newNode.next=head;
        head=newNode;    
    }

    public void addLast(int x){
        Node newNode=new Node(x);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node currtNode=head;
        while(currtNode.next != null){
            currtNode=currtNode.next;
        }
        currtNode.next=newNode;
    }

    public void printList(){
        Node p=head;
        while(p!=null){
            System.out.print(p.data + "->");
            p=p.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if(head==null){
           System.out.println("List is empty");
           return;
        }
        head=head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node currtNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            currtNode=currtNode.next;
        }
        currtNode.next=null;
    }

    public int getSize(){
        return size;
    }

    public void deleteAnyElement(int element){
        if(head==null){
            System.out.println("list is empty");
        }
        Node currtNode=head;
        Node lastNode=head.next;
        while(lastNode.data!=element){
            lastNode=lastNode.next;
            currtNode=currtNode.next;
        }
        currtNode.next=lastNode.next;
        lastNode.next=null;
    }

    public int linearSearch(int target){
        for(int i=1;i<size;i++){
            if(target==head.data){
                return 1;
            }
           head=head.next;
        }
     return 0;
    }

    public int isSorted(){
        Node currtNode=head;
        int x=Integer.MIN_VALUE;
        while(currtNode!=null){
          if(currtNode.data>x)
                    return 0;
          x=currtNode.data;
          currtNode=currtNode.next;
        }
        return 1;
    }
    public void ConcateList(LinkedList m, LinkedList n) {
        Node p = m.head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = n.head; // Link the last node of list m to the head of list n
        n.head = null; // Set the head of list n to null
    }
    
    // public void ConcateList(LinkedList m,LinkedList n){
    //     Node p=m.head;
    //     while(p.next !=null){
    //         p=p.next;
    //     }
    //     p.next=n.head;
    //     n.head=null;
    // }

    public static void main(String[] args) {
        // LinkedList l=new LinkedList();
        // l.addFirst(20);
        // l.addFirst(10);
        // l.printList();
        // // System.out.println("");
        // System.out.println("size: "+ l.getSize());

        // l.addLast(30);
        // l.addLast(40);
        // l.printList();
        // // System.out.println("");
        // System.out.println("size: "+ l.getSize());

        // l.deleteFirst();
        // l.printList();
      
        // System.out.println("size: "+ l.getSize());
        // l.deleteLast();
        // l.printList();
        // // System.out.println("");
        // System.out.println("size: "+ l.getSize());

        // l.addLast(46);
        // l.addFirst(66);
        // l.addLast(45);
        // l.addLast(76);
        // l.printList();
        // // l.deleteAnyElement(45);
        // // l.printList();
        // System.out.println(l.linearSearch(49));
        // System.out.println("isSorted: "+l.isSorted());


        System.out.println("Concatenation operation on 2 linkedlist.");
        LinkedList l1=new LinkedList();
        l1.addLast(10);
        l1.addLast(20);
        l1.addLast(30);
        l1.addLast(40);
        l1.addLast(50);
        System.out.println("List 1:");
        l1.printList();

        LinkedList l2=new LinkedList();
        l2.addLast(5);
        l2.addLast(15);
        l2.addLast(25);
        l2.addLast(35);
        l2.addLast(45);
        LinkedList l3=new LinkedList();
        l3.ConcateList(l1, l2);
        l3.printList();
    }
}