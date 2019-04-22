package org.java.design_patterns.iterator;

public class ArrayMenuIterator implements Iterator {
	MenuItem[] items;
	int position;
	
	public ArrayMenuIterator(MenuItem[] items) {
		this.items = items;
		init();
	}
	
	@Override
	public void init() {
		this.position = items.length - 1;
	}
	
	@Override
	public MenuItem prev() {
		return items[position--];
	}

	@Override
	public boolean hasPrev(int position) {
		return items.length <= 0 || position < 0 ? false : true;
	}

	@Override
	public int getSize() {
		return items.length;
	}
}
