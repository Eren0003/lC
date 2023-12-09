package org.example.Linked;

public class LL {
    private Node head ;
    private Node tail;
    private int size;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;

    }
    public void reverseLL(){
        Node node = head;

    }
    public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return ;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i < index ; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size += 1;
    }
    public void display (){
        Node temp = head;
       while (temp!= null){
           System.out.print(temp.val + "-->");
           temp = temp.next;
       }
       System.out.println("END");
    }
    public void removeLLElement(int val){
        Node node = head;
        while(node != null){
            if(head.val == val && node == head){
                head = head.next;
                node = head;
                continue;
            }
            if(node.next == null)break;
            if(node.next.val == val){
                node.next = node.next.next;
                continue;
            }
            node = node.next;
        }
    }
    public String reverseTwoDigit(int left , int right){
        Node node = head;
        int leftVal = 0 ;
        int leftCounter = 0 ;
        int rightVal = 0 ;
        int counter = 1 ;
        while(node != null){
            if(counter == left){
                leftVal = node.val;
                leftCounter = counter;
            }
            else if(counter == right){
                rightVal = node.val;
                node.val = leftVal;
               break;
            }
            counter++;
            node = node.next;
        }
        Node temp = head;
        for(int i = 1 ; i <= leftCounter ; i++){
            if(i == leftCounter){
                temp.val = rightVal;
                break;
            }
            temp = temp.next;
        }
        return leftVal+" "+rightVal+" "+leftCounter;
    }
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }public void mergeTwoLists(Node list1, Node list2) {
        Node answer = new Node();
        while(list1 != null || list2 != null){
            if(list1 == null){
                answer.next = list2;
                list2 = list2.next;
                answer = answer.next;
            }else if(list2 == null){
                answer.next = list1;
                list1 = list1.next;
                answer = answer.next;
            }else if(list1.val == list2.val){
                answer.next = list1;
                answer = answer.next;
                answer.next = list2;
                answer = answer.next;
                list1 = list1.next;
                list2 = list2.next;
            }else if(list1.val < list2.val){
                answer.next = list1;
                list1 = list1.next;
                answer = answer.next;
            }else{
                answer.next = list2;
                list2 = list2.next;
                answer = answer.next;
            }
        }
        return ;
    }
    public int get(int index){
        Node node = head;
        for(int i = 0 ; i < index ; i++){
            node = node.next;
        }
        return node.val;
    }
    public int getSize(){
        Node node = head;
        int size = 0;
        while(node != null){
            node = node.next ;
            size++;
        }
        return size;
    }
    public int deleteLast(){
        int size = getSize();
        int val = 0;
        if(size == 1){
            val = head.val;
            head = null;
            tail = null;
        }
        else {
            Node node = head;
            for (int i = 1; i < size - 1; i++) {
                node = node.next;
            }
            val = node.next.val;
            tail = node;
            tail.next = null;
        }
        return val;
    }
    public LL() {
        this.size = 0 ;
    }

    public class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node() {

        }
    }
}
