package org.java.design_patterns.iterator;

public class Client {

	public static void main(String[] args) {
		Menu arrMenu = new ArrayMenu();
		Menu vecMenu = new VectorMenu();
		
		Iterator arrIterator = arrMenu.createIterator();
		Iterator vecIterator = vecMenu.createIterator();

		Waitress w = new Waitress();
		
		w.addIterator(arrIterator);
		w.addIterator(vecIterator);

		w.printMenu();

	}
}
