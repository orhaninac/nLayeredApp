package nLayeredApp;

import nLayeredApp.core.ArrayList.MyArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<Integer> myList=new MyArrayList<Integer>();
		
		myList.add(5);
		myList.add(4);
		myList.add(3);
		myList.getAll();
		myList.remove(4);
		myList.getAll();
		System.out.println(myList.contains(4));
	}

}
