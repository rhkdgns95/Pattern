package org.java.design_patterns.iterator;

import java.util.ArrayList;

enum Week { Monday, Tuesday, Wednesday, Thursday, Friday, Saturday ,Sunday};

public class Waitress {

	ArrayList<Iterator> iterators;
	Week[] WEEK = Week.values();
	
	
	public Waitress() {
		iterators = new ArrayList<>();
	}

	public void addIterator(Iterator iterator) {
		iterators.add(iterator);
	}

	public void printMenu() {
		int weekIdx;
		for(int i = 0; i< 7; i++) {
			weekIdx = i % iterators.size();
			System.out.println(WEEK[i]);
			printMenu(iterators.get(weekIdx));
		}
//		for (int i = 0; i < iterators.size(); i++) {
//			printMenu(iterators.get(i));
//			
//		}
	}

	public void printMenu(Iterator menuIterator) {
		int position = menuIterator.getSize() - 1;
		menuIterator.init();
		
		while (menuIterator.hasPrev(position)) {
			MenuItem menu = (MenuItem) menuIterator.prev();
			System.out.println("$"+ menu.getPrice()+ "\t"+ menu.getTitle() + "("+ menu.getDescription()+ ")");
			
			position--;
		}
	}
}
