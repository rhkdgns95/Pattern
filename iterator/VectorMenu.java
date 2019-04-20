package org.java.design_patterns.iterator;

import java.util.Vector;

public class VectorMenu implements Menu{
	Vector<MenuItem> items;
	
	public VectorMenu() {
		items = new Vector<>();
		addMenuItem(new MenuItem("수박", "달달함", 4.33));
		addMenuItem(new MenuItem("사과", "과즙가득", 2.21));
		addMenuItem(new MenuItem("포도", "포도향가득", 1.71));
	}
	
	public void addMenuItem(MenuItem item) {
		this.items.add(item);
		
//		this.items.addElement(item);
	}
	@Override
	public Iterator createIterator() {
		return new VectorMenuIterator(items);
	}
	
}
