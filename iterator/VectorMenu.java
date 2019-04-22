package org.java.design_patterns.iterator;

import java.util.Vector;

public class VectorMenu implements Menu{
	Vector<MenuItem> items;
	
	public VectorMenu() {
		items = new Vector<>();
		
		addMenuItem(new MenuItem("딸기 스무디", "딸기와 얼음을 갈아만든 음료", 2.21));
		addMenuItem(new MenuItem("계란말이", "계란이 들어간 반찬", 2.21));
		addMenuItem(new MenuItem("김치볶음밥", "매콤한 메인요리", 4.33));
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
