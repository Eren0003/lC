package org.example.Linked;

public class Main {
    public static void main(String[] args) {
        LL linkedList2 = new LL();
        LL linkedList1 = new LL();
        LL linkedList = new LL();

        linkedList1.insertFirst(4);
//        linkedList1.insertFirst(3);
        linkedList1.insertFirst(2);
//        linkedList.insertFirst(7);
//        linkedList.insertFirst(7);
//        linkedList.insertFirst(7);
//        linkedList.insertFirst(0);
//        linkedList.insertLast(7);
//        linkedList.insert(7,2);
        linkedList1.insert(1,0);
        linkedList2.insertFirst(4);
        linkedList2.insertFirst(3);
//        linkedList2.insertFirst(2);
        linkedList2.insert(1,0);
//        System.out.println("LAST-"+linkedList.deleteLast());
//        System.out.println("INDEX-4-"+linkedList.get(4));
//        System.out.println("SIZE-"+linkedList1.getSize());
//        linkedList.display();
//        System.out.println(linkedList.reverseTwoDigit(2,4));
//        linkedList.removeLLElement(7);
//        linkedList.mergeTwoLists(linkedList1,linkedList2);
        linkedList1.display();
        linkedList2.display();
    }
}
