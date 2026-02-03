package LL;

public class Linked {
    private Node head;
    private  Node tail;

    // structure of LL
    private  class Node{


        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addEle(int val){
        //to add ele at a first
        Node node = new Node(val);
        node.next = head;
        head = node;
        //if list is empty
        if(tail==null){
            tail = head;
        }
    }
    public void addLast(int val){
       //if list is empty
        if(tail == null){
            addEle(val);
            return;
        }

        //to add ele at a last // refer notes for clr exp
        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }


    public void addMid(int val,int index){
        //edge cases
        if(index == 0 ){
            addEle(val);
        }

        Node temp = head;
        //traverse till needed index
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        //insert a new node
        Node node = new Node(val,temp.next);
        temp.next = node;
    }
}
