package org.DSA.List.SingleLL;

public class LinkedList {
  //  LinkedList list;
  public Node head;
  public Node curr;
  public Node fast;
  public Node slow;

    public static Node concatenateTwoSortedLists(LinkedList l1, LinkedList l2) {
            Node temp=new Node(0);
            Node ptr=temp;
            Node a=l1.head;
            Node b=l2.head;
            while(a!=null&&b!=null) {
                if (a.data.compareTo(b.data) < 0) {
                    temp.next = a;
                    a = a.next;
                } else {
                    temp.next = b;
                    b = b.next;
                }
                temp=temp.next;
            }

                if (a!=null){
                    temp.next=a;
                }
                if (b!=null)
                    temp.next=b;

            return ptr;
    }

    public void insert(LinkedList list, int arr) {
        Node n = new Node(arr);
        if (head == null) {
            head=n;
            curr = head;
        }
        else{
            curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=n;
//            curr=curr.next;
        }
    }

    public void display(LinkedList list){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public void reverseList(LinkedList list) {
        Node prev=null;
        Node cur=head;
        Node next=cur;

        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }

    public void createCycle(LinkedList l, int pos){
       // Node n = new Node(60);
        Node temp = head;
        int p=1;
        Node cur=null;

        if (head.next==null)
            return;

        while(temp.next!=null){
            if (p==pos){
                cur=temp;
            }

            temp=temp.next;
            p++;

        }

        if (cur!=null){
            temp.next=cur;
        }
    }

    public Boolean detectCycle(LinkedList ll){
        if (head.next==null)
            return false;
        fast = head;
        slow = head;

//        while(fast.next!=null){
//            if (fast==slow){
//                return true;
//            }
//            else{
//                if (fast.next.next!=null) {
//                    fast = fast.next.next;
//                    slow = slow.next;
//                }
//                else
//                    fast=fast.next;
//            }
//        }
        while(fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if (fast==slow)
                return true;
        }
        return false;
    }

    public boolean checkPalendrome(LinkedList ll) {
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp = head;
        Node ori = temp;
        head=slow;
        ll.reverseList(ll);
        while(temp!=slow){
            if (temp.data!= head.data){
                head=ori;
                return false;}
            else {
                temp=temp.next;
                head=head.next;
            }
        }
        head=ori;
        return true;
    }

    public Node returnNodeFromLast(LinkedList l, int pos){
        if (pos==1&&head.next==null)
            return head;

        int count=0;
        Node refptr=head;
        Node mainptr=head;
        while(count<pos){
            refptr=refptr.next;
            count++;
        }

        while(refptr!=null){
            refptr=refptr.next;
            mainptr=mainptr.next;
        }
        return mainptr;
    }

//  remove duplicates from sorted list
    public LinkedList removeDuplicate(LinkedList l) {
//        Node ref = head.next;
//        Node prev = head;
//        while (ref != null) {
//            if (ref.data == prev.data) {
//                while (ref != null && ref.data == prev.data) {
//                    ref = ref.next;
//                }
//                if (ref != null)
//                    prev.next = ref;
//                else {
//                    prev.next = null;
//                    return l;
//                }
//            }
//            ref = ref.next;
//            prev = prev.next;
//        }
//        simple way
        Node current = head;
        while(current!=null&&current.next!=null){
            if (current.data==current.next.data){
                current.next=current.next.next;
            }
            else
            current=current.next;
        }
            return l;
    }
//    To detect at whivh node the cycle began
    public int detectCycleNode(LinkedList l){
        Node temp=head;

        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return (int) temp.data;
    }
//      remove cycle from loust
    public void removeCycle(LinkedList l) {
        Node temp=head;
        l.detectCycle(l);

        while(slow.next!=temp.next){
            temp = temp.next;
            slow=slow.next;
        }

        slow.next=null;
    }

    public LinkedList add(LinkedList l1, LinkedList l2) {
        int carry=0;
        Node a=l1.head;
        Node b=l2.head;
        LinkedList l = new LinkedList();
        while(a!=null||b!=null){
            int x=(a!=null)? (int) a.data : 0;
            int y=(b!=null)? (int) b.data :0;
            int sum=carry+x+y;
            carry=sum/10;
            l.insert(l,sum%10);
            if (a!=null)
            a=a.next;
            if (b!=null)
            b=b.next;
        }

        if (carry>0){
            l.insert(l,carry);
        }
        return l;
    }
}
