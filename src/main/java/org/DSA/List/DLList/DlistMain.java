package org.DSA.List.DLList;

public class DlistMain {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Dlist list = new Dlist();
		/*for( int i = 0; i<arr.length; i++) {
			list.build(list, arr[i] );
		}*/

        //to insert at the end
        list = list.insertEnd(list, 60);
        list = list.insertEnd(list, 70);
        list = list.insertEnd(list, 90);
        //list.print(list);

        //to insert at a given pos
        int pos = 1;
        list = list.insertAtPos(list, pos, 80);
        list.print(list);
    }
}
