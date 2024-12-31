package org.DSA.List.SingleLL;

public class LlMainClass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		/*int arr[] = {10,20,30,40,50};
		LinkedList list= new LinkedList();
		for( int i=0; i<arr.length; i++) {
			list = list.insert(list, arr[i]);
		}
		/*list = list.insert(list, 10);
		list = list.insert(list, 20);
		list = list.insert(list, 30);
		list = list.insert(list, 50);*/

		/*list.print(list);
		//delete at the end
		System.out.println("after deletion");
		list = list.delete(list);
		list.print(list);
		//delete at beginning
		System.out.println("after deletion beginning");
		list = list.deletebeginning(list);
		list.print(list);

		//delete at given position
		int ar[] = {10,20,30,40,50};
		LinkedList list1= new LinkedList();
		for( int i=0; i<ar.length; i++) {
			list1 = list1.insert(list1, ar[i]);
		}
		System.out.println("new list");
		list1.print(list1);
		System.out.println("after deletion given pos");
		int pos = 3;
		list1 = list1.deleteMiddle(list1, pos);
		list1.print(list1);*/

        //insert at pos
        /*int a[] = {60, 70, 90};
        LinkedList l = new LinkedList();
        for( int i=0; i<a.length; i++) {
            l = l.insert(l, a[i]);
        }
        System.out.println("insert pos");
        l.print(l);
        int p = 4;
        l = l.insertAtPos(l, p, 80);
        System.out.println("after inserting at pos");
        l.print(l);*/

        //sort
		/*System.out.println("sort list");
		int sort[] = { 30,10, 50,60,5,100,20};
		LinkedList l1 = new LinkedList();
		for( int i=0; i<sort.length; i++) {
			l1 = l1.insert(l1, sort[i]);
		}
		l1 = l1.sort(l1);
		System.out.println("after sorting");
		l1.print(l1);*/

        //LeetCode problems
        int head[] = {1, 2, 3, 4, 5};
        LinkedList list = new LinkedList();
        for (int i=0;i< head.length;i++){
            list.insert(list, head[i]);
        }
        list.display(list);
        System.out.println("reverese of list");
        list.reverseList(list);
        list.display(list);
        System.out.println("insert again");
        list.insert(list,6);
        list.display(list);
    }
}
