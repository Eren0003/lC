package org.example;

import java.util.*;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        node.next = new ListNode(1);
        node.next.next = new ListNode(8);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(9);
        ListNode node2 = new ListNode(3);
        node2.next = new ListNode(5);
//        node2.next.next = new ListNode(3);
//        node2.next.next.next = new ListNode(4);
//        node2.next.next.next.next = new ListNode(5);
//        node2.next.next.next.next.next = new ListNode(6);
        print(reverseLinkedListII(node2,1,1));
//        print(palindromeList);

    }
    static int size(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
    static  void print(ListNode head){
        ListNode curr =  head;
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    static ListNode reverseLinkedList(ListNode head) {
            ListNode prev = null;
            while(head != null){
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
    }
    static ListNode reverseUsingQueue(ListNode head){
        ListNode result = null;
        Queue<Integer> queue = new LinkedList<>();
        while(head != null){
            queue.add(head.val);
            head = head.next;
        }
        while(!queue.isEmpty()){
            ListNode temp = result ;
            result = new ListNode(queue.poll());
            result.next = temp;
        }
        return result;
    }
    static ListNode mergeTwoList(ListNode list1 , ListNode list2){
        ListNode list = new ListNode();
        ListNode result = list;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val) {
                result.next = list1;
                list1 = list1.next;
            }else{
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        if(list1 == null){
            result.next = list2;
        }else{
            result.next = list1;
        }
        return list.next;
    }
    static ListNode removeDuplicate(ListNode head){
        ListNode temp1 = null;
        ListNode curr = head;
        while(curr != null){
            if(temp1 != null && temp1.val == curr.val){
                curr = curr.next;
                temp1.next = curr;
            }else{
                temp1 = curr;
                curr = curr.next;
            }
        }
        return head;
    }
    static ListNode removeDuplicateN(ListNode head){
        ListNode curr = head;
        while(curr != null){
            if(curr.next != null  && curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
    static boolean palindromeList(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        while(prev != null){
            if(!(head.val == prev.val)){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;

    }
    static void reorderList(ListNode head){
        print(head);
        ListNode tempHead = new ListNode();
        ListNode temp = tempHead;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            temp.next = slow;
            slow = slow.next;
            fast = fast.next.next;
            temp = temp.next;
        }
        slow = slow.next;
        ListNode prev = null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        temp.next.next = null;
        head = new ListNode(tempHead.next.val);
        tempHead = tempHead.next;
        ListNode result = head;
        boolean flag = false;
        while(prev != null || tempHead != null){
            if(flag && tempHead != null){
                result.next = new ListNode(tempHead.val);
                tempHead = tempHead.next;
                flag = false;
            }else{
                result.next = new ListNode(prev.val);
                prev = prev.next;
                flag = true;
            }
            result = result.next;
        }
        print(head);
    }
    static ListNode getIntersectionNode (ListNode headA , ListNode headB){
       ListNode tempA = reverseLinkedList(headA);
       ListNode tempB = reverseLinkedList(headB);
       ListNode result = new ListNode();
       ListNode temp = result;
       while(tempA != null && tempB != null){
           if(tempA.val == tempB.val ){
               temp.next = new ListNode(tempA.val);
               temp = temp.next;
           }else {
               break;
           }
           tempA = tempA.next;
           tempB = tempB.next;
       }
       return reverseLinkedList(result.next);
    }

    static void reorderListUsingArray(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int start = 1 ;
        int end = list.size()-1;
        ListNode temp1 = head;
        boolean flag = false;
        while(start <= end){
            if(flag) {
                temp1.next = new ListNode(list.get(start));
                flag = false;
                start++;
            }else{
                temp1.next = new ListNode(list.get(end));
                flag = true;
                end--;
            }
            temp1 = temp1.next;
            print(head);
        }
    }
    static int twinSum(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        print(slow);
        ListNode temp = reverseLinkedList(slow);
        int max = Integer.MIN_VALUE;
        while(temp != null){
            max = Integer.max(temp.val+head.val,max);
            System.out.println(temp.val+head.val);
            temp = temp.next;
            head = head.next;
        }
        return max;
    }
    static ListNode rotateRight(ListNode head, int k){
        int size = 0;
        ListNode len = head;
        ListNode temp = head;
        ListNode first = head;
        if(len == null) return head;
        while(len.next != null){
            len = len.next;
            size++;
        }
        if(size == 1) return head;
        size++;
        if(k >= size){
            k = k % size;
        }
        k = size - k;
        int counter = 0;
        while(k != counter){
            counter++;
            if(counter == k){
                head = temp.next;
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        len.next = first;
        return head;
    }
    static ListNode removeNthFromNode (ListNode head,int n){
        ListNode result = new ListNode();
        ListNode list = result;
        ListNode temp = head;
        int size = 0 ;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        n = size - n;
        ListNode loop = head;
        int counter = 0 ;
        while(loop != null){
            if(counter == n){
                loop = loop.next;
                counter++;
            }else {
                counter++;
                list.next = new ListNode(loop.val);
                loop = loop.next;
                list = list.next;
            }
        }
        return result.next;
    }
    static ListNode swapNodes(ListNode head,int k){
        int size = 0 ;
        ListNode len = head;
        while(len != null){
            len = len.next;
            size++;
        }
        int first = k;
        int last = size - k + 1;
        ListNode temp = head;
        int firstNum = 0;
        int lastNum = 0 ;
        int counter = 0;
        while(temp != null){
            counter++;
            if(counter == first) {
                firstNum = temp.val;
            }if(counter == last){
                lastNum = temp.val;
            }
            temp = temp.next;
        }
        counter = 0;
        ListNode result = new ListNode();
        ListNode tem = result;
        while(head != null){
            counter++;
            if(counter == first){
               tem.next = new ListNode(lastNum);
            }else if(counter == last) {
                tem.next = new ListNode(firstNum);
            }else{
                tem.next = head;
            }
            tem = tem.next;
            head = head.next;
        }
        return result.next;
    }
    static ListNode reverseLinkedListII(ListNode head , int left , int right){
        ListNode size = head;
        int len = 0;
        while(size != null){
            size = size.next;
            len++;
        }
        if(len == 1) return head;
        ListNode temp = head;
        ListNode reverse = head;
        ListNode end = head;
        int counter = 0;
        while(temp != null){
            counter++;
            if(counter == left){
                reverse = temp;
            }
            else if(counter == right){
                end = temp.next;
                temp.next = null;
            }
            temp = temp.next;
        }
        ListNode reversed = null;
        while(reverse != null){
            ListNode next = reverse.next;
            reverse.next = reversed;
            reversed = reverse;
            reverse = next;
        }
        ListNode temp1 = head;
        counter = 1;
        while(temp1 != null){
            counter++;
            if(counter == left){
                temp1.next = reversed;
            }
            if(temp1.next == null){
                break;
            }
            temp1 = temp1.next;
        }
        temp1.next = end;
        return head;
    }
}
